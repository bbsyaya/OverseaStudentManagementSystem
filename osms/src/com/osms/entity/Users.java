package com.osms.entity;

import java.io.Serializable;

/**
 * �û���Ϣ���
 * @author Administrator
 *
 */
public class Users implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int userId;//�û�ID
	private String fullName;//�û�����
	private boolean gender;//�Ա�
	private int typeId;//�û�����Id
	private String phone;//�ڻ��ֻ���
	private String email;//����
	private String password;//����
	private int foreignIdentityId;//�������ID
	private int visaId;//ǩ֤ID
	private int schoolRollId;//ѧ��ID
	private int status;//״̬
	
	/**
	 * ����
	 * �û��������ñ���
	 * ���������
	 * ǩ֤��
	 * ѧ����
	 */
	
	private UserType userType;//�û��������������
	private ForeignIdentity foreignIdentity;//������������
	private Visa visa;//ǩ֤�����
	private SchoolRoll schoolRoll;//ѧ����Ϣ�����
	
	public Users()
	{
		
	}
	
	/**
	 * ���캯��
	 * ˽�б���
	 * @param userId
	 * @param fullName
	 * @param gender
	 * @param typeId
	 * @param phone
	 * @param email
	 * @param password
	 * @param foreignIdentityId
	 * @param visaId
	 * @param schoolRollId
	 * @param status
	 */
	public Users(int userId, String fullName, boolean gender, int typeId, String phone, String email, String password,
			int foreignIdentityId, int visaId, int schoolRollId, int status) {
		this.userId = userId;
		this.fullName = fullName;
		this.gender = gender;
		this.typeId = typeId;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.foreignIdentityId = foreignIdentityId;
		this.visaId = visaId;
		this.schoolRollId = schoolRollId;
		this.status=status;
	}
	
	
	/**
	 * ���캯��
	 * �ۺ������
	 * @param userType
	 * @param foreignIdentity
	 * @param visa
	 * @param schoolRoll
	 */
	public Users(UserType userType, ForeignIdentity foreignIdentity, Visa visa, SchoolRoll schoolRoll) {
		this.userType = userType;
		this.foreignIdentity = foreignIdentity;
		this.visa = visa;
		this.schoolRoll = schoolRoll;
	}


	/**
	 * ���캯��
	 * ˽�б���
	 * �ۺ������
	 * @param userId
	 * @param fullName
	 * @param gender
	 * @param typeId
	 * @param phone
	 * @param email
	 * @param password
	 * @param foreignIdentityId
	 * @param visaId
	 * @param schoolRollId
	 * @param userType
	 * @param foreignIdentity
	 * @param visa
	 * @param schoolRoll
	 * @param status
	 */
	public Users(int userId, String fullName, boolean gender, int typeId, String phone, String email, String password,
			int foreignIdentityId, int visaId, int schoolRollId, int status, UserType userType, ForeignIdentity foreignIdentity,
			Visa visa, SchoolRoll schoolRoll) {
		this.userId = userId;
		this.fullName = fullName;
		this.gender = gender;
		this.typeId = typeId;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.foreignIdentityId = foreignIdentityId;
		this.visaId = visaId;
		this.schoolRollId = schoolRollId;
		this.status=status;
		this.userType = userType;
		this.foreignIdentity = foreignIdentity;
		this.visa = visa;
		this.schoolRoll = schoolRoll;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getForeignIdentityId() {
		return foreignIdentityId;
	}
	public void setForeignIdentityId(int foreignIdentityId) {
		this.foreignIdentityId = foreignIdentityId;
	}
	public int getVisaId() {
		return visaId;
	}
	public void setVisaId(int visaId) {
		this.visaId = visaId;
	}
	public int getSchoolRollId() {
		return schoolRollId;
	}
	public void setSchoolRollId(int schoolRollId) {
		this.schoolRollId = schoolRollId;
	}
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	public ForeignIdentity getForeignIdentity() {
		return foreignIdentity;
	}
	public void setForeignIdentity(ForeignIdentity foreignIdentity) {
		this.foreignIdentity = foreignIdentity;
	}
	public Visa getVisa() {
		return visa;
	}
	public void setVisa(Visa visa) {
		this.visa = visa;
	}
	public SchoolRoll getSchoolRoll() {
		return schoolRoll;
	}
	public void setSchoolRoll(SchoolRoll schoolRoll) {
		this.schoolRoll = schoolRoll;
	}
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", fullName=" + fullName + ", gender=" + gender + ", typeId=" + typeId
				+ ", phone=" + phone + ", email=" + email + ", password=" + password + ", foreignIdentityId="
				+ foreignIdentityId + ", visaId=" + visaId + ", schoolRollId=" + schoolRollId + ", status=" + status
				+ ", userType=" + userType + ", foreignIdentity=" + foreignIdentity + ", visa=" + visa + ", schoolRoll="
				+ schoolRoll + "]";
	}
	
	
	
}
