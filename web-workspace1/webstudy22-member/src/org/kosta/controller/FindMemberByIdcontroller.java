package org.kosta.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MemberDAO;
import org.kosta.model.MemberVO;

public class FindMemberByIdcontroller implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		String id=request.getParameter("id");
		MemberVO vo=MemberDAO.getInstance().findMemberById(id);
		String url=null;
		if(vo!=null) {
			url="findmemberbyid-ok.jsp";
			request.setAttribute("vo", vo);
		}
		else
			url="findmemberbyid-fail.jsp";
		return url;
	}

}
