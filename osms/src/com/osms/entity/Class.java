package com.osms.entity;

import java.io.Serializable;
/**
 * �༶��Ϣ���ñ�
 * @author Administrator
 *
 */
public class Class implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int classId;//�༶ID
	private String className;//�༶����
	
	
	public Class()
	{
		
	}
	/**
	 * ˽�г�Ա�������캯��
	 * @param classId
	 * @param className
	 * @param userId
	 */
	public Class(int classId, String className) {
		this.classId = classId;
		this.className = className;
	}
	
	
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	
	@Override
	public String toString() {
		return "Class [classId=" + classId + ", className=" + className + "]";
	}
	
	
}
