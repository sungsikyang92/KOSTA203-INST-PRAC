<h3>JSP</h3>
JSP= Java Server Page/ html코드를 사용하는데 java코드도 같이 사용할 수 있다<br>
<jsp:forward page=""> page=""로 이동시켜준다.<br>
<jsp:param value="" name=""> name에 command를 넣고 value에 controller에 보내는 명령어를 집어 넣는다. Parameter- 매개변수...지역변수..<hr>

<h3>Singleton!!</h3><br>
private static "DataType" instance=new "DataType"();<br>
private "DataType"(){}<br>
public static "DataType" getInstance(){<br>
	return instance;<br>
}<hr>
<h3>HandlerMapping에서 handleRequest 작성법</h3><br>
protected void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {<br>
		try {<br>
			String command=request.getParameter("command");<br>
			Controller controller=HandlerMapping.getInstance().create(command);<br>
			String url=controller.execute(request, response).trim();<br>
			if(url.startsWith("redirect:"))<br>
				response.sendRedirect(url.substring(9));<br>
			else<br>
				request.getRequestDispatcher(url).forward(request, response);<br>
		}catch(Exception e) {<br>
			e.printStackTrace();//예외 메세지와 발생 경로를 콘솔에 모두 출력 할 수 있게 해준다.<br>
			response.sendRedirect("error.jsp");<br>
		}<br>
	}<hr>
	<h3>Database Connection Pool 객체를 생성해 공유하는 클래스</h3><br>
 * 	DBCP → 시스템 성능 향상을 위해 DB 커넥션을 생성, 소멸시키지 않고 미리 생성한 커넥션을 빌려주고 반납<br>
 * 	javax.sql.DataSource Interface 타입으로 DBCP를 관리한다. <br>
 * 	이유는 WAS가 변경되면 DBCP도 변경될 수 있으므로 추상화된 인터페이스 타입으로 관리하는 것이 유지보수에 유리하다<br>
 */<br>
public class DataSourceManager {<br>
	private static DataSourceManager instance=new DataSourceManager();<br>
	private DataSource dataSource;<br>
	<br>
	private DataSourceManager() {<br>
		//was tomcat에서 제공하는 dbcp를 생성해서 사용한다.<br>
		BasicDataSource dbcp=new BasicDataSource();<br>
		dbcp.setDriverClassName(driverClassName);<br>
		dbcp.setUrl(url);<br>
		dbcp.setUsername(userName);<br>
		dbcp.setPassword(password);<br>
		dbcp.setInitialSize(initialSize);<br>
		dbcp.setMaxTotal(maxTotal);<br>
		this.dataSource=dbcp;<br>
	}<br>
	public static DataSourceManager getInstance() {<br>
		return instance;<br>
	}<br>
	public DataSource getDataSource() {<br>
		return dataSource;<br>
	}<br>
}<hr>
<h3>DAO에서의 Singleton과 DBCP 사용하기위한 준비</h3><br>
public class ItemDAO {<br>
	private static ItemDAO instance=new ItemDAO();<br>
	private DataSource datasource;<br>
	private ItemDAO() {<br>
		this.datasource=DataSourceManager.getInstance().getDataSource();<br>
	}<br>
	public static ItemDAO getInstance() {<br>
		return instance;<br>
	}<hr>
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
