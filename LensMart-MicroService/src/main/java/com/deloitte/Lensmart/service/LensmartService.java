package com.deloitte.Lensmart.service;

import java.util.List;

import com.deloitte.Lensmart.entity.Lensmart;

public interface LensmartService {
	
	public List<Lensmart> getLens();
	public Lensmart getByLensId(Integer id);
	public Lensmart addLens(Lensmart lensmart);

}
