package com.osms.dao;

import java.util.List;

import com.osms.entity.UserType;

public interface UserTypeDao {

	/**
	 * ͨ���û��������ñ�id��������
	 * @param typeId
	 * @return
	 */
	public UserType getUserTypeByTypeId(int typeId);
	
	/**
	 * ��ȡ�����û�����
	 * @return
	 */
	public List<UserType> getAllUserType();
	
	/**
	 * ����һ���û�����
	 * @param userType
	 */
	public void save(UserType userType);
	
	/**
	 * ����һ���û�����
	 * @param userType
	 */
	public void update(UserType userType);
	
	/**
	 * ɾ������
	 * @param typeId
	 * 		�ؼ���
	 * @param typeName
	 * 		�ؼ���
	 * @param type
	 * 		�ؼ��ֲ�����������OR�����
	 */
	public void delete(int typeId, String typeName, String type);
}
