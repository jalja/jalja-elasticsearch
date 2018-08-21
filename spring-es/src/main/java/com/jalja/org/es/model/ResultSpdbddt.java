package com.jalja.org.es.model;

import com.alibaba.fastjson.annotation.JSONField;

public class ResultSpdbddt {
	@JSONField(name = "t_loan_status|apply_id")
	private Long loanApplyId;
	
	@JSONField(name = "t_loan_apply|department_name")
	private String departmentName;
	
	
	@JSONField(name = "t_loan_apply|apply_time")
	private String applyTime;


	public Long getLoanApplyId() {
		return loanApplyId;
	}


	public void setLoanApplyId(Long loanApplyId) {
		this.loanApplyId = loanApplyId;
	}


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	public String getApplyTime() {
		return applyTime;
	}


	public void setApplyTime(String applyTime) {
		this.applyTime = applyTime;
	}
	
	
}
