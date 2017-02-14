package com.osms.dao;

import java.util.List;

import com.osms.entity.Users;

public interface UserDao {

	/**
	 * ͨ���û�id�Ų����û�
	 * @param userId
	 * 		user id
	 * @return
	 * 		Users
	 */
	public Users getUserByUserId(int userId);
	
	
	/**
	 * ͨ���û����ͻ�ȡ�û����󼯺�
	 * @param typeId
	 * 		int
	 * @return
	 * 		List<Users>
	 */
	public List<Users> getUsers(int typeId);
	
	/**
	 * ����һ��ѧ���û�����
	 * @param user
	 */
	public void saveStudent(Users user);
	
	/**
	 * ����һ����ʦ�û�����
	 * @param user
	 */
	public void saveTeacher(Users user);
	
	/**
	 * ������ѧ����Ϣ
	 * ����Users�е���Ϣ�ڴ˴�����
	 * @param user
	 */
	public void update(Users user);
}
