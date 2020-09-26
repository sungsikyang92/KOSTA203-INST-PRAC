package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.CompanyDAO;

public class EmployeeListController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// CompanyDAO의 getAllEmployeeList() 호출해서 리스트를 반환받아
		// request에 setAttribute() 한다 
		request.setAttribute("list",CompanyDAO.getInstance().getAllEmployeeList());
		return "employee-list.jsp";
	}
}
