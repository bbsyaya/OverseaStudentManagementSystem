package com.osms.dao;

import java.sql.Connection;
import java.util.List;

import com.osms.entity.AMC;

public interface AMCDao {
	
	/**
	 * ͨ��amcId����AMC��Ϣ
	 * @param amcId
	 * @return
	 */
	public AMC getAMCByAmcId(int amcId);
	
	
	/**
	 * ͨ��ѧԺ��ȡѧԺ�µ�����רҵ��רҵ��صİ༶
	 * @param academyId
	 * @return
	 */
	public List<AMC> getAMCByAcademyId(int academyId);
	
	
	/**
	 * ����һ��ѧԺרҵ�༶����
	 * @param amc
	 */
	public int save(AMC amc, Connection conn);
	
	
	/**
	 * ͨ��ѧԺid��רҵid����amc��¼idֵ
	 * @param amc
	 * @return
	 */
	public int getAmcIdByAcademyIdAndMajorId(AMC amc);
	
	/**
	 * ������Ϣ
	 * @param amc
	 */
	public void update(AMC amc);
	
	/**
	 * ɾ�����ݲ���
	 * @param amcId
	 * 		�ؼ��� amcId
	 * @param academyId
	 * 		�ؼ��� academyId
	 * @param majorId
	 * 		�ؼ��� majorId
	 * @param classId
	 * 		�ؼ��� classId
	 * @param type
	 * 		������Or�������д��ؼ��ֵ���Ϸ�ʽ
	 */
	public void delete(int amcId, int academyId, int majorId, int classId, String type);
}
