package com.osms.dao;

import java.util.List;

import com.osms.entity.NoticeType;

public interface NoticeTypeDao {

	/**
	 * ͨ��֪ͨ�������ñ�id��ȡ֪ͨ����
	 * @param noticeTypeId
	 * @return
	 */
	public NoticeType getNoticeTypeByNoticeTypeId(int noticeTypeId);
	
	/**
	 * ��ȡ����֪ͨ����
	 * @return
	 */
	public List<NoticeType> getAllNoticeType();
	
	/**
	 * ����һ��֪ͨ����
	 * @param noticeType
	 */
	public void save(NoticeType noticeType);
	
	/**
	 * ����һ��֪ͨ����
	 * @param noticeType
	 */
	public void update(NoticeType noticeType);
	
	/**
	 * ɾ������
	 * @param noticeTypeId
	 * 		�ؼ���
	 * @param noticeTypeName
	 * 		�ؼ���
	 * @param type
	 * 		�ؼ��ֲ�����������OR�����
	 */
	public void delete(int noticeTypeId, String noticeTypeName, String type);
}
