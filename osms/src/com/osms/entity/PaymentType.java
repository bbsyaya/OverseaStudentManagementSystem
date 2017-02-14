package com.osms.entity;

import java.io.Serializable;

/**
 * �����ɷ��������ñ�
 * @author Administrator
 *
 */
public class PaymentType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int paymentTypeId;//�ɷ����ID
	private String paymentTypeName;//�ɷ��������
	
	
	public PaymentType()
	{
		
	}


	public PaymentType(int paymentTypeId, String paymentTypeName) {
		this.paymentTypeId = paymentTypeId;
		this.paymentTypeName = paymentTypeName;
	}


	public int getPaymentTypeId() {
		return paymentTypeId;
	}


	public void setPaymentTypeId(int paymentTypeId) {
		this.paymentTypeId = paymentTypeId;
	}


	public String getPaymentTypeName() {
		return paymentTypeName;
	}


	public void setPaymentTypeName(String paymentTypeName) {
		this.paymentTypeName = paymentTypeName;
	}


	@Override
	public String toString() {
		return "PaymentType [paymentTypeId=" + paymentTypeId + ", paymentTypeName=" + paymentTypeName + "]";
	}
	
	
}
