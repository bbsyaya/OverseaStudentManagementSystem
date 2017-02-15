package com.osms.dao;

import java.sql.Connection;
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
	 * �����ύ
	 * ����һ���û�����
	 * @param user
	 * @param conn
	 * @return
	 */
	public int save(Users user, Connection conn);
	
	/**
	 * ������ѧ����Ϣ
	 * ����Users�е���Ϣ�ڴ˴�����
	 * @param user
	 */
	public void update(Users user);
}
