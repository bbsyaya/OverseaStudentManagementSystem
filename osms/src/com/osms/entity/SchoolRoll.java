package com.osms.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * ѧ����Ϣ��
 * @author Administrator
 *
 */
public class SchoolRoll implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int schoolRollId=0;//ѧ��Id
	private int periodId=0;//ѧϰ����id
	private String workOrStudyPlace=null;//������ѧϰ��λ
	private String schoolRollName=null;//ְҵ���ͣ���ѧ�����߽�ʦְ��
	private String cardNum=null;//���š�ѧ�����š�ѧ����ͬһ��
	private int amcId=0;//ѧԺרҵ�༶��ID
	private String dormitoryNum=null;//�����
	private Date comeTime=null;//��Уʱ��
	private Date leaveTime=null;//��Уʱ��
	private int statusId=0;//״̬ID
	
	/**
	 * �����ۺ������
	 */
	private AMC amc=null;//ѧԺרҵ�༶���ϱ����
	private StudyPeriod studyPeriod=null;//ѧϰ�������������
	private Status status=null;//��У״̬����
	
	
	public SchoolRoll()
	{
		
	}


	/**
	 * ˽�б���
	 * @param schoolRollId
	 * @param periodId
	 * @param workOrStudyPlace
	 * @param schoolRollName
	 * @param cardNum
	 * @param amcId
	 * @param dormitoryNum
	 * @param comeTime
	 * @param leaveTime
	 * @param statusId
	 */
	public SchoolRoll(int schoolRollId, int periodId, String workOrStudyPlace, String schoolRollName, String cardNum,
			int amcId, String dormitoryNum, Date comeTime, Date leaveTime, int statusId) {
		this.schoolRollId = schoolRollId;
		this.periodId = periodId;
		this.workOrStudyPlace = workOrStudyPlace;
		this.schoolRollName = schoolRollName;
		this.cardNum = cardNum;
		this.amcId = amcId;
		this.dormitoryNum = dormitoryNum;
		this.comeTime = comeTime;
		this.leaveTime = leaveTime;
		this.statusId = statusId;
	}


	/**
	 * �ۺ϶���
	 * @param amc
	 * @param studyPeriod
	 * @param status
	 */
	public SchoolRoll(AMC amc, StudyPeriod studyPeriod, Status status) {
		this.amc = amc;
		this.studyPeriod = studyPeriod;
		this.status = status;
	}


	/**
	 * ˽�б���
	 * �ۺ϶���
	 * @param schoolRollId
	 * @param periodId
	 * @param workOrStudyPlace
	 * @param schoolRollName
	 * @param cardNum
	 * @param amcId
	 * @param dormitoryNum
	 * @param comeTime
	 * @param leaveTime
	 * @param statusId
	 * @param amc
	 * @param studyPeriod
	 * @param status
	 */
	public SchoolRoll(int schoolRollId, int periodId, String workOrStudyPlace, String schoolRollName, String cardNum,
			int amcId, String dormitoryNum, Date comeTime, Date leaveTime, int statusId, AMC amc,
			StudyPeriod studyPeriod, Status status) {
		this.schoolRollId = schoolRollId;
		this.periodId = periodId;
		this.workOrStudyPlace = workOrStudyPlace;
		this.schoolRollName = schoolRollName;
		this.cardNum = cardNum;
		this.amcId = amcId;
		this.dormitoryNum = dormitoryNum;
		this.comeTime = comeTime;
		this.leaveTime = leaveTime;
		this.statusId = statusId;
		this.amc = amc;
		this.studyPeriod = studyPeriod;
		this.status = status;
	}


	public int getSchoolRollId() {
		return schoolRollId;
	}


	public void setSchoolRollId(int schoolRollId) {
		this.schoolRollId = schoolRollId;
	}


	public int getPeriodId() {
		return periodId;
	}


	public void setPeriodId(int periodId) {
		this.periodId = periodId;
	}


	public String getWorkOrStudyPlace() {
		return workOrStudyPlace;
	}


	public void setWorkOrStudyPlace(String workOrStudyPlace) {
		this.workOrStudyPlace = workOrStudyPlace;
	}


	public String getSchoolRollName() {
		return schoolRollName;
	}


	public void setSchoolRollName(String schoolRollName) {
		this.schoolRollName = schoolRollName;
	}


	public String getCardNum() {
		return cardNum;
	}


	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}


	public int getAmcId() {
		return amcId;
	}


	public void setAmcId(int amcId) {
		this.amcId = amcId;
	}


	public String getDormitoryNum() {
		return dormitoryNum;
	}


	public void setDormitoryNum(String dormitoryNum) {
		this.dormitoryNum = dormitoryNum;
	}


	public Date getComeTime() {
		return comeTime;
	}


	public void setComeTime(Date comeTime) {
		this.comeTime = comeTime;
	}


	public Date getLeaveTime() {
		return leaveTime;
	}


	public void setLeaveTime(Date leaveTime) {
		this.leaveTime = leaveTime;
	}


	public int getStatusId() {
		return statusId;
	}


	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}


	public AMC getAmc() {
		return amc;
	}


	public void setAmc(AMC amc) {
		this.amc = amc;
	}


	public StudyPeriod getStudyPeriod() {
		return studyPeriod;
	}


	public void setStudyPeriod(StudyPeriod studyPeriod) {
		this.studyPeriod = studyPeriod;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "SchoolRoll [schoolRollId=" + schoolRollId + ", periodId=" + periodId + ", workOrStudyPlace="
				+ workOrStudyPlace + ", schoolRollName=" + schoolRollName + ", cardNum=" + cardNum + ", amcId=" + amcId
				+ ", dormitoryNum=" + dormitoryNum + ", comeTime=" + comeTime + ", leaveTime=" + leaveTime
				+ ", statusId=" + statusId + ", amc=" + amc + ", studyPeriod=" + studyPeriod + ", status=" + status
				+ "]";
	}

	
}
