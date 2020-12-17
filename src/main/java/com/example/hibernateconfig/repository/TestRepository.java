package com.example.hibernateconfig.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestRepository {

	private SessionFactory sessionFactory;

	@Autowired
	public TestRepository(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void createTable() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		NativeQuery query = session
				.createNativeQuery("create table person ( first_name VARCHAR(250), last_name VARCHAR(250))");
		query.executeUpdate();
		session.close();
	}
}
