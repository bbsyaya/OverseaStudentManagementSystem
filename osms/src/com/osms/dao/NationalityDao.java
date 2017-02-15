package com.osms.dao;

import java.util.List;

import com.osms.entity.Nationality;

public interface NationalityDao {

	/**
	 * ͨ��������id����������Ϣ
	 * @param nationalityId
	 * @return
	 */
	public Nationality getNationalityByNationalityId(int nationalityId);
	
	
	/**
	 * �������й�����Ϣ
	 * @return
	 */
	public List<Nationality> getAllNationality();
	
	/**
	 * ���ݲ�����������ģ���������й�����Ϣ
	 * ������Ϊ�գ�Ĭ�ϲ�������
	 * @return
	 */
	public List<Nationality> getNationalityByCondition(String condition);
	
	
	/**
	 * ����һ��������Ϣ
	 * @param nationality
	 */
	public void save(Nationality nationality);
	
	
	/**
	 * ����һ��������Ϣ
	 * @param nationality
	 */
	public void update(Nationality nationality);
	
	
	/**
	 * ɾ������
	 * @param nationalityId
	 * 			�ؼ���
	 * @param nationalityChineseName
	 * 			�ؼ���
	 * @param nationalityEnglishName
	 * 			�ؼ���
	 * @param type
	 * 			�ؼ��ֲ�����������OR�����
	 */
	public void delete(int nationalityId, String nationalityChineseName, String nationalityEnglishName, String type);
}
