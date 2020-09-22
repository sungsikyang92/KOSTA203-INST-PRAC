package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.ItemDAO;
import org.kosta.model.ItemDTO;

public class ItemDetailController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String name=request.getParameter("name");
		ItemDTO dto=ItemDAO.getInstance().getItemDetail(name);
		request.setAttribute("url", "/item/item-detail.jsp");
		request.setAttribute("dto", dto);
		return "/template/layout.jsp";
	}

}
