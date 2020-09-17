package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CustomerDAO;

public class IdCheckController implements Controller {

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String id=request.getParameter("id");				
		boolean flag=CustomerDAO.getInstance().idcheck(id);				
		if(flag)
			return "idcheck_fail.jsp";
		else
			return "idcheck_ok.jsp";	
	}

}
