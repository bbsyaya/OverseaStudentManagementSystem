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
	private int academyId;//ѧԺID
	
	/**
	 * �����ۺ϶���
	 */
	private Academy academy;//ѧԺ����
	
	public Major()
	{
		
	}

	/**
	 * �ۺ϶���
	 * @param academy
	 */
	public Major(Academy academy) {
		this.academy = academy;
	}

	/**
	 * ˽�б���
	 * @param majorId
	 * @param majorName
	 * @param academyId
	 */
	public Major(int majorId, String majorName, int academyId) {
		this.majorId = majorId;
		this.majorName = majorName;
		this.academyId = academyId;
	}

	/**
	 * ˽�б���
	 * �ۺ϶���
	 * @param majorId
	 * @param majorName
	 * @param academyId
	 * @param academy
	 */
	public Major(int majorId, String majorName, int academyId, Academy academy) {
		this.majorId = majorId;
		this.majorName = majorName;
		this.academyId = academyId;
		this.academy = academy;
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

	public int getAcademyId() {
		return academyId;
	}

	public void setAcademyId(int academyId) {
		this.academyId = academyId;
	}

	public Academy getAcademy() {
		return academy;
	}

	public void setAcademy(Academy academy) {
		this.academy = academy;
	}

	@Override
	public String toString() {
		return "Major [majorId=" + majorId + ", majorName=" + majorName + ", academyId=" + academyId + ", academy="
				+ academy + "]";
	}
	
	
	
	
}
