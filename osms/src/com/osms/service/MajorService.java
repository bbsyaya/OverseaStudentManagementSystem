package com.osms.service;

import com.osms.entity.AMC;
import com.osms.entity.Major;

public interface MajorService {

	/**
	 * ����רҵ��Ϣ
	 * @param major
	 * @param amc
	 */
	public void saveMajor(Major major, AMC amc);
}
