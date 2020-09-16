package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.ProductDAO;
import org.kosta.model.ProductVO;

public class RegisterProductController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String name=request.getParameter("name");
		String maker=request.getParameter("maker");
		int price=Integer.parseInt(request.getParameter("price"));
		ProductVO productVO=new ProductVO(name,maker,price);		
		ProductDAO.getInstance().register(productVO);
		return "redirect:register-result.jsp";
	}

}
