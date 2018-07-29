package com.AC.servlrt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.AC.Data.User;

@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		String name=req.getParameter("username");
		String pwd=req.getParameter("pwd");
		System.out.println(name);
		System.out.println(pwd);
		boolean Istrue=false;
		for (User user : User.userlist) {
			if (user.getUsername().equals(name)&&user.getPwd().equals(pwd)) {
				Istrue=true;
				break;
			}
		}
		if(Istrue) {
			req.getRequestDispatcher("success.jsp").forward(req, resp);
		}else {
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			out.println("<script>alert('用户名或密码错误，请重新输入')</script>");
			out.println("</HTML>");
			out.flush();
			out.close();
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		req.setCharacterEncoding("utf-8");
		this.doGet(req,resp);
	}
	

}
