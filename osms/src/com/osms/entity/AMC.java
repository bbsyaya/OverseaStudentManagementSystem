package com.osms.entity;

import java.io.Serializable;

/**
 * ѧԺרҵ�༶���ϱ�
 * @author Administrator
 *
 */
public class AMC implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int amcId=0;//ѧԺרҵ�༶��ID
	private int academyId=0;//ѧԺID
	private int majorId=0;//רҵID
	private int classId=0;//�༶ID
	
	/**
	 * �ۺ϶���
	 */
	
	private Academy academy=null;//ѧԺ����
	private Major major=null;//רҵ����
	private Class cclass=null;//�༶����
	
	public AMC() {
		
	}

	/**
	 * ˽�б���
	 * @param amcId
	 * @param academyId
	 * @param majorId
	 * @param classId
	 */
	public AMC(int amcId, int academyId, int majorId, int classId) {
		this.amcId = amcId;
		this.academyId = academyId;
		this.majorId = majorId;
		this.classId = classId;
	}

	/**
	 * �ۺ϶���
	 * @param academy
	 * @param major
	 * @param cclass
	 */
	public AMC(Academy academy, Major major, Class cclass) {
		this.academy = academy;
		this.major = major;
		this.cclass = cclass;
	}

	/**
	 * ˽�б���
	 * �ۺ϶���
	 * @param amcId
	 * @param academyId
	 * @param majorId
	 * @param classId
	 * @param academy
	 * @param major
	 * @param cclass
	 */
	public AMC(int amcId, int academyId, int majorId, int classId, Academy academy, Major major, Class cclass) {
		this.amcId = amcId;
		this.academyId = academyId;
		this.majorId = majorId;
		this.classId = classId;
		this.academy = academy;
		this.major = major;
		this.cclass = cclass;
	}

	public int getAmcId() {
		return amcId;
	}

	public void setAmcId(int amcId) {
		this.amcId = amcId;
	}

	public int getAcademyId() {
		return academyId;
	}

	public void setAcademyId(int academyId) {
		this.academyId = academyId;
	}

	public int getMajorId() {
		return majorId;
	}

	public void setMajorId(int majorId) {
		this.majorId = majorId;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public Academy getAcademy() {
		return academy;
	}

	public void setAcademy(Academy academy) {
		this.academy = academy;
	}

	public Major getMajor() {
		return major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

	public Class getCclass() {
		return cclass;
	}

	public void setCclass(Class cclass) {
		this.cclass = cclass;
	}

	@Override
	public String toString() {
		return "AMC [amcId=" + amcId + ", academyId=" + academyId + ", majorId=" + majorId + ", classId=" + classId
				+ ", academy=" + academy + ", major=" + major + ", cclass=" + cclass + "]";
	}
	
	
}
