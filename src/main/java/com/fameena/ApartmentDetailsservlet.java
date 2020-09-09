package com.fameena;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fameena.dao.LoginDao;
import com.fameena.model.ApartmentDetailModel;
import com.fameena.model.LoginModel;
@WebServlet("/details")
public class ApartmentDetailsservlet extends HttpServlet{

public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		System.out.println("i am inside Servlet Apartment");
		try {
			int Apartmentno;
		int personid=Integer.parseInt(request.getParameter("id"));
		System.out.println(personid);
			int residentNo;
			int energy;
			int carport;
			int washer;
			ApartmentDetailModel model=new ApartmentDetailModel();
		
		
	}catch(Exception e) {
		
		e.printStackTrace();
	}
}
}
