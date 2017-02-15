package com.osms.dao;

import java.util.List;

import com.osms.entity.Status;

public interface StatusDao {

	/**
	 * ͨ��״̬��Id��ȡ����
	 * @param statusId
	 */
	public Status getStatusByStatusId(int statusId);
	
	/**
	 * ��ȡ����״̬����
	 * @return
	 */
	public List<Status> getAllStatus();
	
	/**
	 * ����һ��״̬��Ϣ
	 * @param status
	 */
	public void save(Status status);
	
	/**
	 * ����һ��״̬
	 * @param status
	 */
	public void update(Status status);
	
	/**
	 * ɾ������
	 * @param statusId
	 * 		�ؼ���
	 * @param statusName
	 * 		�ؼ���
	 * @param type
	 * 		�ؼ��ֲ������ͣ�������OR�����
	 */
	public void delete(int statusId, String statusName, String type);
}
