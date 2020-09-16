package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ProductDAO;
import model.ProductVO;

/**
 * Servlet implementation class FindProductByIdServlet
 */
@WebServlet("/FindProductByIdServlet")
public class FindProductByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("productId");
		try {
			ProductVO vo=ProductDAO.getInstance().findProductById(id);
			String viewName=null;
			if(vo==null) {
				viewName="find_fail.jsp";
			}else {
				viewName="find_ok.jsp";
				request.setAttribute("pvo", vo);
			}
			request.getRequestDispatcher(viewName).forward(request, response);
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}
}








