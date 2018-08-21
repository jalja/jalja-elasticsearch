package com.jalja.org.es;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jalja.org.es.service.SpdbddtService;

public class SpringEsApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext("com.jalja.org.es");
		SpdbddtService service=context.getBean(SpdbddtService.class);
		Thread thread=null;
		for(int i=0;i<1000;i++) {
			final int m=i;
			 thread=new Thread(()->{
				try {
					//System.out.println("线程："+Thread.currentThread().getName());
					service.getESResult(44016L+m);
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
			 thread.setName("线程：name"+(44016L+m));
			 thread.start();
		}
	}
}
