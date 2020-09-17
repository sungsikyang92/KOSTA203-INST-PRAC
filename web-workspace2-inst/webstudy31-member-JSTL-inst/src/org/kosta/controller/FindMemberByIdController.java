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
		String url=null;
		if(vo==null) {
			url="findMemberById-fail.jsp";
		}else {
			request.setAttribute("memberVO", vo);
			url="findMemberById-ok.jsp";
		}
		return url;
	}
}









