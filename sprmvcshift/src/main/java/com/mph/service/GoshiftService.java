package com.mph.service;

import java.util.List;

import com.mph.entity.Goshift;

public interface GoshiftService {
	public void createGoshift(Goshift goshift);
	public List<Goshift> getAllGoshift();
	public Goshift getGoshift(Goshift goshift);
	public List<Goshift> updateGoshift(Goshift goshift);
	public List<Goshift> deleteGoshift(int sid);
	public  Goshift getGoshift(int id);
}
