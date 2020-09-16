package step2;

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
 * Servlet implementation class FindMemberCountServlet
 */
@WebServlet("/FindMemberCount")
public class FindMemberCountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// 드라이버 로딩은 웹어플리케이션에서 한번만 실행하면 되므로 ServletContextListener의 
	// contextInitialized() 에서 하도록 한다 
   // private String dbDriver;  
    private String dbUrl;
    private String userName;
    private String userPass;
	@Override
	public void init() throws ServletException {
	//	this.dbDriver=getServletContext().getInitParameter("dbDriver");
		this.dbUrl=getServletContext().getInitParameter("dbUrl");
		this.userName=getServletContext().getInitParameter("userName");
		this.userPass=getServletContext().getInitParameter("userPass");
	}
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println("<html><body bgcolor=yellow>");
		//out.println(getServletConfig().getServletName());
		try {
			//Class.forName(this.dbDriver); // 서블릿컨텍스트 리스너에서 로딩한다 
			//System.out.println("db driver loading");
			String url=this.dbUrl;
			Connection con=DriverManager.getConnection(url,this.userName,this.userPass);
			System.out.println("db connection");
			String sql="select count(*) from web_member";
			PreparedStatement pstmt=con.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			rs.next();//커서를 아래로 이동시킨다 
			out.println("총 회원수:"+rs.getInt(1));
			rs.close();
			pstmt.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		out.println("</body></html>");
		out.close();
	}

}













