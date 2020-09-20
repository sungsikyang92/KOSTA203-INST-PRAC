package org.study.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.study.model.MenuDAO;
import org.study.model.MenuVO;

public class RegisterMenuController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String menuname=request.getParameter("menuname");
		int menuprice=Integer.parseInt(request.getParameter("menuprice"));
		String menuinfo=request.getParameter("menuexplain");
		MenuVO menuvo=new MenuVO(menuname,menuprice,menuinfo);
		MenuDAO.getInstance().newMenu(menuvo);
		request.setAttribute("mvo", menuvo);
		return "register-result.jsp"; // redirect로 해야하는데 안돼 어찌합니까
	}

}
