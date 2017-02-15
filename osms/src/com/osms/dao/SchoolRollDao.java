package com.osms.dao;

import java.sql.Connection;

import com.osms.entity.SchoolRoll;

public interface SchoolRollDao {

	/**
	 * ͨ��ѧ����Ϣ��Id������Ϣ
	 * @param schoolRollId
	 * @return
	 */
	public SchoolRoll getSchoolRollByschoolRoolId(int schoolRollId);
	
	
	/**
	 * �����ύ
	 * ����һ��ѧ������
	 * @param schoolRoll
	 * @param conn
	 * @return
	 */
	public int save(SchoolRoll schoolRoll, Connection conn);
	
	
	/**
	 * ����һ��ѧ����¼��Ϣ
	 * @param schoolRoll
	 */
	public void update(SchoolRoll schoolRoll);
	
	
	/**
	 * ɾ������
	 * @param schoolRollId
	 * 		�ؼ���
	 * @param cardNum
	 * 		�ؼ���
	 * @param type
	 * 		�ؼ��ֲ������ͣ�������OR�����
	 */
	public void delete(int schoolRollId, String cardNum, String type);
}
