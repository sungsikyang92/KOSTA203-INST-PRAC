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
