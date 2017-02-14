package com.osms.entity;

import java.io.Serializable;
/**
 * ������Դ���ñ�
 * @author Administrator
 *
 */
public class FundingSource implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int fundingSourceId;//������ԴID
	private String fundingSourceName;//������Դ������
	

	public FundingSource()
	{
		
	}


	
	public FundingSource(int fundingSourceId, String fundingSourceName) {
		this.fundingSourceId = fundingSourceId;
		this.fundingSourceName = fundingSourceName;
	}



	public int getFundingSourceId() {
		return fundingSourceId;
	}


	public void setFundingSourceId(int fundingSourceId) {
		this.fundingSourceId = fundingSourceId;
	}


	public String getFundingSourceName() {
		return fundingSourceName;
	}


	public void setFundingSourceName(String fundingSourceName) {
		this.fundingSourceName = fundingSourceName;
	}



	@Override
	public String toString() {
		return "FundingSource [fundingSourceId=" + fundingSourceId + ", fundingSourceName=" + fundingSourceName + "]";
	}
	

	
}
