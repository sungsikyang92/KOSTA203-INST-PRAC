/**
 * 
 */
package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author KOSTA
 *
 */
public class FindItemController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setAttribute("url", "/product/find-item-result.jsp");
		request.setAttribute("product", "참이슬후레쉬");
		return "/template/layout.jsp";
	}

}










