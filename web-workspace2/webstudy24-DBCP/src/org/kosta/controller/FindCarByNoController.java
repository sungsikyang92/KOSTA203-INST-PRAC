package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.CarDAO2;
import org.kosta.model.CarDTO;

public class FindCarByNoController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String url=null;
		String carNo=request.getParameter("carNo");
		CarDTO carDTO=CarDAO2.getInstance().findCarByNo(carNo);
		if(carDTO==null) {
			url="findcar-fail.jsp";
		}else {
			url="findcar-ok.jsp";
			request.setAttribute("carDTO", carDTO);
		}
		return url;
	}

}
