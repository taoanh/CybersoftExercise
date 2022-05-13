package demo_boostrap;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo_boostrap.pojo.Product;

@WebServlet("/product")
public class ProductPage extends HttpServlet {
	
	List<Product> listProducts = new ArrayList<Product>();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		List<Product> list = new ArrayList<Product>();
//		
//		Product product1 = new Product();
//		product1.setName("Dầu gội đầu");
//		product1.setGia("10.000 VNĐ");
//		product1.setSoluong(1);
//		
//		Product product2 = new Product();
//		product2.setName("Dầu Xã");
//		product2.setGia("15.000 VNĐ");
//		product2.setSoluong(2);
//		
//		Product product3 = new Product();
//		product3.setName("Sữa Tắm");
//		product3.setGia("15.000 VNĐ");
//		product3.setSoluong(1);
//		
//		list.add(product1);
//		list.add(product2);
//		list.add(product3);
//		
//		req.setAttribute("products", list);
		RequestDispatcher dispatcher = req.getRequestDispatcher("product.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		String tensp = req.getParameter("tensp");
		int soluong = Integer.parseInt(req.getParameter("soluong"));
		String giaban = req.getParameter("giaban");
		
		Product product = new Product();
		product.setName(tensp);
		product.setGia(giaban);
		product.setSoluong(soluong);
		
		listProducts.add(product);
		
		req.setAttribute("products", listProducts);
		RequestDispatcher dispatcher = req.getRequestDispatcher("product.jsp");
		dispatcher.forward(req, resp);
	}
	
}
