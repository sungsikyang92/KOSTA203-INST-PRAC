package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MockDAO;

public class DeleteCarController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		MockDAO.getInstance().deleteCar(request.getParameter("id"));
		return "redirect:delete-car-result.jsp";
	}

}
