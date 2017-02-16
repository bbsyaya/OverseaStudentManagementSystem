package com.osms.dao;

import java.sql.Connection;
import java.util.List;

import com.osms.entity.Visa;

public interface VisaDao {

	/**
	 * ͨ��ǩ֤id��ȡǩ֤��Ϣ
	 * @param visaId
	 * @return
	 */
	public Visa getVisaByVisaId(int visaId);
	
	/**
	 * ��ȡ����ǩ֤��Ϣ
	 * @return
	 */
	public List<Visa> getAllVisa();
	
	/**
	 * �����ύ
	 * ����һ��ǩ֤��¼
	 * @param visa
	 * @param conn
	 * @return
	 */
	public int save(Visa visa, Connection conn);
	
	/**
	 * ����ǩ֤��Ϣ
	 * @param visa
	 */
	public void update(Visa visa);
	
	/**
	 * ɾ������
	 * @param visaId
	 * 		�ؼ���
	 * @param passportId
	 * 		�ؼ���
	 * @param type
	 * 		�ؼ��ֲ�����������OR�����
	 */
	public void delete(int visaId, int passportId, String type);
}
