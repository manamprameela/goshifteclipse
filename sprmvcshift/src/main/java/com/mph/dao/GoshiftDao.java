package com.mph.dao;

import java.util.List;

import com.mph.entity.Goshift;

public interface GoshiftDao {
	public void createGoshift(Goshift goshift);
	public List<Goshift> getAllGoshift();
	public Goshift getGoshift(Goshift goshift);
	public List<Goshift> updateGoshift(Goshift goshift);
	public List<Goshift> deleteGoshift(int sid);
	public  Goshift getGoshift(int id);
}
