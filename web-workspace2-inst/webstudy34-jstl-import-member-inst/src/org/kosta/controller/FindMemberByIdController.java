package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class FindMemberByIdController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id=request.getParameter("id");
		MemberVO vo=MemberDAO.getInstance().findMemberById(id);
		if(vo==null) {
			return "/member/findbyid-fail.jsp";//레이아웃 적용필요없으므로 
		}else {
			request.setAttribute("memberVO", vo);
			request.setAttribute("url", "/member/findbyid-ok.jsp");
			return "/template/login-layout.jsp";
		}
	}
}






