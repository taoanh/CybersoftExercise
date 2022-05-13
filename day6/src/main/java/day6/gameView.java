package day6;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/game")
public class gameView extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int MIN_VALUE = 1;
	private static final int MAX_VALUE = 1000;
	private static final int RANGE = MAX_VALUE - MIN_VALUE +1;
	private int targetNumber;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("msg", "Một số ngẫu nhiên trong khoản [1-1000] đã được sinh ra. Bạn có nhiệm vụ chọn chính xác số ngẫu nhiên này.");
		targetNumber = (int)(Math.random()*RANGE) + MIN_VALUE;	
		req.getRequestDispatcher("game.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}
}
