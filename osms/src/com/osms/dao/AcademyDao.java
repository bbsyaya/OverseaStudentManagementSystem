package com.osms.dao;

import java.util.List;

import com.osms.entity.Academy;

public interface AcademyDao {

	/**
	 * ͨ��ѧԺID�ż���ѧԺ����
	 * @param academyId
	 * 		int
	 * @return
	 * 		Academy
	 */
	public Academy getAcademyByAcademyId(int academyId);
	
	/**
	 * ��ȡ����ѧԺ����
	 * @return
	 */
	public List<Academy> getAllAcademy();
	
	/**
	 * ����һ��ѧԺ����
	 * @param academy
	 */
	public void save(Academy academy);
	
	/**
	 * ����ѧԺ����
	 * @param academy
	 */
	public void update(Academy academy);
	
	/**
	 * ɾ������
	 * @param academyId
	 * 		�ؼ���
	 * @param academyName
	 * 		�ؼ���
	 * @param type
	 * 		�ؼ��ֲ������ͣ�������OR�����
	 */
	public void delete(int academyId, String academyName, String type);
}
