package com.oversea.task.domain;

import java.io.Serializable;
import java.util.Date;

public class OrderAccount implements Serializable {

    private static final long serialVersionUID = 1461079111793654760L;

    private Integer accountId;

    private String accountType;

    private String deviceId;

    private String payAccount;

    private Long creditCardId;

    /**
     * 信用卡卡号:此字段是冗余过来
     */
    private String cardNo;
    
    /***
     * 信用卡安全码:此字段是冗余过来
     */
    private String suffixNo;

    private String loginPwd;

    private String payPwd;

    private Long identityMobile;

    private Double balanceWb;

    private Double balance;

    private Integer volume;

    private Integer threshDaily;

    private Integer threshMonthly;

    private Integer status;

    private String remark;

    private Integer cntPayed;

    private Float amtPayed;

    private Date createTime;

    private Date modifyTime;

    private String deviceIp;

    private String firstName;
    
    private String isPrime;
    
    private Long expressCompanyId;
    
    private Long payAccountId;
    
    private String rechargeMoney;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public void setDeviceIp(String deviceIp) {
        this.deviceIp = deviceIp;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getPayAccount() {
        return payAccount;
    }

    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount;
    }

    public Long getCreditCardId() {
        return creditCardId;
    }

    public void setCreditCardId(Long creditCardId) {
        this.creditCardId = creditCardId;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getPayPwd() {
        return payPwd;
    }

    public void setPayPwd(String payPwd) {
        this.payPwd = payPwd;
    }

    public Long getIdentityMobile() {
        return identityMobile;
    }

    public void setIdentityMobile(Long identityMobile) {
        this.identityMobile = identityMobile;
    }

    public Double getBalanceWb() {
        return balanceWb;
    }

    public void setBalanceWb(Double balanceWb) {
        this.balanceWb = balanceWb;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Integer getThreshDaily() {
        return threshDaily;
    }

    public void setThreshDaily(Integer threshDaily) {
        this.threshDaily = threshDaily;
    }

    public Integer getThreshMonthly() {
        return threshMonthly;
    }

    public void setThreshMonthly(Integer threshMonthly) {
        this.threshMonthly = threshMonthly;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getCntPayed() {
        return cntPayed;
    }

    public void setCntPayed(Integer cntPayed) {
        this.cntPayed = cntPayed;
    }

    public Float getAmtPayed() {
        return amtPayed;
    }

    public void setAmtPayed(Float amtPayed) {
        this.amtPayed = amtPayed;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getDeviceIp() {
        return deviceIp;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
    
	public String getSuffixNo() {
		return suffixNo;
	}
	
	public void setSuffixNo(String suffixNo) {
		this.suffixNo = suffixNo;
	}
	
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getIsPrime() {
		return isPrime;
	}

	public void setIsPrime(String isPrime) {
		this.isPrime = isPrime;
	}
	
	public Long getExpressCompanyId()
	{
		return expressCompanyId;
	}

	public void setExpressCompanyId(Long expressCompanyId)
	{
		this.expressCompanyId = expressCompanyId;
	}

	public Long getPayAccountId() {
		return payAccountId;
	}

	public void setPayAccountId(Long payAccountId) {
		this.payAccountId = payAccountId;
	}

	public String getRechargeMoney() {
		return rechargeMoney;
	}

	public void setRechargeMoney(String rechargeMoney) {
		this.rechargeMoney = rechargeMoney;
	}

	@Override
    public String toString() {
        return "OrderAccount{" +
                "deviceIp='" + deviceIp + '\'' +
                ", accountType='" + accountType + '\'' +
                ", accountId=" + accountId +
                ", deviceId='" + deviceId + '\'' +
                ", payAccount='" + payAccount + '\'' +
                ", payPwd='" + payPwd + '\'' +
                '}';
    }

	
}