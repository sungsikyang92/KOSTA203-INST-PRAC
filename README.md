<pre>
<h3>JSP</h3>
JSP= Java Server Page/ html코드를 사용하는데 java코드도 같이 사용할 수 있다
<jsp:forward page=""> page=""로 이동시켜준다.
<jsp:param value="" name=""> name에 command를 넣고 value에 controller에 보내는 명령어를 집어 넣는다. Parameter- 매개변수...지역변수..
</pre><hr>

<pre>
<h3>Singleton!!</h3>
private static "DataType" instance=new "DataType"();
private "DataType"(){}
public static "DataType" getInstance(){
	return instance;
}
</pre><hr>
<pre>
<h3>HandlerMapping에서 handleRequest 작성법</h3>
protected void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String command=request.getParameter("command");
			Controller controller=HandlerMapping.getInstance().create(command);
			String url=controller.execute(request, response).trim();
			if(url.startsWith("redirect:"))
				response.sendRedirect(url.substring(9));
			else
				request.getRequestDispatcher(url).forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();//예외 메세지와 발생 경로를 콘솔에 모두 출력 할 수 있게 해준다.
			response.sendRedirect("error.jsp");
		}
	}
	</pre><hr>
	<pre>
	<h3>Database Connection Pool 객체를 생성해 공유하는 클래스</h3>
 * 	DBCP → 시스템 성능 향상을 위해 DB 커넥션을 생성, 소멸시키지 않고 미리 생성한 커넥션을 빌려주고 반납
 * 	javax.sql.DataSource Interface 타입으로 DBCP를 관리한다. 
 * 	이유는 WAS가 변경되면 DBCP도 변경될 수 있으므로 추상화된 인터페이스 타입으로 관리하는 것이 유지보수에 유리하다
 *
public class DataSourceManager {
	private static DataSourceManager instance=new DataSourceManager();
	private DataSource dataSource;
	
	private DataSourceManager() {
		//was tomcat에서 제공하는 dbcp를 생성해서 사용한다.
		BasicDataSource dbcp=new BasicDataSource();
		dbcp.setDriverClassName(driverClassName);
		dbcp.setUrl(url);
		dbcp.setUsername(userName);
		dbcp.setPassword(password);
		dbcp.setInitialSize(initialSize);
		dbcp.setMaxTotal(maxTotal);
		this.dataSource=dbcp;
	}
	public static DataSourceManager getInstance() {
		return instance;
	}
	public DataSource getDataSource() {
		return dataSource;
	}
}
</pre><hr>
<pre>
<h3>DAO에서의 Singleton과 DBCP 사용하기위한 준비</h3>
public class ItemDAO {
	private static ItemDAO instance=new ItemDAO();
	private DataSource datasource;
	private ItemDAO() {
		this.datasource=DataSourceManager.getInstance().getDataSource();
	}
	public static ItemDAO getInstance() {
		return instance;<br>
	}
</pre><hr>
<pre>
<h3>Controller에서 Controller Interface 만들기</h3>
public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception;
</pre><hr>
<pre>
<h3>StringBuilder 사용법</h3>
StringBuilder sql=new StringBuilder();
sql.append("sql... ");
sql.append("sql... ");
sql.append("sql...");
</pre><hr>
