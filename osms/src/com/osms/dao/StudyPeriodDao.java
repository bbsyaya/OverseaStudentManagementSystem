package com.osms.dao;

import java.sql.Connection;
import java.util.Date;
import java.util.List;

import com.osms.entity.StudyPeriod;

public interface StudyPeriodDao {

	/**
	 * ͨ��ѧϰ���ޱ�ID��������Ϣ
	 * @param periodId
	 * @return
	 */
	public StudyPeriod getStudyPeriodByPeriodId(int periodId);
	
	/**
	 * ��ȡ����ѧϰ����ʱ���
	 * @return
	 */
	public List<StudyPeriod> getAllStudyPeriod();
	
	/**
	 * �����ύ
	 * ����һ��ʱ��μ�¼
	 * @param studyPeriod
	 * @param conn
	 * @return
	 */
	public int save(StudyPeriod studyPeriod, Connection conn);
	
	/**
	 * �޸�ѧϰ����
	 * @param studyPeriod
	 */
	public void update(StudyPeriod studyPeriod);
	
	/**
	 * ɾ������
	 * @param periodId
	 * 		�ؼ���
	 * @param startTime
	 * 		�ؼ���
	 * @param endTime
	 * 		�ؼ���
	 * @param type
	 * 		�ؼ��ֲ������ͣ�������OR�����
	 */
	public void delete(int periodId, Date startTime, Date endTime, String type);
}
