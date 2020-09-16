package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class LoginController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id=request.getParameter("id");
		String pass=request.getParameter("password");
		MemberVO mvo=MemberDAO.getInstance().login(new MemberVO(id,pass));
		String url=null;
		if(mvo==null) {
			url="redirect:login-fail.jsp";
		}
		else {
			url="login-ok,jsp";
			HttpSession session=request.getSession();
			session.setAttribute("mvo", mvo);
		}
		return url;
	}

}
