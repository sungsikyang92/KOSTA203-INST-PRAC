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
 * Servlet implementation class RegisterCarServlet
 */
@WebServlet("/RegisterCarServlet")
public class RegisterCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; 
	/*
	 		1. client가 보낸 폼데이터를 받는다 (request.getParameter(name) )
	 		2. Model  MockDAO의 registerCar() 를 실행시킨다 
	 		3. 결과 페이지로 리다이렉트 방식으로 이동시킨다 
	 		   ( response.sendRedirect(url) ) 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//post 방식 한글 인코딩 
		String id=request.getParameter("carId");
		String owner=request.getParameter("owner");
		String model=request.getParameter("model");
		String address=request.getParameter("address");
		MockDAO.getInstance().registerCar(new CarVO(id,owner,model,address));
		response.sendRedirect("car-register-result.jsp");
		// 클라이언트가 재요청시 동작이 반복될 수 있다 ( insert 시에는 적합하지 않다 ) 
		//request.getRequestDispatcher("car-register-result.jsp").forward(request, response);
	}
}





















