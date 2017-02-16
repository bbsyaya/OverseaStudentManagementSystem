package com.osms.dao;

import java.util.List;

import com.osms.entity.Payment;

public interface PaymentDao {

	/**
	 * ͨ�����ñ�id��ȡ���ü�¼
	 * @param paymentId
	 * @return
	 */
	public Payment getPaymentByPaymentId(int paymentId);
	
	/**
	 * ��ȡ���з��ü�¼
	 * @return
	 */
	public List<Payment> getAllPayment();
	
	/**
	 * ����һ�����ü�¼
	 * @param payment
	 */
	public void save(Payment payment);
	
	/**
	 * ��ϸһ�����ü�¼
	 * @param payment
	 */
	public void update(Payment payment);
	
	/**
	 * ɾ������
	 * @param paymentId
	 * 		�ؼ���
	 * @param userId
	 * 		�ؼ���
	 * @param paymentTypeId
	 * 		�ؼ���
	 * @param type
	 * 		�ؼ��ֲ�����������OR�����
	 */
	public void delete(int paymentId, int userId, int paymentTypeId, String type);
}
