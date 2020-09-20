package org.kosta.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.MemberDAO;

public class GetAddressKindController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ArrayList<String> addressList=MemberDAO.getInstance().getAddressKind();
		request.setAttribute("addressList", addressList);
		return "member/address-list.jsp";
	}
}
