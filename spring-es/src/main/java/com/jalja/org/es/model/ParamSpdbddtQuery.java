package com.jalja.org.es.model;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class ParamSpdbddtQuery {
	private static final long serialVersionUID = 1L;
    /**id **/
    private Long id;
    /**申请单id **/
    
    @JSONField(name = "t_loan_status|apply_id")
    private Long loanApplyId;
    /**单笔贷款申请流水号 **/
    private String spdbddtApplyNo;
    /**借据号 **/
    private String dueBillNo;
    /**授信合同编号 **/
    private String creditContractNo;
    /**申请人中文姓名拼音 **/
    private String customNameCh;
    /**教育程度（6—硕士及以上,4—大学,3—大专,1—高中及以下） **/
    private Integer education;
    /**准入校验结果代码  000000 表示校验通过否则表示不通过（其中SF0041 表示申请人未开户） **/
    private String accessVerificationRetcode;
    /**准入校验结果 0-不通过，1-通过 **/
    private Integer accessVerificationStatus;
    /**贷款申请结果代码  A01 审批中,A02 审批失败,A03 审批通过,A04 审批作废,C01 已签订,C02 贷款作废,C03 已放款,C04 已结清,C05 逾期 **/
    private String loanApprovalRetcode;
    /**贷款申请结果 1-通过 2-审批失败 3-审批作废 **/
    private Integer loanApprovalStatus;
    /**点贷通贷款申请时间 **/
   // private Date applyTime;
    /**点贷通贷款审批时间 **/
    private Date approvalTime;
    /**点贷通贷款放款时间 **/
    private Date loanTime;
    /**是否退车,0-否，1-是 **/
    private Integer isReturnCar;
    /**是否开户,0-否，1-是 **/
    private Integer isOpenAccount;
    /**是否签署授权征信书,0-否，1-是 **/
    private Integer isSignCreditLetter;
    /**征信授权书编号 **/
    private String creditLetterNo;
    /**征信授权书时间 **/
    private Date creditLetterTime;
    /**点贷通状态(1-待准入校验、2-准入校验不通过、3-待提交贷款申请、4-贷款申请不通过、5-待签合同、6-贷款申请已过期、7-待放款、8-还款中、9-已结清) **/
    private Integer status;
    /**点贷通异常状态(1-准入校验异常,2-订单推送失败,3-贷款申请提交失败,4-贷款审批异常,5-获取合同数据失败,6-合同签订失败) **/
    private Integer exceptionStatus;
    /**浦发二类账号 **/
    private String secondAccount;
    /**获批金额 **/
    private Integer approvalAmt;
    /**点贷通本金 **/
    private Integer spdbddtCapital;
    /**点贷通利息 **/
    private Integer spdbddtInterest;
    /**创建人 **/
    private Long createEmpId;
    /**创建时间 **/
    //private Date createTime;
    /**修改人 **/
    private Long modifyEmpId;
    /**修改时间 **/
    private Date modifyTime;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getLoanApplyId() {
		return loanApplyId;
	}
	public void setLoanApplyId(Long loanApplyId) {
		this.loanApplyId = loanApplyId;
	}
	public String getSpdbddtApplyNo() {
		return spdbddtApplyNo;
	}
	public void setSpdbddtApplyNo(String spdbddtApplyNo) {
		this.spdbddtApplyNo = spdbddtApplyNo;
	}
	public String getDueBillNo() {
		return dueBillNo;
	}
	public void setDueBillNo(String dueBillNo) {
		this.dueBillNo = dueBillNo;
	}
	public String getCreditContractNo() {
		return creditContractNo;
	}
	public void setCreditContractNo(String creditContractNo) {
		this.creditContractNo = creditContractNo;
	}
	public String getCustomNameCh() {
		return customNameCh;
	}
	public void setCustomNameCh(String customNameCh) {
		this.customNameCh = customNameCh;
	}
	public Integer getEducation() {
		return education;
	}
	public void setEducation(Integer education) {
		this.education = education;
	}
	public String getAccessVerificationRetcode() {
		return accessVerificationRetcode;
	}
	public void setAccessVerificationRetcode(String accessVerificationRetcode) {
		this.accessVerificationRetcode = accessVerificationRetcode;
	}
	public Integer getAccessVerificationStatus() {
		return accessVerificationStatus;
	}
	public void setAccessVerificationStatus(Integer accessVerificationStatus) {
		this.accessVerificationStatus = accessVerificationStatus;
	}
	public String getLoanApprovalRetcode() {
		return loanApprovalRetcode;
	}
	public void setLoanApprovalRetcode(String loanApprovalRetcode) {
		this.loanApprovalRetcode = loanApprovalRetcode;
	}
	public Integer getLoanApprovalStatus() {
		return loanApprovalStatus;
	}
	public void setLoanApprovalStatus(Integer loanApprovalStatus) {
		this.loanApprovalStatus = loanApprovalStatus;
	}
	public Date getApprovalTime() {
		return approvalTime;
	}
	public void setApprovalTime(Date approvalTime) {
		this.approvalTime = approvalTime;
	}
	public Date getLoanTime() {
		return loanTime;
	}
	public void setLoanTime(Date loanTime) {
		this.loanTime = loanTime;
	}
	public Integer getIsReturnCar() {
		return isReturnCar;
	}
	public void setIsReturnCar(Integer isReturnCar) {
		this.isReturnCar = isReturnCar;
	}
	public Integer getIsOpenAccount() {
		return isOpenAccount;
	}
	public void setIsOpenAccount(Integer isOpenAccount) {
		this.isOpenAccount = isOpenAccount;
	}
	public Integer getIsSignCreditLetter() {
		return isSignCreditLetter;
	}
	public void setIsSignCreditLetter(Integer isSignCreditLetter) {
		this.isSignCreditLetter = isSignCreditLetter;
	}
	public String getCreditLetterNo() {
		return creditLetterNo;
	}
	public void setCreditLetterNo(String creditLetterNo) {
		this.creditLetterNo = creditLetterNo;
	}
	public Date getCreditLetterTime() {
		return creditLetterTime;
	}
	public void setCreditLetterTime(Date creditLetterTime) {
		this.creditLetterTime = creditLetterTime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getExceptionStatus() {
		return exceptionStatus;
	}
	public void setExceptionStatus(Integer exceptionStatus) {
		this.exceptionStatus = exceptionStatus;
	}
	public String getSecondAccount() {
		return secondAccount;
	}
	public void setSecondAccount(String secondAccount) {
		this.secondAccount = secondAccount;
	}
	public Integer getApprovalAmt() {
		return approvalAmt;
	}
	public void setApprovalAmt(Integer approvalAmt) {
		this.approvalAmt = approvalAmt;
	}
	public Integer getSpdbddtCapital() {
		return spdbddtCapital;
	}
	public void setSpdbddtCapital(Integer spdbddtCapital) {
		this.spdbddtCapital = spdbddtCapital;
	}
	public Integer getSpdbddtInterest() {
		return spdbddtInterest;
	}
	public void setSpdbddtInterest(Integer spdbddtInterest) {
		this.spdbddtInterest = spdbddtInterest;
	}
	public Long getCreateEmpId() {
		return createEmpId;
	}
	public void setCreateEmpId(Long createEmpId) {
		this.createEmpId = createEmpId;
	}
	public Long getModifyEmpId() {
		return modifyEmpId;
	}
	public void setModifyEmpId(Long modifyEmpId) {
		this.modifyEmpId = modifyEmpId;
	}
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}
