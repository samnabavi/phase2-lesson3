package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Product;
import com.utility.HibernateUtility;

public class ProductDao {

	public void addProduct(String name, String id, String color, String year) {
		Session session = HibernateUtility.getSession();

		Transaction tx = session.beginTransaction();

		Product p = new Product(name, id, color, year);
	

		session.save(p);
		tx.commit();
		session.close();

	}

	public List<Product> getAllProducts() {
		Session session = HibernateUtility.getSession();
	 
		Transaction tx = session.beginTransaction();
		List<Product> data = session.createQuery("FROM com.model.Product").list();
		
		return data;

	}

}
