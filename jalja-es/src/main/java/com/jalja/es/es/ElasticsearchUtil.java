package com.jalja.es.es;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.search.SearchHit;
import com.alibaba.fastjson.JSON;
import com.jalja.es.freemarker.EsTemplateUtil;
import com.jalja.es.utils.MapObjUtil;

public class ElasticsearchUtil {
    private static Client client=null;
    private static SearchRequestBuilder seBuilder=null;
    private static SearchRequestBuilder getESBuilder(Class<?> cl,String esIndex,String esTyoe) {
    	client=ElasticsearchClient.getClient(cl);
    	seBuilder= client.prepareSearch(esIndex).setTypes(esTyoe);
    	return seBuilder;
    }
    /**
     * 
     * @param esIndex es index
     * @param esTyoe   es Type
     * @param resultClass 出参类型
     * @param esFtl  es查询模板
     * @param obj   入参
     * @return
     * @throws Exception
     */
    public static ESResult getESResult(String esIndex,String esTyoe,Class<?> resultClass,String esFtl,Object obj) throws Exception{
    	String str=EsTemplateUtil.getTemplateStr(esFtl, obj);
    	ESResult result=new ESResult();
    	result.setTotal(0);
    	result.setLists(null);
    	SearchResponse re =getESBuilder(resultClass,esIndex,esTyoe).setQuery(str).execute().actionGet();
    	if(re==null || re.getHits().getTotalHits()==0) {
    		return result;
    	}
    	result.setTotal(re.getHits().getTotalHits());
    	SearchHit[] sh=re.getHits().getHits();
    	List<Map<?,?>> listMap=new ArrayList<>();
	   	for(int i=0;i<sh.length;i++) {
	   		listMap.add(sh[i].getSource());
	   	}
	   	result.setLists(MapObjUtil.mapToJsonObj(listMap, resultClass));
	   	System.out.println(String.format(Thread.currentThread().getName()+"查询结果:%s",JSON.toJSONString(result)));
    	return result;
    }
}
