package com.osms.service.impl;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osms.dao.AMCDao;
import com.osms.dao.ClassDao;
import com.osms.dao.jdbc.JDBCUtil;
import com.osms.entity.AMC;
import com.osms.entity.Class;
import com.osms.service.ClassService;

@Service("classService")
public class ClassServiceImpl implements ClassService {

	@Autowired
	ClassDao classDao;
	
	@Autowired
	AMCDao amcDao;
	
	@Override
	public void saveClass(Class cclass, AMC amc) {
		
		//��ȡ��Ӧ��amcId
		int amcId=amcDao.getAmcIdByAcademyIdAndMajorIdAndClassId(amc);
		if(amcId!=0)
		{
			amc.setAmcId(amcId);
		}else
		{
			try {
				throw new Exception("û�з���������ѧԺ��רҵ�ļ�¼");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		Connection conn=JDBCUtil.getConnection();
		try
		{
			conn.setAutoCommit(false);
			
			//����༶��Ϣ
			int classId=classDao.save(cclass, conn);
			
			//����classId��Ϣ
			amc.setClassId(classId);
			
			//�����ύ
			conn.commit();
			
			//����AMC����Ϣ
			amcDao.update(amc);
		} catch (SQLException e)
		{
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally
		{
			JDBCUtil.close(conn);
		}
		
	}

}
