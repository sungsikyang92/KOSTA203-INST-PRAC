package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class LoginController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		MemberVO vo=MemberDAO.getInstance().login(id, password);
		String url=null;
		if(vo==null) {
			url="redirect:member/login-fail.jsp";
		}else {
			request.getSession().setAttribute("mvo", vo);
			url="redirect:front?command=home";
		}
		return url;
	}

}









