package kr.co.jhta.acc.vo;

import java.util.Date;

public class AccountVO {
	
	private int accNo;
	private String accTitle;
	private String accOwner;
	private long accBalance;
	private double accRates;
	private Date accCreatedate;
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccTitle() {
		return accTitle;
	}
	public void setAccTitle(String accTitle) {
		this.accTitle = accTitle;
	}
	public String getAccOwner() {
		return accOwner;
	}
	public void setAccOwner(String accOwner) {
		this.accOwner = accOwner;
	}
	public long getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(long accBalance) {
		this.accBalance = accBalance;
	}
	public double getAccRates() {
		return accRates;
	}
	public void setAccRates(double accRates) {
		this.accRates = accRates;
	}
	public Date getAccCreatedate() {
		return accCreatedate;
	}
	public void setAccCreatedate(Date accCreatedate) {
		this.accCreatedate = accCreatedate;
	}
	
}
