package com.AC.servlrt;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.AC.Data.User;

@WebServlet("/Registerservlet")
public class Registerservlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
//	super.doGet(req, resp);
	
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		String name=req.getParameter("username");
		String pwd=req.getParameter("pwd");
		String cpwd=req.getParameter("cpwd");
		User user=new User();
		if (pwd.equals(cpwd)) {
			user.setIssuccess(true);
			user.setUsername(name);
			user.setPwd(pwd);
			user.setResult("ע��ɹ����뷵�ص�¼");
		}else {
			user.setIssuccess(false);
			user.setResult("ע��ʧ�ܣ��������벻һ�£��뷵������ע��");
		}
		User.userlist.add(user);
		req.setAttribute("user", user);
		req.getRequestDispatcher("result.jsp").forward(req, resp);
	}
}
