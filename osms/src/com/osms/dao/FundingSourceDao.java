package com.osms.dao;

import java.util.List;

import com.osms.entity.FundingSource;

public interface FundingSourceDao {

	/**
	 * ͨ���������ñ�ID����������Դ����
	 * @param fundingSourceId
	 * @return
	 */
	public FundingSource getFundingSourceByFundingSourceId(int fundingSourceId);
	
	
	/**
	 * ��ȡ���о�����Դ���ͷ�
	 * @return
	 */
	public List<FundingSource> getAllFundingSource();
	
	
	/**
	 * ����һ�־�����Դ
	 * @param fundingSource
	 */
	public void save(FundingSource fundingSource);
	
	
	/**
	 * ����һ�־�����Դ��Ϣ
	 * @param fundingSource
	 */
	public void update(FundingSource fundingSource);
	
	
	/**
	 * ɾ������
	 * @param fundingSourceId
	 * 		�ؼ���
	 * @param fundingSourceName
	 * 		�ؼ���
	 * @param type
	 * 		�ؼ��ֲ������ͣ�������OR�����
	 */
	public void delete(int fundingSourceId, String fundingSourceName, String type);
}
