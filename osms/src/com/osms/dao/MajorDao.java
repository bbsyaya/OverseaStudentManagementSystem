package com.osms.dao;

import java.sql.Connection;
import java.util.List;

import com.osms.entity.Major;

public interface MajorDao {

	/**
	 * ͨ��רҵID����רҵ����
	 * @param majorId
	 * @return
	 */
	public Major getMajorByMajorId(int majorId);
	
	/**
	 * ��ȡ����רҵ��Ϣ
	 * @return
	 */
	public List<Major> getAllMajor();
	
	/**
	 * ����һ��רҵ����
	 */
	public int save(Major major, Connection conn);
	
	
	/**
	 * ����רҵ��Ϣ
	 * @param major
	 */
	public void update(Major major);
	
	/**
	 * ɾ������
	 * @param majorId
	 * 		�ؼ���
	 * @param majorName
	 * 		�ؼ���
	 * @param type
	 * 		�ؼ��ֲ������ͣ�������Or�����
	 */
	public void delete(int majorId, String majorName, String type);
}
