package firstProject.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.print.attribute.standard.RequestingUserName;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/Sang", "/trangchu"})
public class MeowControllers extends HttpServlet { 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7289683252224843528L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		String ten1 = req.getParameter("ten");
		String ho1 = req.getParameter("ho");
//		PrintWriter printW = resp.getWriter();
//		printW.println(ho1 + " " + ten1);
//		printW.close();
		
		//đưa dữ liệu ra view
		req.setAttribute("fname", ho1);
		req.setAttribute("lname", ten1);
		
		RequestDispatcher rd = req.getRequestDispatcher("/views/login.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(req, resp);
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doDelete(req, resp);
	}
	
	

}
