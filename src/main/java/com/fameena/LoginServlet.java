package com.fameena;



import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fameena.dao.LoginDao;
import com.fameena.model.LoginModel;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		System.out.println("i am inside Servlet");
		try {
			String uname=request.getParameter("uname");
			String password=request.getParameter("password");
			LoginModel model=new LoginModel(uname,password);
		LoginDao dao=new LoginDao();
	
		HttpSession session=request.getSession();
		session.setAttribute("model",model);
		boolean s=dao.check(uname, password);
		RequestDispatcher rd;
		if(s==true)
		{
			rd=request.getRequestDispatcher("welcome.jsp");
			rd.forward(request, response);	
		}
		else {
			System.out.println("I am inside else after db false");
			 rd=request.getRequestDispatcher("loginError.jsp");
				rd.forward(request, response);
				
		}
		
		
	}catch(Exception e) {
		
		e.printStackTrace();
	}
}
}
