package org.kosta.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.ItemDAO;
import org.kosta.model.ItemDTO;

public class HomeController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ArrayList<ItemDTO> itemDTO=ItemDAO.getInstance().getAllItemList();
		request.setAttribute("itemDTO", itemDTO);
		request.setAttribute("url", "/item/item-list.jsp");
		return "/template/layout.jsp";
	}

}
