package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.ItemDAO;

public class HomeController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String url=null;
		request.setAttribute("list", ItemDAO.getInstance().getAllItemList());
		//layout 적용되면서 item/item-list.jsp가 메인 화면으로 제공되도록 한다 
		request.setAttribute("url", "/item/item-list.jsp");
		url="/template/layout.jsp";
		return url;
	}
}











