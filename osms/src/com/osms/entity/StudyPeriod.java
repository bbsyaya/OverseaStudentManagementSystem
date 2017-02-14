package com.osms.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * ѧϰ���ޱ�
 * @author Administrator
 *
 */
public class StudyPeriod implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int periodId;//ѧϰ����id
	private Date startTime;//��ʼʱ��
	private Date endTime;//����ʱ��
	
	public StudyPeriod()
	{
		
	}
	
	public StudyPeriod(int periodId, Date startTime, Date endTime) {
		this.periodId = periodId;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public int getPeriodId() {
		return periodId;
	}
	public void setPeriodId(int periodId) {
		this.periodId = periodId;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	@Override
	public String toString() {
		return "StudyPeriod [periodId=" + periodId + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	
	
}
