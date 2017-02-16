package com.osms.service.impl;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osms.dao.AMCDao;
import com.osms.dao.ForeignIdentityDao;
import com.osms.dao.PassportDao;
import com.osms.dao.SchoolRollDao;
import com.osms.dao.StudyPeriodDao;
import com.osms.dao.UserDao;
import com.osms.dao.VisaDao;
import com.osms.dao.jdbc.JDBCUtil;
import com.osms.entity.AMC;
import com.osms.entity.ForeignIdentity;
import com.osms.entity.Passport;
import com.osms.entity.SchoolRoll;
import com.osms.entity.StudyPeriod;
import com.osms.entity.Users;
import com.osms.entity.Visa;
import com.osms.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	PassportDao passportDao;
	
	@Autowired
	VisaDao visaDao;
	
	@Autowired
	StudyPeriodDao studyPeriodDao;
	
	@Autowired
	AMCDao amcDao;
	
	@Autowired
	SchoolRollDao schoolRollDao;
	
	@Autowired
	ForeignIdentityDao foreignIdentityDao;
	
	@Autowired
	UserDao userDao;
	
	@Override
	public void saveStudent(Passport passport, Visa visa, StudyPeriod studyPeriod, AMC amc, SchoolRoll schoolRoll,
			ForeignIdentity foreignIdentity, Users user) {
		
		//��ȡamcIdֵ
		int amcId=amcDao.getAmcIdByAcademyIdAndMajorIdAndClassId(amc);
		if(amcId!=0)
		{
			schoolRoll.setAmcId(amcId);
		}else
		{
			try {
				throw new Exception("û����Ӧ��ѧԺ��רҵ��༶��Ϣ");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//�ύ�û�����
		Connection conn=JDBCUtil.getConnection();
		try {
			conn.setAutoCommit(false);
			
			//���滤����Ϣ
			int passportId=passportDao.save(passport, conn);
			visa.setPassportId(passportId);
			
			//����ǩ֤��Ϣ
			int visaId=visaDao.save(visa, conn);
			user.setVisaId(visaId);
			
			//����ѧϰ������Ϣ
			int periodId=studyPeriodDao.save(studyPeriod, conn);
			schoolRoll.setPeriodId(periodId);
			
			//����ѧ������Ϣ
			int schoolRollId=schoolRollDao.save(schoolRoll, conn);
			user.setSchoolRollId(schoolRollId);
			
			//������������Ϣ��
			int foreignIdentityId=foreignIdentityDao.save(foreignIdentity, conn);
			user.setForeignIdentityId(foreignIdentityId);
			
			//�����û�����Ϣ
			userDao.save(user, conn);
			
			//�ύ����
			conn.commit();
			
			
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			JDBCUtil.close(conn);
		}
	}

	@Override
	public void saveTeacher(AMC amc, SchoolRoll schoolRoll, Users user) {
		//��ȡamcIdֵ
		int amcId=amcDao.getAmcIdByAcademyIdAndMajorIdAndClassId(amc);
		if(amcId!=0)
		{
			schoolRoll.setAmcId(amcId);
		}else
		{
			try {
				throw new Exception("û����Ӧ��ѧԺ��רҵ��Ϣ");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//�����ʦ�û�����
		Connection conn=JDBCUtil.getConnection();
		try {
			conn.setAutoCommit(false);
			
			//����ѧ������Ϣ
			int schoolRollId = schoolRollDao.save(schoolRoll, conn);
			user.setSchoolRollId(schoolRollId);
			
			//�����û�����Ϣ
			userDao.save(user, conn);
			
			//�����ύ
			conn.commit();
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
