package com.cybersoft.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybersoft.common.Constant;
import com.cybersoft.model.UserModel;
import com.cybersoft.pojo.User;

@WebServlet("/login")
public class LoginController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("login.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		User user = UserModel.getUser(email, password);
		if(user != null) {
			Cookie cookie = new Cookie(Constant.COOKIES_USER, user.getEmail());
			cookie.setMaxAge(600);
			resp.addCookie(cookie);
			
			resp.sendRedirect(req.getContextPath()+"/admin");
		}else {
			System.out.println("Đăng nhập thất bại");
		}
	}
}
