package org.kosta.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.ProductDAO;

public class MakerKindController implements Controller {
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ArrayList<String> list=ProductDAO.getInstance().getMakerList();
		request.setAttribute("list", list);
		return "maker-form.jsp";
	}
}
