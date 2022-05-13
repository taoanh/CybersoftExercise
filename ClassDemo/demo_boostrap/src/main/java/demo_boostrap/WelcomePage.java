package demo_boostrap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class WelcomePage extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		req.setCharacterEncoding("UTF-8");
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String message = "";
		
		if(username.toLowerCase().equals("cybersoft") && password.equals("123")) {
			message = "Hello " + username;
		}else {
			message = "Tài khoản không hợp lệ";
		}
		
		req.setAttribute("message", message);
		RequestDispatcher dispatcher = req.getRequestDispatcher("welcome.jsp");
		dispatcher.forward(req, resp);
	}
	
	
	/* 
	 * <% Code Java %>
	 * <%= %> -> Xuất gì đó ra màn hình
	 * <%! %> -> Khai báo biến
	 * */
}

/* 
 * Tạo ra page product -> done
 * Danh sách danh product -> done
 * => chứa đối tượng product [name,soluong,gia] -> done
 * Truyền ra page product và hiển thị lên -> done
 * thẻ table có sử dụng boostrap
 *
 * */
