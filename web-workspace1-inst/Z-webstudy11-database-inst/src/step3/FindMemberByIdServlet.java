package step3;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FindMemberByIdServlet
 */
@WebServlet("/FindMemberByIdServlet")
public class FindMemberByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String dbUrl;
	private String userName;
	private String userPass;
	@Override
		public void init() throws ServletException {
			this.dbUrl=getServletContext().getInitParameter("dbUrl");
			this.userName=getServletContext().getInitParameter("userName");
			this.userPass=getServletContext().getInitParameter("userPass");
		}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("<html><body bgcolor=yellow>");
		try {
		Connection con=DriverManager.getConnection(this.dbUrl, this.userName, this.userPass);
		String sql="select name,address from web_member where id=?";
		PreparedStatement pstmt=con.prepareStatement(sql);
		String id=request.getParameter("memberId");
		pstmt.setString(1, id);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
			out.println("아이디:"+id+"<br>");
			out.println("이름:"+rs.getString(1)+"<br>");
			out.println("주소:"+rs.getString(2));
		}else {
			out.println(id+"아이디에 대한 회원정보가 없습니다");
		}
		rs.close(); pstmt.close(); con.close(); 
		}catch(Exception e) {
			e.printStackTrace();
		}
		out.println("</body></html>");
		out.close();
	}
}











