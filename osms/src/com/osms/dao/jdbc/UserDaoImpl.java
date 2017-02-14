package com.osms.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.osms.dao.UserDao;
import com.osms.entity.ForeignIdentity;
import com.osms.entity.Passport;
import com.osms.entity.SchoolRoll;
import com.osms.entity.StudyPeriod;
import com.osms.entity.Users;
import com.osms.entity.Visa;
import com.osms.utils.Packager;

public class UserDaoImpl extends JDBCBase implements UserDao{

	//��̬���ϴ���飬������Уʱ�䡢��Уʱ�����ѧʱ�估��ҵʱ��
	private boolean hook=false;
	
	public void setHook(boolean hook)
	{
		this.hook=hook;
	}
	
	
	@Override
	public Users getUserByUserId(int userId) {
		Connection conn=JDBCUtil.getConnection();
		PreparedStatement ps=null;
		ResultSet rs=null;
		Users user=null;
		
		String sql="SELECT * FROM Users WHERE userId="+userId;
		
		try
		{
			ps=conn.prepareStatement(sql);
			rs=query(ps);
			if(rs.next())
			{
				user=Packager.PackagerUser(rs);
			}
		} catch (SQLException e)
		{
			e.printStackTrace();
		}finally
		{
			JDBCUtil.close(rs, ps, conn);
		}
		
		return user;
	}

