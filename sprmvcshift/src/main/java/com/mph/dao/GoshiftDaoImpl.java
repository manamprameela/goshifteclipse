package com.mph.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.Goshift;

@Repository
public class GoshiftDaoImpl implements GoshiftDao {

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void createGoshift(Goshift goshift) {

		getSession().saveOrUpdate(goshift);
		System.out.println("Inserted successfully...");

	}

	@Override
	public List<Goshift> getAllGoshift() {
		Query qry = getSession().createQuery("select e from Goshift e");
		List<Goshift> shiftlist = qry.list();
		System.out.println("shift list from dao : " + shiftlist);
		return shiftlist;
	}

	@Override
	public Goshift getGoshift(Goshift goshift) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Goshift> updateGoshift(Goshift goshift) {
		Query qry = getSession()
				.createQuery(" update Goshift  e set sname=:sname,sdate=:sdate,stime=:stime where sid=:sid");
		qry.setParameter("sname", goshift.getSname());
		qry.setParameter("sdate", goshift.getSdate());
		qry.setParameter("stime", goshift.getStime());
		qry.setParameter("sid", goshift.getSid());
		int noofrows = qry.executeUpdate();
		if (noofrows > 0) {
			System.out.println("Updated " + noofrows + " rows. ");
		}
		return getAllGoshift();
	}

	@Override
	public List<Goshift> deleteGoshift(int sid) {
		Query qry = getSession().createQuery(" delete Goshift  e where sid=:sid");
		qry.setParameter("sid", sid);
		int noofrows = qry.executeUpdate();
		if (noofrows > 0) {
			System.out.println("Deleted " + noofrows + " rows. ");
		}
		return getAllGoshift();
	}

	@Override
	public Goshift getGoshift(int id) {
		Query qry = getSession().createQuery("from Goshift e where sid=:id");
		qry.setParameter("id", id);
		Goshift shift = (Goshift) qry.uniqueResult();
		System.out.println("search result : " + shift);
		return shift;
	}

}
