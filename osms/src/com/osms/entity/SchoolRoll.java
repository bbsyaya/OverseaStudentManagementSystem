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
	
	private int schoolRollId;//ѧ��Id
	private int majorId;//רҵID
	private int periodId;//ѧϰ����id
	private String workOrStudyPlace;//������ѧϰ��λ
	private String studentType;//ѧ�����,��ѧ��
	private String studentNum;//ѧ��
	private int classId;//�༶ID
	private int academyId;//ѧԺID
	private String dormitoryNum;//�����
	private String studentCardNum;//ѧ��������
	private Date comeTime;//��Уʱ��
	private Date leaveTime;//��Уʱ��
	private int statusId;//״̬ID
	
	/**
	 * �����ۺ������
	 */
	private Major major;//רҵ���������
	private StudyPeriod studyPeriod;//ѧϰ�������������
	private Class CClass;//�༶���������
	private Academy academy;//ѧԺ���������
	private Status status;//��У״̬����
	
	
	public SchoolRoll()
	{
		
	}
	
	/**
	 * �ۺ�������캯��
	 * @param major
	 * @param studyPeriod
	 * @param cClass
	 * @param academy
	 * @param status
	 */
	public SchoolRoll(Major major, StudyPeriod studyPeriod, Class cClass, Academy academy, Status status) {
		this.major = major;
		this.studyPeriod = studyPeriod;
		CClass = cClass;
		this.academy = academy;
		this.status = status;
	}


	/**
	 * ˽�г�Ա�������캯��
	 * @param schoolRollId
	 * @param majorId
	 * @param periodId
	 * @param workOrStudyPlace
	 * @param studentType
	 * @param studentNum
	 * @param classId
	 * @param academyId
	 * @param dormitoryNum
	 * @param studentCardNum
	 * @param comeTime
	 * @param leaveTime
	 * @param statusId
	 */
	
	public SchoolRoll(int schoolRollId, int majorId, int periodId, String workOrStudyPlace, String studentType,
			String studentNum, int classId, int academyId, String dormitoryNum, String studentCardNum, Date comeTime,
			Date leaveTime, int statusId) {
		this.schoolRollId = schoolRollId;
		this.majorId = majorId;
		this.periodId = periodId;
		this.workOrStudyPlace = workOrStudyPlace;
		this.studentType = studentType;
		this.studentNum = studentNum;
		this.classId = classId;
		this.academyId = academyId;
		this.dormitoryNum = dormitoryNum;
		this.studentCardNum = studentCardNum;
		this.comeTime = comeTime;
		this.leaveTime = leaveTime;
		this.statusId = statusId;
	}
	
	
	/**
	 * ���캯��
	 * ˽�г�Ա
	 * �ۺ϶���
	 * @param schoolRollId
	 * @param majorId
	 * @param periodId
	 * @param workOrStudyPlace
	 * @param studentType
	 * @param studentNum
	 * @param classId
	 * @param academyId
	 * @param dormitoryNum
	 * @param studentCardNum
	 * @param comeTime
	 * @param leaveTime
	 * @param statusId
	 * @param major
	 * @param studyPeriod
	 * @param cClass
	 * @param academy
	 * @param status
	 */
	public SchoolRoll(int schoolRollId, int majorId, int periodId, String workOrStudyPlace, String studentType,
			String studentNum, int classId, int academyId, String dormitoryNum, String studentCardNum, Date comeTime,
			Date leaveTime, int statusId, Major major, StudyPeriod studyPeriod, Class cClass, Academy academy,
			Status status) {
		this.schoolRollId = schoolRollId;
		this.majorId = majorId;
		this.periodId = periodId;
		this.workOrStudyPlace = workOrStudyPlace;
		this.studentType = studentType;
		this.studentNum = studentNum;
		this.classId = classId;
		this.academyId = academyId;
		this.dormitoryNum = dormitoryNum;
		this.studentCardNum = studentCardNum;
		this.comeTime = comeTime;
		this.leaveTime = leaveTime;
		this.statusId = statusId;
		this.major = major;
		this.studyPeriod = studyPeriod;
		CClass = cClass;
		this.academy = academy;
		this.status = status;
	}

	public int getSchoolRollId() {
		return schoolRollId;
	}
	public void setSchoolRollId(int schoolRollId) {
		this.schoolRollId = schoolRollId;
	}
	public int getMajorId() {
		return majorId;
	}
	public void setMajorId(int majorId) {
		this.majorId = majorId;
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
	public String getStudentType() {
		return studentType;
	}
	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}
	public String getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public int getAcademyId() {
		return academyId;
	}
	public void setAcademyId(int academyId) {
		this.academyId = academyId;
	}
	public String getDormitoryNum() {
		return dormitoryNum;
	}
	public void setDormitoryNum(String dormitoryNum) {
		this.dormitoryNum = dormitoryNum;
	}
	public String getStudentCardNum() {
		return studentCardNum;
	}
	public void setStudentCardNum(String studentCardNum) {
		this.studentCardNum = studentCardNum;
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
	
	
	public Major getMajor() {
		return major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

	public StudyPeriod getStudyPeriod() {
		return studyPeriod;
	}

	public void setStudyPeriod(StudyPeriod studyPeriod) {
		this.studyPeriod = studyPeriod;
	}

	public Class getCClass() {
		return CClass;
	}

	public void setCClass(Class cClass) {
		CClass = cClass;
	}

	public Academy getAcademy() {
		return academy;
	}

	public void setAcademy(Academy academy) {
		this.academy = academy;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "SchoolRoll [schoolRollId=" + schoolRollId + ", majorId=" + majorId + ", periodId=" + periodId
				+ ", workOrStudyPlace=" + workOrStudyPlace + ", studentType=" + studentType + ", studentNum="
				+ studentNum + ", classId=" + classId + ", academyId=" + academyId + ", dormitoryNum=" + dormitoryNum
				+ ", studentCardNum=" + studentCardNum + ", comeTime=" + comeTime + ", leaveTime=" + leaveTime
				+ ", statusId=" + statusId + ", major=" + major + ", studyPeriod=" + studyPeriod + ", CClass=" + CClass
				+ ", academy=" + academy + ", status=" + status + "]";
	}
	
	
}
