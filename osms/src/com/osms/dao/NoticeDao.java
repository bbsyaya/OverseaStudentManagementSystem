package com.osms.dao;

import java.util.List;

import com.osms.entity.Notice;

public interface NoticeDao {

	/**
	 * ͨ��֪ͨ��id����֪ͨ��Ϣ
	 * @param noticeId
	 * @return
	 */
	public Notice getNoticeByNoticeId(int noticeId);
	
	/**
	 * ��ȡ����֪ͨ��Ϣ
	 * @return
	 */
	public List<Notice> getAllNotice();
	
	/**
	 * ����һ��֪ͨ��Ϣ
	 * @param notice
	 */
	public void save(Notice notice);
	
	/**
	 * ����һ��֪ͨ��Ϣ
	 * @param notice
	 */
	public void update(Notice notice);
	
	/**
	 * ɾ������
	 * @param noticeId
	 * 		�ؼ���
	 * @param userId
	 * 		�ؼ���
	 * @param noticeTypeId
	 * 		�ؼ���
	 * @param type
	 * 		�ؼ��ֲ�����������OR�����
	 */
	public void delete(int noticeId, int userId, int noticeTypeId, String type);
}
