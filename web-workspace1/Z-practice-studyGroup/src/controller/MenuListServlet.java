package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import a_model.MenuDAO;
import a_model.MenuVO;

/**
 * Servlet implementation class MenuListServlet
 */
@WebServlet("/MenuListServlet")
public class MenuListServlet extends HttpServlet implements Controller {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			ArrayList<MenuVO> list=MenuDAO.getInstance().getAllMenuList();
			request.setAttribute("list", list);
			request.getRequestDispatcher("A-orderFood-form.jsp").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