	@Override
	public List<Users> getUsers(int typeId) {
		List<Users> users=new ArrayList<Users>();
		Connection conn=JDBCUtil.getConnection();
		PreparedStatement ps=null;
		ResultSet rs=null;
		String sql="SELECT * FROM Users WHERE typeId="+typeId;
		
		try
		{
			ps=conn.prepareStatement(sql);
			rs=query(ps);
			while(rs.next())
			{
				users.add(Packager.PackagerUser(rs));
			}
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		return users;
	}

	/**
	 * �����ύ
	 * ˳�򣺻���ҳ��->ǩ֤��(hook)[ѧ�����ޱ�]->ѧ����������ݱ�Users��
	 */
	@Override
	public void saveStudent(Users user) {
		String sql="INSERT INTO Passport VALUES(?,?)";
		
		//������Ϣ
		Passport passport=user.getVisa().getPassport();
		
		Object[] paramPassport={
			passport.getPassportNum(),
			passport.getPassportPage()
		};
		//���滤��ҳ��Ϣ����ȡIDֵ
		int passportId=save(sql, paramPassport);
		
		sql="INSERT INTO Visa VALUES(?,?,?,?,?,?,?,?,?)";
		//ǩ֤��Ϣ
		Visa visa=user.getVisa();
		Object[] paramVisa={
			visa.getRegisterDeadline(),
			visa.getIntermediary(),
			visa.getIntermediaryPhone(),
			visa.getGuaranteeName(),
			visa.getGuaranteePhone(),
			visa.getFundingSourceId(),
			passportId,
			visa.getApprovalTime(),
			visa.getVisaDueTime()
		};
		//����ǩ֤��Ϣ������ȡIDֵ
		int visaId=save(sql, paramVisa);
		
		/**
		 * ͨ�����Ӷ�̬����
		 * �Ƿ���Ҫ���Ӵ����
		 */
		
		//��Ҫ-true
		String schoolRoolId=null;
		if(hook)
		{
			sql="INSERT INTO StudyPeriod VALUES(?,?)";
			//ѧϰ���ޱ�
			StudyPeriod studyPeriod=user.getSchoolRoll().getStudyPeriod();
			Object[] paramStudyPeroid={
				studyPeriod.getStartTime(),
				studyPeriod.getEndTime()
			};
			//����ѧϰ������Ϣ������ȡIDֵ
			int periodId=save(sql, paramStudyPeroid);
			
			sql="INSERT INTO SchoolRoll VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
			//ѧ����Ϣ��
			SchoolRoll schoolRoll=user.getSchoolRoll();
			Object[] paramSchoolRool={
				schoolRoll.getMajorId(),
				periodId,
				schoolRoll.getWorkOrStudyPlace(),
				schoolRoll.getStudentType(),
				schoolRoll.getStudentNum(),
				schoolRoll.getClassId(),
				schoolRoll.getAcademyId(),
				schoolRoll.getDormitoryNum(),
				schoolRoll.getStudentCardNum(),
				schoolRoll.getComeTime(),
				schoolRoll.getLeaveTime(),
				schoolRoll.getStatusId()
			};
			//����ѧ����Ϣ������ȡIDֵ
			schoolRoolId=save(sql, paramSchoolRool)+"";
		}else
		{
			//ѧ����Ϣ��
			sql="INSERT INTO SchoolRoll VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
			//ѧ����Ϣ��
			SchoolRoll schoolRoll=user.getSchoolRoll();
			Object[] paramSchoolRool={
				schoolRoll.getMajorId(),
				null,
				schoolRoll.getWorkOrStudyPlace(),
				schoolRoll.getStudentType(),
				schoolRoll.getStudentNum(),
				schoolRoll.getClassId(),
				schoolRoll.getAcademyId(),
				schoolRoll.getDormitoryNum(),
				schoolRoll.getStudentCardNum(),
				schoolRoll.getComeTime(),
				schoolRoll.getLeaveTime(),
				schoolRoll.getStatusId()
			};
			//����ѧ����Ϣ������ȡIDֵ
			schoolRoolId=save(sql, paramSchoolRool)+"";
		}
		
		
		
		//������ݱ�
		sql="INSERT INTO ForeignIdentity VALUES(?,?,?,?,?,?,?)";
		ForeignIdentity foreignIdentity=user.getForeignIdentity();
		Object[] paramForeignIdentity={
			foreignIdentity.getNationalityId(),
			foreignIdentity.getBirthplace(),
			foreignIdentity.getHomeAddress(),
			foreignIdentity.getPhone(),
			foreignIdentity.getEducationId(),
			foreignIdentity.isMarried(),
			foreignIdentity.getBirthday()
		};
		//������������Ϣ����ȡIDֵ
		int ForeignIdentityId=save(sql, paramForeignIdentity);
		
		//Users��
		sql="INSERT INTO Users VALUES(?,?,?,?,?,?,?,?,?,?)";
		Object[] paramUser={
			user.getFullName(),
			user.isGender(),
			user.getTypeId(),
			user.getPhone(),
			user.getEmail(),
			user.getPassword(),
			ForeignIdentityId,
			visaId,
			schoolRoolId,
			user.getStatus()
		};
		//����user��Ϣ
		saveOrUpdateOrDelete(sql, paramUser);
		
	}

	@Override
	public void saveTeacher(Users user) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void update(Users user) {
		StringBuilder sql= new StringBuilder("UPDATE Users SET foreignIdentityId=?, visaId=?, schoolRollId=?, gender=?, typeId=?, status=?");
		ArrayList<Object> paramList=new ArrayList<Object>();
		paramList.add(user.getForeignIdentityId());
		paramList.add(user.getVisaId());
		paramList.add(user.getSchoolRollId());
		paramList.add(user.isGender());
		paramList.add(user.getTypeId());
		paramList.add(user.getStatus());
		
		if(user.getFullName()!=null)
		{
			sql.append(", fullName=?");
			paramList.add(user.getFullName());
		}
		
		if(user.getPhone()!=null)
		{
			sql.append(", phone=?");
			paramList.add(user.getPhone());
		}
		
		if(user.getEmail()!=null)
		{
			sql.append(", email=?");
			paramList.add(user.getEmail());
		}
		
		if(user.getPassword()!=null)
		{
			sql.append(", password=?");
			paramList.add(user.getPassword());
		}
		
		sql.append(" WHERE userId=?");
		paramList.add(user.getUserId());
		
		Object[] param=paramList.toArray();
		saveOrUpdateOrDelete(sql.toString(), param);
	}

}
