package com.osms.entity;

import java.io.Serializable;
/**
 * ѧԺ��Ϣ���ñ�
 * @author Administrator
 *
 */
public class Academy implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int academyId=0;//ѧԺID
	private String academyName=null;//ѧԺ����
	
	public Academy()
	{
		
	}
	
	public Academy(int academyId, String academyName) {
		this.academyId = academyId;
		this.academyName = academyName;
	}
	public int getAcademyId() {
		return academyId;
	}
	public void setAcademyId(int academyId) {
		this.academyId = academyId;
	}
	public String getAcademyName() {
		return academyName;
	}
	public void setAcademyName(String academyName) {
		this.academyName = academyName;
	}
	@Override
	public String toString() {
		return "Academy [academyId=" + academyId + ", academyName=" + academyName + "]";
	}
	
	
}
