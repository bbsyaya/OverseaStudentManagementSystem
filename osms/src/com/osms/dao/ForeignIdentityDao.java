package com.osms.dao;

import java.sql.Connection;
import java.util.List;

import com.osms.entity.ForeignIdentity;

public interface ForeignIdentityDao {

	/**
	 * ͨ��������Ϣ��ݱ�id���ұ�����
	 * @param foreignIdentityId
	 * @return
	 */
	public ForeignIdentity getForeignIdentityByForeignIdentityId(int foreignIdentityId);
	
	
	/**
	 * ��ȡ����Ŷ�����������
	 * @return
	 */
	public List<ForeignIdentity> getAllForeignIdeneity();
	
	
	/**
	 * �����ύ
	 * ����һ�������������
	 * @param foreignIdentity
	 * @param conn
	 * @return
	 */
	public int save(ForeignIdentity foreignIdentity, Connection conn);
	
	
	/**
	 * ���²���
	 * @param foreignIdentity
	 */
	public void update(ForeignIdentity foreignIdentity);
	
	
	/**
	 * ɾ������
	 * @param foreignIdeneityId
	 * 		�ؼ���
	 * @param phone
	 * 		�ؼ���
	 * @param type
	 * 		�ؼ��ֲ�����������OR�����
	 */
	public void delete(int foreignIdeneityId, String phone, String type);
}
