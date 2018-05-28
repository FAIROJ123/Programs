package com.servlet.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Register implements Filter{
	
	
	public Register() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}


	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		 

		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String uname=request.getParameter("username");
		String psw=request.getParameter("password");
		String name=request.getParameter("name");
		String pho=request.getParameter("phoneNumber");
		
		if((!uname.equals("")) || (!psw.equals("") )||(!name.equals("")) ||(!pho.equals("")))
		{
		
		chain.doFilter(request, response);
	}
		else {
			
			out.print("All feilds are required for registration...!");
			RequestDispatcher rd=request.getRequestDispatcher("register.jsp");  
		    rd.include(request, response);  
			
		}
		out.close();
	}
	

}
