package step2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberVO;


public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<MemberVO> list;
	@SuppressWarnings("unchecked")
	@Override
	public void init() throws ServletException {
		list=(ArrayList<MemberVO>) getServletContext().getAttribute("list");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		for(int i=0;i<list.size();i++) {
			out.println(i+1+"."+list.get(i).getName()+" "+list.get(i).getAddress()+"<br>");
		}
		out.println("<br><br><a href=index.html>입장페이지로</a>");
		out.close();
	}
}















