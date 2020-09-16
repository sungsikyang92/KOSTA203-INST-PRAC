package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CarVO;
import model.MockDAO;

/**
 * Servlet implementation class SelectCarByIdServlet
 */
@WebServlet("/SelectCarByIdServlet")
public class SelectCarByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("carId");
		CarVO car=MockDAO.getInstance().selectCarById(id);
		String url=null;
		if(car==null) {
			url="selectcar-fail.jsp";
		}else {
			request.setAttribute("car", car);
			url="selectcar-ok.jsp";
		}		
		request.getRequestDispatcher(url).forward(request, response);
	}
}












