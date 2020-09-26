package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.ItemDAO;
import org.kosta.model.ItemDTO;

public class ItemDetailController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String itemNo=request.getParameter("itemNo");
		ItemDTO dto=ItemDAO.getInstance().findItemByNO(itemNo);
		request.setAttribute("itemDTO", dto);
		request.setAttribute("url", "/item/item-detail.jsp");
		return "/template/layout.jsp";
	}

}
