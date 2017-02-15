package com.osms.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * �����ɷѱ�
 * @author Administrator
 *
 */
public class Payment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int paymentId=0;//�ɷѵ�Id
	private int userId=0;//�ɷ���Id
	private int paymentTypeId=0;//�ɷ�����Id
	private double money=0;//���
	private Date payTime=null;//�ɷ�ʱ��
	private boolean isDone=false;//�Ƿ���ɱ��νɷѵ�
	private String description=null;//����
	private int status=0;//״̬
	
	/**
	 * �ۺ϶���
	 */
	private Users user=null;//�ɷ��˶���
	private PaymentType paymentType=null;//�ɷ����Ͷ���
	
	
	public Payment()
	{
		
	}


	/**
	 * ˽�б�������
	 * @param paymentId
	 * @param userId
	 * @param paymentTypeId
	 * @param money
	 * @param payTime
	 * @param isDone
	 * @param description
	 * @param status
	 */
	public Payment(int paymentId, int userId, int paymentTypeId, double money, Date payTime, boolean isDone,
			String description, int status) {
		this.paymentId = paymentId;
		this.userId = userId;
		this.paymentTypeId = paymentTypeId;
		this.money = money;
		this.payTime = payTime;
		this.isDone = isDone;
		this.description = description;
		this.status=status;
	}


	/**
	 * �ۺ϶�����
	 * @param user
	 * @param paymentType
	 */
	public Payment(Users user, PaymentType paymentType) {
		this.user = user;
		this.paymentType = paymentType;
	}


	/**
	 * ˽�б���
	 * �ۺ϶���
	 * @param paymentId
	 * @param userId
	 * @param paymentTypeId
	 * @param money
	 * @param payTime
	 * @param isDone
	 * @param description
	 * @param status
	 * @param user
	 * @param paymentType
	 * 
	 */
	public Payment(int paymentId, int userId, int paymentTypeId, double money, Date payTime, boolean isDone,
			String description, int status, Users user, PaymentType paymentType) {
		this.paymentId = paymentId;
		this.userId = userId;
		this.paymentTypeId = paymentTypeId;
		this.money = money;
		this.payTime = payTime;
		this.isDone = isDone;
		this.description = description;
		this.status=status;
		this.user = user;
		this.paymentType = paymentType;
	}


	public int getPaymentId() {
		return paymentId;
	}


	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public int getPaymentTypeId() {
		return paymentTypeId;
	}


	public void setPaymentTypeId(int paymentTypeId) {
		this.paymentTypeId = paymentTypeId;
	}


	public double getMoney() {
		return money;
	}


	public void setMoney(double money) {
		this.money = money;
	}


	public Date getPayTime() {
		return payTime;
	}


	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}


	public boolean isDone() {
		return isDone;
	}


	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public Users getUser() {
		return user;
	}


	public void setUser(Users user) {
		this.user = user;
	}


	public PaymentType getPaymentType() {
		return paymentType;
	}


	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}


	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", userId=" + userId + ", paymentTypeId=" + paymentTypeId
				+ ", money=" + money + ", payTime=" + payTime + ", isDone=" + isDone + ", description=" + description
				+ ", status=" + status + ", user=" + user + ", paymentType=" + paymentType + "]";
	}
	
	
}
