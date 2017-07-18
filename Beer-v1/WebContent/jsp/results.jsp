<%@ page import="java.util.*" %>
<html>
<head>
	<title>Beer Selector</title>
</head>

<body>

	<div align="center">
		<h1>Beer Recommendations JSP</h1>
		<br/><br/>
		<%
			List<String> styles = (List)request.getAttribute("styles");
			Iterator<String> it = styles.iterator();
			while(it.hasNext()) {
				out.print("<br/>Try out, " + it.next());
			}
		%>
	</div>
</body>
</html>