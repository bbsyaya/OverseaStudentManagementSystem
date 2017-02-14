package com.osms.dao.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


/**
 * ���ݿ����Ӿ�̬��
 * @author Administrator
 *
 */
public class JDBCUtil {

	
	private static String name=null;//�����ַ���
	private static String url=null;//���ݿ�url��ַ
	private static String user=null;//���ݿ������û���
	private static String password=null;//���ݿ���������
	
	
	/**
	 * ����jdbc����
	 */
	static
	{
		loadProperties();
		try 
		{
			Class.forName(name);
		} catch (ClassNotFoundException e)
		{
			System.out.println("�Ҳ������������� ����������ʧ�ܣ�");
			e.printStackTrace();
		}
	}
	
	
	
	/**
	 * �������ݿ����Ӳ���
	 */
	private static void loadProperties()
	{
		Properties prop=new Properties();
		try 
		{
			prop.load(new FileInputStream(Thread.currentThread().getContextClassLoader().getResource("").getPath()
					+"jdbc.properties"));
			name=prop.getProperty("driverClassName");
			url=prop.getProperty("url");
			user=prop.getProperty("username");
			password=prop.getProperty("password");
		} catch (IOException e)
		{
			System.out.println("���ݿ�������ش���");
			e.printStackTrace();
		}
	}
	
	
	/**
	 * �������ݿ�����
	 * @return ����Connection����
	 */
	public static Connection getConnection()
	{
		Connection conn=null;
		try
		{
			conn=DriverManager.getConnection(url, user, password);
		} catch (SQLException e)
		{
			System.out.println("���ݿ�����ʧ��");
			e.printStackTrace();
		}
		return conn;
	}
	
	
	/**
	 * �ر����ݿ��������
	 * @param rs �ر�ResultSet
	 * @param stmt �ر�Statement
	 * @param conn �ر�Connection
	 */
	public static void close(ResultSet rs,Statement stmt,Connection conn)
	{
		try 
		{
			if(rs!=null)
			{
				rs.close();
			}
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		try
		{
			if(stmt!=null)
			{
				stmt.close();
			}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		try
		{
			if(conn!=null)
			{
				conn.close();
			}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	
	/**
	 * ���ݶ������͹ر����ݿ�����
	 * @param o
	 */
	public static void close(Object o)
	{
		try
		{
			if(o instanceof ResultSet)
			{
				((ResultSet) o).close();
			}else if(o instanceof Statement)
			{
				((Statement) o).close();
			}else if(o instanceof Connection)
			{
				((Connection) o).close();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	/**
	 * �ر�ResultSet
	 * @param resultSets
	 */
	public static void close(ResultSet...resultSets)
	{
		for(ResultSet rs:resultSets)
		{
			if(rs!=null)
			{
				try
				{
					rs.close();
				} catch (SQLException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	
	/**
	 * ��ӡ�����
	 * @param rs
	 */
	public static void printResultSet(ResultSet rs)
	{
		StringBuffer sb=new StringBuffer();
		try
		{
			ResultSetMetaData meta=rs.getMetaData();
			int clos=meta.getColumnCount();
			while(rs.next())
			{
				for(int i=1;i<clos;i++)
				{
					sb.append(meta.getColumnName(i)+"=");
					sb.append(rs.getString(i)+"  ");
				}
				sb.append("\n");
			}
			System.out.println(sb.toString());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
