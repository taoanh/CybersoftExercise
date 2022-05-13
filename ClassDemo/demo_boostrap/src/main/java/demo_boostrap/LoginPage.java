package demo_boostrap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginPage extends HttpServlet {

	//GET
	//POST
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName = req.getParameter("username");
		String lop = req.getParameter("password");
		
		System.out.println("User name : " + userName + " Class : " + lop);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Kiem tra có chạy vào doPost");
		
		String userName = req.getParameter("username");
		String lop = req.getParameter("password");
		
		System.out.println("Do Post User name : " + userName + " Class : " + lop);
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
		dispatcher.forward(req, resp);
	}
	
	/* 
	 * Từ trang login truyền tham số usename , password qua
	 * trang WelCome
	 * Bên trang Welcome sẽ kiểm tra 
	 * username=cybersoft [Không phân biệt hoa thường]
	 * password=123
	 * Xuất ra câu chào đúng username truyền vào
	 * Nếu sai password hoặc username thì xuất ra
	 * "Tài khoản không hợp lệ"
	 * 
	 * */
	
}
