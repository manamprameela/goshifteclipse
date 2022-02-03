package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.RegistrationDao;
import com.mph.entity.Registration;

@Service
@Transactional
public class RegistrationServiceImpl implements RegistrationService{
	
	@Autowired
	public RegistrationDao registrationDao;

	@Override
	public void createRegistration(Registration registration) {
		
		registrationDao.createRegistration(registration);
	}

	@Override
	public List<Registration> getAllRegistration() {
		
		return registrationDao.getAllRegistration();
	}

	@Override
	public Registration getRegistration(Registration registration) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Registration> updateRegistration(Registration registration) {
		
		return registrationDao.updateRegistration(registration);
	}

	@Override
	public List<Registration> deleteRegistration(int rid) {
		
		return registrationDao.deleteRegistration(rid);
	}

	@Override
	public Registration getRegistration(int id) {
		
		return registrationDao.getRegistration(id);
	}
}
