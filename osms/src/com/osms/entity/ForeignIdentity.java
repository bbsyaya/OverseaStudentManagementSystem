package com.osms.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * ���������Ϣ��
 * @author Administrator
 *
 */
public class ForeignIdentity implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private int foreignIdentityId=0;//�������ID
	private int nationalityId=0;//����ID
	private String birthplace=null;//������
	private String homeAddress=null;//��ͥסַ
	private String phone=null;//������ϵ�绰
	private int educationId=0;//ѧ��ID
	private boolean isMarried=false;//�Ƿ���
	private Date birthday=null;//��������
	
	
	/**
	 * ���������
	 */
	private Nationality nationality=null;//���������
	private EducationType educationType=null;//ѧ�������
	
	public ForeignIdentity()
	{
		
	}
	
	public ForeignIdentity(Nationality nationality, EducationType educationType)
	{
		this.nationality = nationality;
		this.educationType = educationType;
	}

	
	
	public ForeignIdentity(int foreignIdentityId, int nationalityId, String birthplace, String homeAddress,
			String phone, int educationId, boolean isMarried, Date birthday) {
		this.foreignIdentityId = foreignIdentityId;
		this.nationalityId = nationalityId;
		this.birthplace = birthplace;
		this.homeAddress = homeAddress;
		this.phone = phone;
		this.educationId = educationId;
		this.isMarried = isMarried;
		this.birthday = birthday;
	}

	public ForeignIdentity(int foreignIdentityId, int nationalityId, String birthplace, String homeAddress,
			String phone, int educationId, boolean isMarried, Date birthday, Nationality nationality,
			EducationType educationType) {
		this.foreignIdentityId = foreignIdentityId;
		this.nationalityId = nationalityId;
		this.birthplace = birthplace;
		this.homeAddress = homeAddress;
		this.phone = phone;
		this.educationId = educationId;
		this.isMarried = isMarried;
		this.birthday = birthday;
		this.nationality = nationality;
		this.educationType = educationType;
	}




	public int getForeignIdentityId() {
		return foreignIdentityId;
	}
	public void setForeignIdentityId(int foreignIdentityId) {
		this.foreignIdentityId = foreignIdentityId;
	}
	public int getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(int nationalityId) {
		this.nationalityId = nationalityId;
	}
	public String getBirthplace() {
		return birthplace;
	}
	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getEducationId() {
		return educationId;
	}
	public void setEducationId(int educationId) {
		this.educationId = educationId;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	

	public Nationality getNationality() {
		return nationality;
	}


	public void setNationality(Nationality nationality) {
		this.nationality = nationality;
	}


	public EducationType getEducationType() {
		return educationType;
	}


	public void setEducationType(EducationType educationType) {
		this.educationType = educationType;
	}


	@Override
	public String toString() {
		return "ForeignIdentity [foreignIdentityId=" + foreignIdentityId + ", nationalityId=" + nationalityId
				+ ", birthplace=" + birthplace + ", homeAddress=" + homeAddress + ", phone=" + phone + ", educationId="
				+ educationId + ", isMarried=" + isMarried + ", birthday=" + birthday + "]";
	}
	
	
}
