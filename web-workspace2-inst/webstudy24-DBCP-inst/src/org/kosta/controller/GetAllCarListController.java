package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.CarDAO2;

public class GetAllCarListController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setAttribute("list", CarDAO2.getInstance().getAllCarList());
		return "car-list.jsp";
	}

}
