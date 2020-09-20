package org.study.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.study.model.AdminDAO;
import org.study.model.AdminVO;

public class AdminLoginController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id=request.getParameter("id");
		String pass=request.getParameter("pass");
		String url=null;
		AdminVO avo=AdminDAO.getInstance().adminLogin(new AdminVO(id,pass));
		if(avo==null) 
			url="redirect:login-fail.jsp";
		else {
			url="redirect:login-ok.jsp";
			HttpSession session=request.getSession();
			session.setAttribute("avo", avo);
		}
		
		return url;
	}

}
