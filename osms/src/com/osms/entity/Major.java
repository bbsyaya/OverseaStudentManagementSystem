package com.osms.entity;

import java.io.Serializable;
/**
 * רҵ���ñ�
 * @author Administrator
 *
 */
public class Major implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int majorId;//רҵID
	private String majorName;//רҵ����
	
	public Major()
	{
		
	}
	
	public Major(int majorId, String majorName) {
		this.majorId = majorId;
		this.majorName = majorName;
	}
	
	public int getMajorId() {
		return majorId;
	}
	public void setMajorId(int majorId) {
		this.majorId = majorId;
	}
	public String getMajorName() {
		return majorName;
	}
	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}
	@Override
	public String toString() {
		return "Major [majorId=" + majorId + ", majorName=" + majorName + "]";
	}
	
	
}
