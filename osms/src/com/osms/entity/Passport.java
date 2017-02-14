package com.osms.entity;

import java.io.Serializable;
import java.util.List;

/**
 *�������ñ� 
 * @author Administrator
 *
 */
public class Passport implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int passportId;//����ID
	private String passportNum=null;//���պ�
	private String passportPage=null;//����ҳͼƬ����
	//����list
	private List<String> passportPageList=null;//�ָ��Ļ���ҳ��������
	
	public Passport()
	{
		
	}
	
	
	public Passport(int passportId, String passportNum, String passportPage) {
		this.passportId = passportId;
		this.passportNum = passportNum;
		this.passportPage = passportPage;
	}

	public int getPassportId() {
		return passportId;
	}
	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}
	public String getPassportNum() {
		return passportNum;
	}
	public void setPassportNum(String passportNum) {
		this.passportNum = passportNum;
	}
	public String getPassportPage() {
		return passportPage;
	}
	public void setPassportPage(String passportPage) {
		this.passportPage = passportPage;
	}
	
	/**
	 * ������Գ�Ա
	 * @return
	 */
	public List<String> getPassportPageList() {
		return passportPageList;
	}
	
	/**
	 * �Ǳ����Գ�Ա
	 * @param passportPageList
	 */
	public void setPassportPageList(List<String> passportPageList) {
		this.passportPageList = passportPageList;
	}



	@Override
	public String toString() {
		return "Passport [passportId=" + passportId + ", passportNum=" + passportNum + ", passportPage=" + passportPage
				+ "]";
	}
	
	
}
