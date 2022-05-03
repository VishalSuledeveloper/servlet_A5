package com.Vishal_Sule;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Vishal_Sule extends GenericServlet 
{
	public void service(ServletRequest req, ServletResponse res) throws IOException
	{
		System.out.println("Servlet Performing...");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.print("<h1>This is my first Servlet</h1>");
		
	{

			
			res.setContentType("text/html");
			PrintWriter out1=res.getWriter();
			
			String str1=req.getParameter("n1");
			String str2=req.getParameter("n2");
		
			int num1=Integer.parseInt(str1);
			int num2=Integer.parseInt(str2);
			
			int result=num1+num2;
			
			out1.print("<h1>Your First No is "+num1+" Second No is: "+num2+"</h1>");
			
			out1.print("<h1>Addition of Two no is :"+result+"</h1>");
			
			int result1=num1*num2;
			
			out1.print("<h1>Mulltiplication of two no is:" +result1+"</h1>");
			
			double result2=num1/num2;
			
			out1.print("<h1>Division of two no is:" +result2+"</h1>");
			
			out1.close();
		}
	
		
	}
	
	

}

