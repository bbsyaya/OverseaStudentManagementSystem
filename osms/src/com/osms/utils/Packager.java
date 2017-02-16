package com.osms.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.osms.entity.AMC;
import com.osms.entity.Academy;
import com.osms.entity.Class;
import com.osms.entity.EducationType;
import com.osms.entity.ForeignIdentity;
import com.osms.entity.FundingSource;
import com.osms.entity.Major;
import com.osms.entity.Nationality;
import com.osms.entity.Notice;
import com.osms.entity.NoticeType;
import com.osms.entity.Passport;
import com.osms.entity.Payment;
import com.osms.entity.PaymentType;
import com.osms.entity.SchoolRoll;
import com.osms.entity.Status;
import com.osms.entity.StudyPeriod;
import com.osms.entity.UserType;
import com.osms.entity.Users;
import com.osms.entity.Visa;

public class Packager {

	/**
	 * Users���ݴ��
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	public static Users PackagerUser(ResultSet rs) throws SQLException
	{
		Users user=new Users();
		user.setUserId(rs.getInt("userId"));
		user.setFullName(rs.getString("fullName"));
		user.setGender(rs.getBoolean("gender"));
		user.setTypeId(rs.getInt("typeId"));
		user.setPhone(rs.getString("phone"));
		user.setEmail(rs.getString("email"));
		user.setPassword(rs.getString("password"));
		user.setForeignIdentityId(rs.getInt("foreignIdentityId"));
		user.setVisaId(rs.getInt("visaId"));
		user.setSchoolRollId(rs.getInt("schoolRollId"));
		return user;
	}
	
	/**
	 * ���Academy����
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	public static Academy PackagerAcademy(ResultSet rs) throws SQLException
	{
		Academy academy=new Academy();
		academy.setAcademyId(rs.getInt("academyId"));
		academy.setAcademyName(rs.getString("academyName"));
		return academy;
	}
	
	
	/**
	 * ���רҵ����������
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	public static Major PackagerMajor(ResultSet rs) throws SQLException
	{
		Major major=new Major();
		major.setMajorId(rs.getInt("majorId"));
		major.setMajorName(rs.getString("majorName"));
		return major;
	}
	
	/**
	 * ����༶���ñ�����
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	public static Class PackagerClass(ResultSet rs) throws SQLException
	{
		Class cclass=new Class();
		cclass.setClassId(rs.getInt("classId"));
		cclass.setClassName(rs.getString("className"));
		return cclass;
	}
	
	
	/**
	 * ���ѧԺרҵ�༶��Ϣ��
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	public static AMC PackagerAMC(ResultSet rs) throws SQLException
	{
		AMC amc=new AMC();
		amc.setAmcId(rs.getInt("amcId"));
		amc.setAcademyId(rs.getInt("academyId"));
		amc.setMajorId(rs.getInt("majorId"));
		amc.setClassId(rs.getInt("classId"));
		return amc;
	}
	
	/**
	 * ���ѧϰ���ޱ�����
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	public static StudyPeriod PackagerStudyPeriod(ResultSet rs) throws SQLException
	{
		StudyPeriod studyPeriod=new StudyPeriod();
		studyPeriod.setPeriodId(rs.getInt("periodId"));
		studyPeriod.setStartTime(rs.getDate("startTime"));
		studyPeriod.setEndTime(rs.getDate("endTime"));
		return studyPeriod;
	}
	
	/**
	 * ���Status������
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	public static Status PackagerStatus(ResultSet rs) throws SQLException
	{
		Status status=new Status();
		status.setStatusId(rs.getInt("statusId"));
		status.setStatusName(rs.getString("statusName"));
		return status;
	}
	
	/**
	 * ���ѧ����Ϣ������
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	public static SchoolRoll PackagerSchoolRoll(ResultSet rs) throws SQLException
	{
		SchoolRoll schoolRoll=new SchoolRoll();
		schoolRoll.setSchoolRollId(rs.getInt("schoolRollId"));
		schoolRoll.setPeriodId(rs.getInt("periodId"));
		schoolRoll.setWorkOrStudyPlace(rs.getString("workOrStudyPlace"));
		schoolRoll.setSchoolRollName(rs.getString("schoolRollName"));
		schoolRoll.setAmcId(rs.getInt("amcId"));
		schoolRoll.setDormitoryNum(rs.getString("dormitoryNum"));
		schoolRoll.setCardNum(rs.getString("cardNum"));
		schoolRoll.setComeTime(rs.getDate("comeTime"));
		schoolRoll.setLeaveTime(rs.getDate("leaveTime"));
		schoolRoll.setStatusId(rs.getInt("statusId"));
		return schoolRoll;
	}
	
	
	/**
	 * �������������
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	public static Nationality PackagerNationality(ResultSet rs) throws SQLException
	{
		Nationality nationality=new Nationality();
		nationality.setNationalityId(rs.getInt("nationalityId"));
		nationality.setNationalityChineseName(rs.getString("nationalityChineseName"));
		nationality.setNationalityEnglishName(rs.getString("nationalityEnglishName"));
		return nationality;
	}
	
	
	/**
	 * ���ѧ�����ñ�����
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	public static EducationType PackagerEducationType(ResultSet rs) throws SQLException
	{
		EducationType educationType=new EducationType();
		educationType.setEducationId(rs.getInt("educationId"));
		educationType.setEducationName(rs.getString("educationName"));
		return educationType;
	}
	
	/**
	 * ���������ݱ�����
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	public static ForeignIdentity PackagerForeignIdeneity(ResultSet rs) throws SQLException
	{
		ForeignIdentity foreignIdentity=new ForeignIdentity();
		foreignIdentity.setForeignIdentityId(rs.getInt("foreignIdentityId"));
		foreignIdentity.setNationalityId(rs.getInt("nationalityId"));
		foreignIdentity.setBirthplace(rs.getString("birthplace"));
		foreignIdentity.setHomeAddress(rs.getString("homeAddress"));
		foreignIdentity.setPhone(rs.getString("phone"));
		foreignIdentity.setEducationId(rs.getInt("educationId"));
		foreignIdentity.setMarried(rs.getBoolean("isMarried"));
		foreignIdentity.setBirthday(rs.getDate("birthday"));
		return foreignIdentity;
	}
	
	
	/**
	 * ����û��������ñ�����
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	public static UserType PackagerUserType(ResultSet rs) throws SQLException
	{
		UserType userType=new UserType();
		userType.setTypeId(rs.getInt("typeId"));
		userType.setTypeName(rs.getString("typeName"));
		return userType;
	}
	
	
	/**
	 * ���������Դ���ñ�����
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	public static FundingSource PAckagerFundingSource(ResultSet rs) throws SQLException
	{
		FundingSource fundingSource=new FundingSource();
		fundingSource.setFundingSourceId(rs.getInt("fundingSourceId"));
		fundingSource.setFundingSourceName(rs.getString("fundingSourceName"));
		return fundingSource;
	}
	
	/**
	 * ������ձ�����
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	public static Passport PackagerPassport(ResultSet rs) throws SQLException
	{
		Passport passport=new Passport();
		passport.setPassportId(rs.getInt("passportId"));
		passport.setPassportNum(rs.getString("passportNum"));
		passport.setPassportPage(rs.getString("passportPage"));
		return passport;
	}
	
	/**
	 * ���ǩ֤������
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	public static Visa PackagerVisa(ResultSet rs) throws SQLException
	{
		Visa visa=new Visa();
		visa.setVisaId(rs.getInt("visaId"));
		visa.setRegisterDeadline(rs.getDate("registerDeadline"));
		visa.setIntermediary(rs.getString("intermediary"));
		visa.setIntermediaryPhone(rs.getString("intermediaryPhone"));
		visa.setGuaranteeName(rs.getString("guaranteeName"));
		visa.setGuaranteePhone(rs.getString("guaranteePhone"));
		visa.setFundingSourceId(rs.getInt("fundingSourceId"));
		visa.setPassportId(rs.getInt("passportId"));
		visa.setApprovalTime(rs.getDate("approvalTime"));
		visa.setVisaDueTime(rs.getDate("visaDueTime"));
		return visa;
	}
	
	
	/**
	 * ���֪ͨ���ñ�����
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	public static NoticeType PackagerNoticeType(ResultSet rs) throws SQLException
	{
		NoticeType noticeType=new NoticeType();
		noticeType.setNoticeTypeId(rs.getInt("noticeTypeId"));
		noticeType.setNoticeTypeName(rs.getString("noticeTypeName"));
		return noticeType;
	}
	
	/**
	 * ���֪ͨ������
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	public static Notice PackagerNotice(ResultSet rs) throws SQLException
	{
		Notice notice=new Notice();
		notice.setNoticeId(rs.getInt("noticeId"));
		notice.setTitle(rs.getString("title"));
		notice.setContent(rs.getString("content"));
		notice.setWriter(rs.getString("writer"));
		notice.setUserId(rs.getInt("userId"));
		notice.setNoticeTypeId(rs.getInt("noticeTypeId"));
		notice.setDownLoadPath(rs.getString("downLoadPath"));
		notice.setPublishTime(rs.getDate("publishTime"));
		notice.setStatus(rs.getInt("status"));
		return notice;
	}
	
	/**
	 * ����������ͱ�����
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	public static PaymentType PackagerPaymentType(ResultSet rs) throws SQLException
	{
		PaymentType paymentType=new PaymentType();
		paymentType.setPaymentTypeId(rs.getInt("paymentTypeId"));
		paymentType.setPaymentTypeName(rs.getString("paymentTypeName"));
		return paymentType;
	}
	
	/**
	 * ������ñ�����
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	public static Payment PackagerPayment(ResultSet rs) throws SQLException
	{
		Payment payment =new Payment();
		payment.setPaymentId(rs.getInt("paymentId"));
		payment.setUserId(rs.getInt("userId"));
		payment.setPaymentTypeId(rs.getInt("paymentTypeId"));
		payment.setMoney(rs.getDouble("money"));
		payment.setPayTime(rs.getDate("payTime"));
		payment.setDone(rs.getBoolean("isDone"));
		payment.setDescription(rs.getString("description"));
		payment.setStatus(rs.getInt("status"));
		return payment;
	}
}
