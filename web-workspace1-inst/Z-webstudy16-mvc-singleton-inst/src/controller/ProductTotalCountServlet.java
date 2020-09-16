package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ProductDAO;

/**
 * Servlet implementation class ProductTotalCountServlet
 */
@WebServlet("/ProductTotalCountServlet")
public class ProductTotalCountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int count=ProductDAO.getInstance().getTotalProductCount();
			//view와 공유하기 위해 request에 setAttribute() 한다 
			request.setAttribute("totalcount", count);
			//forward 방식으로 view 이동 
			request.getRequestDispatcher("product-totalcount.jsp").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}











