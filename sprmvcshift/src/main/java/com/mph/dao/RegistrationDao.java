package com.mph.dao;

import java.util.List;

import com.mph.entity.Registration;

public interface RegistrationDao {
	public void createRegistration(Registration registration);
	public List<Registration> getAllRegistration();
	public Registration getRegistration(Registration registration);
	public List<Registration> updateRegistration(Registration registration);
	public List<Registration> deleteRegistration(int rid);
	public  Registration getRegistration(int id);
}
