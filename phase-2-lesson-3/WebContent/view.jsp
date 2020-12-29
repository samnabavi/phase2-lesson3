<%@page import="com.utility.HibernateUtility"%>
<%@page import="com.model.Product"%>
<%@page import="com.dao.ProductDao"%>

<%@page import="java.util.List"%>


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
		ProductDao pd = new ProductDao();
	List<Product> lst = pd.getAllProducts();
	for (Product p : lst) {
		response.getWriter().println(p);
		response.getWriter().println("</br>");

		System.out.println(p);
	}
	

	 
	 
	 
	 %>
	 
	 <a href='index.jsp'>Main Menu</a>

</body>
</html>