package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CustomerDAO;

public class HomeController implements Controller {
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int count=CustomerDAO.getInstance().getAllCustomerCount();
		request.setAttribute("count",count);
		return "home.jsp";
	}
}
