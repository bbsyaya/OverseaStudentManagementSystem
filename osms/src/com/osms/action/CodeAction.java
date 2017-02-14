package com.osms.action;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.osms.globle.Constants;


public class CodeAction extends HttpServlet {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String codeNumbers="";

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("ִ��CodeAction����");
		//ͼƬ����
		response.setContentType("image/gif");
		response.setHeader("Pragma", "No-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		
		BufferedImage image=new BufferedImage(Constants.IMAGE_WIDTH,Constants.IMAGE_HEIGHT,BufferedImage.TYPE_INT_BGR);
		
		//��ȡ���ƶ���
		Graphics2D g=(Graphics2D) image.getGraphics();
		//����ͼƬ������ɫ
		g.setColor(createRandomColor(200,300));
		//���
		g.fillRect(0, 0, Constants.IMAGE_WIDTH, Constants.IMAGE_HEIGHT);
		
		//�����ַ�
		for(int i=0;i<4;i++)
		{
			drawString(g, i);
		}
		
		//���Ƹ�����
		drawNoiseLine(g, 5);
		
		//�洢��֤��
		saveCodeInSession(request);
		
		this.codeNumbers="";
		//���
		ServletOutputStream sos=response.getOutputStream();
		ImageIO.write(image, "GIF", sos);
		sos.close();
	}
	
	/**
	 * ����ͼƬ������ɫ
	 * @param bcf ��Сֵ
	 * @param bcl ���ֵ
	 * @return color
	 */
	private Color createRandomColor(int bcf, int bcl)
	{
		boolean flag=true;
		int r=0,g=0,b=0;
		while(flag)
		{
			r=bcf+new Random().nextInt(bcl-bcf);
			g=bcf+new Random().nextInt(bcl-bcf);
			b=bcf+new Random().nextInt(bcl-bcf);
			if((r>=0&&r<=255)&&(g>=0&&g<=255)&&(b>=0&&b<=255))
			{
				flag=false;
			}
		}
		return new Color(r,g,b);
	}


	/**
	 * �����ַ�
	 * @param g ͼ��
	 * @param i ��iλ�ַ�
	 */
	private void drawString(Graphics2D g,int i)
	{
		int j=new Random().nextInt(Constants.IMAGE_CHAR.length());
		String codeNumber=Constants.IMAGE_CHAR.substring(j, j+1);
		g.setColor(Constants.color[new Random().nextInt(Constants.color.length)]);
		g.setFont(Constants.codeFont[new Random().nextInt(Constants.color.length)]);
		g.drawString(codeNumber, 15*i+20, 30);
		this.codeNumbers+=codeNumber;
	}
	
	/**
	 * ���Ƹ�����
	 * @param g ͼ��
	 * @param NoiseLineNumbers ����
	 */
	private void drawNoiseLine(Graphics2D g,int NoiseLineNumbers) 
	{
		for(int i=0;i<NoiseLineNumbers;i++)
		{
			int x1=(int) (1+(Math.random()*120));
			int y1=(int) (1+(Math.random()*40));
			int x2=(int) (1+(Math.random()*120));
			int y2=(int) (1+(Math.random()*40));
			g.setStroke(new BasicStroke(2,BasicStroke.CAP_ROUND,BasicStroke.JOIN_BEVEL));
			g.drawLine(x1, y1, x2, y2);
		}
	}

	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request,response);
	}
	
	/**
	 * ������֤���ַ���
	 * @param request
	 */
	private void saveCodeInSession(HttpServletRequest request) {
		HttpSession session = request.getSession(true);
		// ��֮ǰ����֤���Ƴ������µ���֤�����ݱ����session��
		session.setAttribute(Constants.CHECK_NUMBER_NAME, codeNumbers);
	}
}
