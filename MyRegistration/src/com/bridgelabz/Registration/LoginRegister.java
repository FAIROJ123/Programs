package com.bridgelabz.Registration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// @WebServlet("/loginRegister")
public class LoginRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginRegister() {
       
        
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserDAO ud= new UserDAOImpl();
		String userName=request.getParameter("name");
		String password=request.getParameter("password");
		String submit=request.getParameter("submit");
		System.out.println("userName : "+userName);
		System.out.println("password : "+password);
		System.out.println("submit : "+submit);
		User u=ud.getUser(userName, password);
		
		
		if(submit.equals("login")&& u!=null && u.getName()!=null)
		{
			HttpSession session =  request.getSession();
			session.setAttribute("message", u.getUsername());
			response.sendRedirect("welcome.jsp");
			
		}
		else if(submit.equals("register"))
		{
			u.setName(request.getParameter("name"));
			u.setUsername(request.getParameter("username"));
			u.setPassword(request.getParameter("password"));
			u.setPhonenumber(request.getParameter("phoneNumber"));
			if((!u.getName().equals("")) && (!u.getPassword().equals("")) && (!u.getUsername().equals("")) && (!u.getPhonenumber().equals("")))
			{
				ud.insertUserData(u);
				request.setAttribute("SuccessMessage", "Registration is Done!");
				response.sendRedirect("login.jsp");
			}
			else {
				request.setAttribute("SuccessMessage", "Required all feilds...!!!");
				request.getRequestDispatcher("register.jsp").forward(request, response);
			}
			
			
		}
		else {
			
			
			request.setAttribute("ErrorMessage", "Invalid username or password..!");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			
		
		}
		
	
		
	}
		
		
}
