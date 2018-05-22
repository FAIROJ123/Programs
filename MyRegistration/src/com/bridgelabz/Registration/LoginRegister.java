package com.bridgelabz.Registration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginRegister")
public class LoginRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginRegister() {
        super();
        
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
			request.setAttribute("message", u.getName());
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}
		else if(submit.equals("register"))
		{
			u.setName(request.getParameter("name"));
			u.setUsername(request.getParameter("username"));
			u.setPassword(request.getParameter("password"));
			u.setPhonenumber(request.getParameter("phoneNumber"));
			ud.insertUserData(u);
			request.setAttribute("SuccessMessage", "Registration is Done!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			
		}
		else {
			request.setAttribute("ErrorMessage", "Data is Not Found,Click on Registation!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
	}
		
		
}
