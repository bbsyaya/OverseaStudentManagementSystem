package com.osms.entity;

import java.io.Serializable;
/**
 * ������Ϣ���ñ�
 * @author Administrator
 *
 */
public class Nationality implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int nationalityId;//�������
	private String nationalityName;//��������
	
	
	public Nationality()
	{
		
	}
	
	
	public Nationality(int nationalityId, String nationalityName) {
		this.nationalityId = nationalityId;
		this.nationalityName = nationalityName;
	}

	public int getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(int nationalityId) {
		this.nationalityId = nationalityId;
	}
	public String getNationalityName() {
		return nationalityName;
	}
	public void setNationalityName(String nationalityName) {
		this.nationalityName = nationalityName;
	}


	@Override
	public String toString() {
		return "Nationality [nationalityId=" + nationalityId + ", nationalityName=" + nationalityName + "]";
	}
	
}
