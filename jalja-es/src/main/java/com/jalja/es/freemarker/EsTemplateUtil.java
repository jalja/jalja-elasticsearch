package com.jalja.es.freemarker;

import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;

import com.jalja.es.utils.MapObjUtil;

import freemarker.core.JSONOutputFormat;
import freemarker.core.OutputFormat;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.utility.Constants;

public class EsTemplateUtil {
	private static  Configuration configuration;
	public static String getTemplateStr(String esFtl,Object obj) throws Exception {
		Map<String,Object> map=(Map<String, Object>) MapObjUtil.objectToMap(obj);
		configuration=FreemarkerConfig.getConfiguration(EsTemplateUtil.class,"/templates");
		Template template=configuration.getTemplate(esFtl);
		Writer out=new StringWriter(2048);
		template.process(map,out);
		System.out.println("ES查询语句："+out.toString());
		return out.toString();
	} 
}
