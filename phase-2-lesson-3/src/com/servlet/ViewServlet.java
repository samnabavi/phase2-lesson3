package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dao.ProductDao;
import com.model.Product;
import com.utility.HibernateUtility;

/**
 * Servlet implementation class ViewServlet
 */
@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		Session session = HibernateUtility.getSession();
//		
//		Transaction tx = session.beginTransaction();
//		
//		List<Product> data = session.createQuery("from PRODUCTS").list();
//		for( Product ob : data) {
//			
//			response.getWriter().println(ob);
//		}
//		session.close();
		
		ProductDao pd = new ProductDao();
		List<Product> lst = pd.getAllProducts();
		for (Product p : lst) {
			response.getWriter().println(p);
		}		
		
		
		
	}

}
