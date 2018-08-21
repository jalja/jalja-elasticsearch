package com.jalja.es.es;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

public class ElasticsearchClient {
    private volatile static Client client=null;
    
    private ElasticsearchClient() {
    	
    }
    public static Client  getClient(Class<?> cl) {
    	if(client==null) {
    		synchronized (ElasticsearchClient.class) {
    			if(client==null) {
    				EsPropertiesUtil.getEsPropertiesUtil(cl,null);
        		    try {
        	            Settings settings = Settings.settingsBuilder().put("cluster.name",EsPropertiesUtil.ES_CLUSTER_NAME).put("client.transport.sniff", true). build();
        	            TransportClient transportClient = TransportClient.builder().settings(settings).build();
        	            getInetSocketTransportAddress(transportClient,EsPropertiesUtil.ES_CLUSTER_ADDR);
        	            client = transportClient;
        	        }catch (Exception e){
        	            e.printStackTrace();
        	        }
    			}
			}
    	}
    	return client;
    }
    private static void getInetSocketTransportAddress(TransportClient transportClient,String addr) throws UnknownHostException {
    	if(addr==null) {
    		throw new  RuntimeException("ES_CLUSTER_ADDR不能为空");
    	}
    	String [] addrs=addr.split(",");
    	InetSocketTransportAddress address=null;
    	String path=null;
    	for(int i=0;i<addrs.length;i++) {
    		path=addrs[i];
    		address=new InetSocketTransportAddress(InetAddress.getByName(path.split(":")[0]), Integer.valueOf(path.split(":")[1]));
    		transportClient.addTransportAddress(address);
    	}
    	System.out.println("transportClient:"+transportClient.hashCode());
    }
}
