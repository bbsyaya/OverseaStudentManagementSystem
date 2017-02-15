package com.osms.dao;

import java.sql.Connection;
import java.util.List;

import com.osms.entity.Class;

public interface ClassDao {

	/**
	 * ͨ���༶Id����
	 * @param classId
	 * @return
	 */
	public Class getClassByclassId(int classId);
	
	
	/**
	 * ��ȡ���а༶��Ϣ
	 * @return
	 */
	public List<Class> getAllClass();
	
	
	/**
	 * ����һ���༶��Ϣ
	 * @param cclass
	 */
	public void update(Class cclass);
	
	
	/**
	 * ����һ���༶��Ϣ
	 * @param cclass
	 * @return
	 * 		classId
	 */
	public int save(Class cclass, Connection conn);
	
	
	/**
	 * ɾ������
	 * @param classId
	 * 		�ؼ���-classId
	 * @param className
	 * 		�ؼ��� className
	 * @param type
	 * 		�ƶ��ؼ����������ͣ�������Or�����
	 */
	public void delete(int classId, String className, String type);
}
