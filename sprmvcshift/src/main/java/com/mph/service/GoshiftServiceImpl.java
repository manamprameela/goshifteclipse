package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.GoshiftDao;
import com.mph.entity.Goshift;

@Service
@Transactional
public class GoshiftServiceImpl implements GoshiftService{
	
	@Autowired
	public GoshiftDao goshiftDao;

	@Override
	public void createGoshift(Goshift goshift) {
		
		goshiftDao.createGoshift(goshift);
		
	}

	@Override
	public List<Goshift> getAllGoshift() {
		
		return goshiftDao.getAllGoshift();
	}

	@Override
	public Goshift getGoshift(Goshift goshift) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Goshift> updateGoshift(Goshift goshift) {
		
		return goshiftDao.updateGoshift(goshift);
	}

	@Override
	public List<Goshift> deleteGoshift(int sid) {
		
		return goshiftDao.deleteGoshift(sid);
	}

	@Override
	public Goshift getGoshift(int id) {
		
		return goshiftDao.getGoshift(id);
	}
}
