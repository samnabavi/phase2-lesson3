<%@page import="com.utility.HibernateUtility"%>
<%@page import="com.model.Product"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<%
		org.hibernate.Session hibSession = HibernateUtility.getSession();

	org.hibernate.Transaction tx = hibSession.beginTransaction();
	session = request.getSession();
	Product product = (Product) session.getAttribute("productse");

	hibSession.save(product);
	tx.commit();
	
	
		%>
		
		<a href="view.jsp">View</a>

</body>
</html>