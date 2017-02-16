package com.osms.dao;

import java.sql.Connection;
import java.util.List;

import com.osms.entity.Passport;

public interface PassportDao {

	/**
	 * ͨ�����ձ��id����������Ϣ
	 * @param passportId
	 * @return
	 */
	public Passport getPassportByPassportId(int passportId);
	
	/**
	 * ͨ�����ձ�Ļ��ձ�Ż�ȡ������Ϣ
	 * @param passportNum
	 * @return
	 */
	public Passport getPassportByPassportNum(String passportNum);
	
	/**
	 * ��ȡ���л��ձ�Ļ�����Ϣ
	 * @return
	 */
	public List<Passport> getAllPassport();
	
	/**
	 * �����ύ
	 * ���滤����Ϣ
	 * @param passport
	 * @param conn
	 * @return
	 */
	public int save(Passport passport, Connection conn);
	
	/**
	 * ���»��ձ���Ϣ����
	 * @param passport
	 */
	public void update(Passport passport);
	
	/**
	 * ɾ������
	 * @param passportId��
	 * 		�ؼ���
	 * @param passportNum
	 * 		�ؼ���
	 * @param type
	 * 		�ؼ��ֲ�����������OR�����
	 */
	public void delete(int passportId, String passportNum, String type);
}
