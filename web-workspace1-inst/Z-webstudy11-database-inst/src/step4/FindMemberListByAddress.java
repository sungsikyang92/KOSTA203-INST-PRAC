package step4;

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
 * Servlet implementation class FindMemberListByAddress
 */
@WebServlet("/FindMemberListByAddress")
public class FindMemberListByAddress extends HttpServlet {
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
		//client로부터 전달되는 address를 반환받는다 
		String address=request.getParameter("address");
		out.println(address+"에 사는 회원 명단<br><br>");
		try {
			Connection con=DriverManager.getConnection(dbUrl, userName, userPass);
			String sql="select id,name from web_member where address=?";
			PreparedStatement pstmt=con.prepareStatement(sql);
			pstmt.setString(1, address);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				out.println(rs.getString(1)+" ");
				out.println(rs.getString(2)+"<br>");
			}
			rs.close(); pstmt.close(); con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		out.println("</body></html>");
	}
}
























