package com.osms.entity;

import java.io.Serializable;

/**
 * ѧ����Ϣ���ñ�
 * @author Administrator
 *
 */
public class EducationType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int educationId=0;//ѧ��ID
	private String educationName=null;//ѧ������
	
	
	public EducationType()
	{
		
	}
	
	
	public EducationType(int educationId, String educationName) {
		this.educationId = educationId;
		this.educationName = educationName;
	}


	public int getEducationId() {
		return educationId;
	}
	public void setEducationId(int educationId) {
		this.educationId = educationId;
	}
	public String getEducationName() {
		return educationName;
	}
	public void setEducationName(String educationName) {
		this.educationName = educationName;
	}


	@Override
	public String toString() {
		return "EducationType [educationId=" + educationId + ", educationName=" + educationName + "]";
	}
	
	
}
