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
			//아래 jsp는 member 디렉토리 안에 있으므로 
			//디렉토리명까지 기술해야 한다 
			url="member/findbyid-fail.jsp";
		}else {
			request.setAttribute("memberVO", vo);
			url="member/findbyid-ok.jsp";
		}
		return url;
	}
}









