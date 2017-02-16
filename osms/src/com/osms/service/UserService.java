package com.osms.service;

import com.osms.entity.AMC;
import com.osms.entity.ForeignIdentity;
import com.osms.entity.Passport;
import com.osms.entity.SchoolRoll;
import com.osms.entity.StudyPeriod;
import com.osms.entity.Users;
import com.osms.entity.Visa;

public interface UserService {

	/**
	 * ����һ��ѧ���û�����
	 * @param passport
	 * 		���ն���
	 * @param visa
	 * 		ǩ֤����
	 * @param studyPeriod
	 * 		ѧϰ���޶���
	 * @param amc
	 * 		ѧԺרҵ�༶����
	 * @param schoolRoll
	 * 		ѧ������
	 * @param foreignIdentity
	 * 		������ݶ���
	 * @param users
	 * 		�û�����
	 */
	public void saveStudent(Passport passport, Visa visa,
			StudyPeriod studyPeriod, AMC amc, SchoolRoll schoolRoll,
			ForeignIdentity foreignIdentity, Users user);
	
	
	/**
	 * ����һ����ʦ������Ϣ
	 * @param amc
	 * @param schoolRoll
	 * @param user
	 */
	public void saveTeacher(AMC amc, SchoolRoll schoolRoll, Users user);
}
