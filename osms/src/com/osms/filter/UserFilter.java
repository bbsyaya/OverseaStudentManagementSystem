package com.osms.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * �û�������&&����·����֤
 * 		��ֹ�����¼
 * 		��ֹ�Ƿ�����
 * @author Administrator
 *
 */
public class UserFilter implements Filter{
	
	protected Logger logger=LoggerFactory.getLogger(getClass());
	
	//����֤��url����
	private String check=null;
	//������ת����
	private String error_url=null;
	//��ȡsession���û�
	private String userConstant=null;
	
	@Override
	public void destroy() {
		//��������Դ
		this.check=null;
		this.userConstant=null;
		this.error_url=null;
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest request=(HttpServletRequest) servletRequest;
		HttpServletResponse response=(HttpServletResponse) servletResponse;
		
		//��鵱ǰ�û��Ƿ�Ϊ��¼״̬
		if(isUserOnline(request))
		{
			chain.doFilter(request, response);
			return;
		}
		
		//���url�Ƿ�����֤
		if(isChecked(request))
		{
			chain.doFilter(request, response);
			return;
		}
		
		//������ת����
		response.sendRedirect(request.getContextPath()+error_url);
		return;
	}
	
	
	/**
	 * ����Ƿ�Ϊ��Ҫ��֤��url
	 * @param request
	 * 		{@link HttpServletRequest}
	 * @param url
	 * 		�����url
	 * @return
	 * 		Boolean
	 */
	private boolean isChecked(HttpServletRequest request)
	{
		//��ȡ��ǰ��url����
		String check_url=request.getRequestURI();
		//�ָ���Ҫ��֤url����
		String[] checked=this.check.split(";");
		//ƥ��
		for(String item:checked)
		{
			//�ҵ�ƥ��������true
			if((request.getContextPath()+item).equals(check_url))
			{
				logger.info("�ҵ�ƥ���url�� {}  :"+item);
				return true;
			}
		}
		return false;
	}
	
	
	/**
	 * ��鵱ǰ�û��Ƿ�����
	 * @param user
	 * 		Object
	 * @return
	 */
	private boolean isUserOnline(HttpServletRequest request)
	{
		//��ȡsession�е��û�����
		Object user=request.getSession().getAttribute(userConstant);
		return null==user?true:false;
	}

	
	@Override
	public void init(FilterConfig config) throws ServletException {
		//��ȡ����֤��url����
		this.check=config.getInitParameter("check");
		//��ȡ�û�
		this.userConstant=config.getInitParameter("user");
		//��ȡ����ֹ�������զ�췢url
		this.error_url=config.getInitParameter("error_url");
		
	}

}
