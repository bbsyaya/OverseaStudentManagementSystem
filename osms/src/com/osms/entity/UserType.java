package com.osms.entity;

import java.io.Serializable;

/**
 * �û��������ñ�
 * @author Administrator
 *
 */

public class UserType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int typeId=0;//�û�����ID
	private String typeName=null;//�û���������
	
	
	public UserType()
	{
		
	}
	
	public UserType(int typeId, String typeName) {
		this.typeId = typeId;
		this.typeName = typeName;
	}
	
	
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	@Override
	public String toString() {
		return "UserType [typeId=" + typeId + ", typeName=" + typeName + "]";
	}
	
	
	
}
