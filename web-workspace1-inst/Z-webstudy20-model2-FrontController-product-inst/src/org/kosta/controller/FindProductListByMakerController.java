package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.ProductDAO;

public class FindProductListByMakerController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String maker=request.getParameter("maker");
		request.setAttribute("list", 
				ProductDAO.getInstance().findProductListByMaker(maker));
		return "productbymaker-list.jsp";
	}

}
