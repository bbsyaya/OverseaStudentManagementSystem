package com.osms.dao;

import java.util.List;

import com.osms.entity.PaymentType;

public interface PaymentTypeDao {

	/**
	 * ͨ�������������ñ�id��ȡ��������
	 * @param paymentTypeId
	 * @return
	 */
	public PaymentType getPaymentTypeByPaymentTypeId(int paymentTypeId);
	
	/**
	 * ��ȡ���з�������
	 * @return
	 */
	public List<PaymentType> getAllPaymentType();
	
	/**
	 * ����һ�ַ�������
	 * @param paymentType
	 */
	public void save(PaymentType paymentType);
	
	/**
	 * ����һ�ַ�������
	 * @param paymentType
	 */
	public void update(PaymentType paymentType);
	
	/**
	 * ɾ������
	 * @param paymentTypeId
	 * 		�ؼ���
	 * @param paymentTypeName
	 * 		�ؼ���
	 * @param type
	 * 		�ؼ��ֲ������ͣ�������OR�����
	 */
	public void delete(int paymentTypeId, String paymentTypeName, String type);
}
