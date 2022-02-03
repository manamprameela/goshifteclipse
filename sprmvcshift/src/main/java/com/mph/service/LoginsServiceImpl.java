package com.mph.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.LoginsDao;
import com.mph.entity.Logins;

/**
 * @author Prasanna Devi
 * @author Siva Krishna
*/
@Service
@Transactional
public class LoginsServiceImpl implements LoginsService{
	
	@Autowired
	public LoginsDao loginsDao;

	/** Gets the employee’s logins.
	 * @return the employee’s logins.
	*/
	@Override
	public void createLogins(Logins logins) {

		loginsDao.createLogins(logins);
		
	}
}
