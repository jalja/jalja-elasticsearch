package com.jalja.org.es.service;

import org.springframework.stereotype.Service;

import com.jalja.es.es.ESResult;
import com.jalja.es.es.ElasticsearchUtil;
import com.jalja.org.es.model.ParamSpdbddtQuery;
import com.jalja.org.es.model.ResultSpdbddt;

@Service
public class SpdbddtService {

	public ESResult getESResult(Long applyId) throws Exception {
		 ParamSpdbddtQuery paramSpdbddtQuery=new ParamSpdbddtQuery();
		 paramSpdbddtQuery.setLoanApplyId(applyId);
		 ESResult esResult=ElasticsearchUtil.getESResult("fcarorderall", "orderall",ResultSpdbddt.class,"es.ftl", paramSpdbddtQuery);	
		 return esResult;
	}
}
