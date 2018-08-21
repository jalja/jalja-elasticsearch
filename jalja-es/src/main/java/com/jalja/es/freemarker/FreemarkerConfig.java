package com.jalja.es.freemarker;



import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.Version;
public class FreemarkerConfig {
	private volatile static Configuration configuration=null;
	private FreemarkerConfig() {
		
	}
	public static Configuration getConfiguration(Class<?> cl,String templatePath) throws IOException {
		if(configuration==null) {
			synchronized (FreemarkerConfig.class) {
				if(configuration==null) {
					configuration=new Configuration (new Version("2.3.28"));
					configuration.setDefaultEncoding("UTF-8");
				    String path=cl.getResource(templatePath).toString();
				    path=path.substring(6, path.length());
					configuration.setDirectoryForTemplateLoading(new File(path));
				}
			}
		}
		return configuration;
	}
	private static Template getTemplate(Class<?> cl,String templatePath) throws Exception {
		configuration=getConfiguration(cl,templatePath);
		Template template=configuration.getTemplate("es.ftl");
		return template;
	}
	private static String getTemplateStr(Class<?> cl,String templatePath,Map<String,Object> map) throws Exception {
		Template template=getTemplate(cl,templatePath);
		Writer out=new StringWriter(2048);
		template.process(map,out);
		return out.toString();
	}
	
	public static void main(String[] args) throws Exception {
		Map<String,Object> map=new HashMap<>();
		map.put("fundsSource", 1);
		String str=getTemplateStr(FreemarkerConfig.class,"/templates",map);
		System.out.println(str);
	}
}
