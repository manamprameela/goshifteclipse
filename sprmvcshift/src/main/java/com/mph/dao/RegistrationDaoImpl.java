package com.mph.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.Registration;

@Repository
public class RegistrationDaoImpl implements RegistrationDao {

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void createRegistration(Registration registration) {

		getSession().saveOrUpdate(registration);
		System.out.println("Registered successfully...");
	}

	@Override
	public List<Registration> getAllRegistration() {
		Query qry = getSession().createQuery("select e from Registration e");
		List<Registration> registrationlist = qry.list();
		System.out.println("Registration list from dao : " + registrationlist);
		return registrationlist;
	}

	@Override
	public Registration getRegistration(Registration registration) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Registration> updateRegistration(Registration registration) {
		Query qry = getSession().createQuery(
				" update Registration  e set gender=:gender,email=:email,location=:location,password=:password where rid=:rid");
		qry.setParameter("gender", registration.getGender());
		qry.setParameter("email", registration.getEmail());
		qry.setParameter("location", registration.getLocation());
		qry.setParameter("password", registration.getPassword());
		qry.setParameter("rid", registration.getRid());
		int noofrows = qry.executeUpdate();
		if (noofrows > 0) {
			System.out.println("Updated " + noofrows + " rows. ");
		}
		return getAllRegistration();
	}

	@Override
	public List<Registration> deleteRegistration(int rid) {
		Query qry = getSession().createQuery(" delete Registration  e where rid=:rid");
		qry.setParameter("rid", rid);
		int noofrows = qry.executeUpdate();
		if (noofrows > 0) {
			System.out.println("Deleted " + noofrows + " rows. ");
		}
		return getAllRegistration();
	}

	@Override
	public Registration getRegistration(int id) {
		Query qry = getSession().createQuery("from Registration e where rid=:id");
		qry.setParameter("id", id);
		Registration registration = (Registration) qry.uniqueResult();
		System.out.println("search result : " + registration);
		return registration;
	}
}
