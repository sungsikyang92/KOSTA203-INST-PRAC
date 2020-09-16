package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CarVO;
import model.MockDAO;

/**
 * MVC 의 Front Controller 역할을 담당 
 * 모든 클라이언트의 요청을 처리한다 
 */
@WebServlet("/front")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.handleRequest(request, response);
	}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//post 방식 한글처리 
		request.setCharacterEncoding("utf-8");
		this.handleRequest(request, response);
	}
	/*
	 *  모든 클라이언트 요청을 처리 
	 */
	protected void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command=request.getParameter("command");
		boolean redirect=false;
		String url=null;
		try {
			if(command.contentEquals("selectCar")) {
				String id=request.getParameter("carId");
				CarVO vo=MockDAO.getInstance().selectCarById(id);
				if(vo==null) {
					redirect=true;
					url="selectcar-fail.jsp";
				}else {
					request.setAttribute("car", vo);
					url="selectcar-ok.jsp";
				}
			}else if(command.contentEquals("registerCar")) {
				/* registercar-form.jsp 의 form 정보를 수정한다 
				 * ( action 수정 , hidden 추가 )
				 * -------------------------------
				 * 클라이언트가 보낸 차량정보를 받아온다 
				 * MockDAO 의 registerCar() 실행 
				 * 적절한 변수 할당을 해서 응답하게 한다 
				 */
				String id=request.getParameter("carId");
				String owner=request.getParameter("owner");
				String model=request.getParameter("model");
				String address=request.getParameter("address");
				MockDAO.getInstance().registerCar(new CarVO(id,owner,model,address));
				url="car-register-result.jsp";
				redirect=true;
			}
			if(redirect)
				response.sendRedirect(url);
			else
				request.getRequestDispatcher(url).forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
			response.sendRedirect("error.jsp");
		}
	}//method
}//class































