package com.osms.entity;

import java.io.Serializable;
/**
 * ֪ͨ������ñ�
 * @author Administrator
 *
 */
public class NoticeType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int noticeTypeId=0;//֪ͨ���ID
	private String noticeTypeName=null;//֪ͨ�������
	
	public NoticeType()
	{
		
	}

	public NoticeType(int noticeTypeId, String noticeTypeName) {
		this.noticeTypeId = noticeTypeId;
		this.noticeTypeName = noticeTypeName;
	}

	public int getNoticeTypeId() {
		return noticeTypeId;
	}

	public void setNoticeTypeId(int noticeTypeId) {
		this.noticeTypeId = noticeTypeId;
	}

	public String getNoticeTypeName() {
		return noticeTypeName;
	}

	public void setNoticeTypeName(String noticeTypeName) {
		this.noticeTypeName = noticeTypeName;
	}

	@Override
	public String toString() {
		return "NoticeType [noticeTypeId=" + noticeTypeId + ", noticeTypeName=" + noticeTypeName + "]";
	}
	
	
}
