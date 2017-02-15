package com.osms.dao;

import java.util.List;

import com.osms.entity.EducationType;

public interface EducationTypeDao {

	/**
	 * ͨ��ѧ�����ñ�id������Ϣ
	 * @param educationId
	 * @return
	 */
	public EducationType getEducationTypeByEducationId(int educationId);
	
	
	/**
	 * ��ȡ����ѧ������
	 * @return
	 */
	public List<EducationType> getAllEducationType();
	
	
	/**
	 * ͨ��ѧ������ģ������ѧ��
	 * @param educationName
	 * @return
	 */
	public List<EducationType> getEduationTypeByEducationName(String educationName);
	
	
	/**
	 * ����һ��ѧ����Ϣ
	 * @param educationType
	 */
	public void save(EducationType educationType);
	
	
	/**
	 * ����һ��ѧ����Ϣ
	 * @param educationType
	 */
	public void update(EducationType educationType);
	
	
	/**
	 * ɾ������
	 * @param educationId
	 * 		�ؼ���
	 * @param educationName
	 * 		�ؼ���
	 * @param type
	 * 		�ؼ��ֲ�����������OR�����
	 */
	public void delete(int educationId, String educationName, String type);
}
