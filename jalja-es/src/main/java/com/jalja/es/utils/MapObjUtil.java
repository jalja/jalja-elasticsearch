package com.jalja.es.utils;


import java.util.List;
import java.util.Map;
import org.apache.commons.beanutils.BeanMap;
import org.apache.commons.beanutils.BeanUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

public class MapObjUtil {
	public static Map<?, ?> objectToMap(Object obj) {  
        if(obj == null) {
        	   return null;   
        }  
        return new BeanMap(obj);  
    }
	public static <T> T mapToObject(Map<String, Object> map, Class<?> beanClass) throws Exception {    
        if (map == null) {
        	return null;  	        	
        } 
        T obj = (T) beanClass.newInstance();  
        BeanUtils.populate(obj, map);  
        return obj;  
    }
	public static <T> List<T> mapToJsonObj(List<Map<?,?>> map, Class<?> beanClass) throws Exception {    
        if (map == null || map.isEmpty() ) {
        	return null;  	        	
        }  
        List<T> list=(List<T>) JSONArray.parseArray(JSON.toJSONString(map), beanClass);
        return list;  
    }

}  

