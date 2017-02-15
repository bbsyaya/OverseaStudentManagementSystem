package com.osms.entity;

import java.io.Serializable;
import java.util.Date;

public class Notice implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int noticeId=0;//֪ͨID
	private String title=null;//֪ͨ����
	private String content=null;//����
	private String writer=null;//д��������
	private int userId=0;//д����Id
	private int noticeTypeId=0;//֪ͨ���ID
	private String downLoadPath=null;//������������
	private Date publishTime=null;//֪ͨ����ʱ��
	private int status=0;//״̬
	
	/**
	 * �����ۺ϶���
	 */
	private Users user=null;//�û������
	private NoticeType noticeType=null;//֪ͨ������������
	
	/**
	 * ˽�б�������
	 * @param noticeId
	 * @param title
	 * @param content
	 * @param writer
	 * @param userId
	 * @param noticeTypeId
	 * @param downLoadPath
	 * @param publishTime
	 * @param status
	 */
	public Notice(int noticeId, String title, String content, String writer, int userId, int noticeTypeId,
			String downLoadPath, Date publishTime, int status) {
//		super();
		this.noticeId = noticeId;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.userId = userId;
		this.noticeTypeId = noticeTypeId;
		this.downLoadPath=downLoadPath;
		this.publishTime = publishTime;
		this.status=status;
	}

	/**
	 * �ۺ϶�����
	 * @param user
	 * @param noticeType
	 */
	public Notice(Users user, NoticeType noticeType) {
//		super();
		this.user = user;
		this.noticeType = noticeType;
	}

	/**
	 * ���캯��
	 * ˽�б���
	 * ���϶���
	 * @param noticeId
	 * @param title
	 * @param content
	 * @param writer
	 * @param userId
	 * @param noticeTypeId
	 * @param downLoadPath
	 * @param publishTime
	 * @param status
	 * @param user
	 * @param noticeType
	 */
	public Notice(int noticeId, String title, String content, String writer, int userId, int noticeTypeId,
			String downLoadPath, Date publishTime, int status, Users user, NoticeType noticeType) {
//		super();
		this.noticeId = noticeId;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.userId = userId;
		this.noticeTypeId = noticeTypeId;
		this.downLoadPath=downLoadPath;
		this.publishTime = publishTime;
		this.status=status;
		this.user = user;
		this.noticeType = noticeType;
	}

	public int getNoticeId() {
		return noticeId;
	}

	public void setNoticeId(int noticeId) {
		this.noticeId = noticeId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getNoticeTypeId() {
		return noticeTypeId;
	}

	public void setNoticeTypeId(int noticeTypeId) {
		this.noticeTypeId = noticeTypeId;
	}

	public String getDownLoadPath() {
		return downLoadPath;
	}

	public void setDownLoadPath(String downLoadPath) {
		this.downLoadPath = downLoadPath;
	}

	public Date getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public NoticeType getNoticeType() {
		return noticeType;
	}

	public void setNoticeType(NoticeType noticeType) {
		this.noticeType = noticeType;
	}

	@Override
	public String toString() {
		return "Notice [noticeId=" + noticeId + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", userId=" + userId + ", noticeTypeId=" + noticeTypeId + ", downLoadPath=" + downLoadPath
				+ ", publishTime=" + publishTime + ", status=" + status + ", user=" + user + ", noticeType="
				+ noticeType + "]";
	}
	
	
	
	
}
