package com.jalja.es.es;

import java.io.IOException;
import java.util.Properties;

public class EsPropertiesUtil {
	//集群名称
	public static String ES_CLUSTER_NAME=null;
	//集群地址
	public static String ES_CLUSTER_ADDR=null;
	//集群登陆账号
	public static String ES_USER_NAME=null;
	//集群登陆密码
	public static String ES_PASSWORD=null;
	
	private static Properties properties=null;
	private EsPropertiesUtil () {
		
	}
	public static void getEsPropertiesUtil(Class<?> cl,String esPropertiePath) {
		if(properties==null) {
			properties=new Properties();
			try {
				if(esPropertiePath==null || esPropertiePath.equals("")) {
					properties.load(cl.getClassLoader().getResourceAsStream("es.properties"));
				}else {
					properties.load(cl.getResourceAsStream(esPropertiePath));
				}
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("读取配置文件异常");
			}
		}
		ES_CLUSTER_NAME=properties.getProperty("ES_CLUSTER_NAME");
		ES_CLUSTER_ADDR=properties.getProperty("ES_CLUSTER_ADDR");
		ES_USER_NAME=properties.getProperty("ES_USER_NAME");
		ES_PASSWORD=properties.getProperty("ES_PASSWORD");
	}
}
