package com.mph.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.Logins;
/**
 * @author Prasanna Devi
 * @author Siva Krishna
*/
@Repository
public class LoginsDaoImpl implements LoginsDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	/** Gets the employee’s logins.
	 * @return the employee’s logins.
	*/
	@Override
	public void createLogins(Logins logins) {

		getSession().saveOrUpdate(logins);
		System.out.println("Login successfully...");
		
	}
	
	
}
