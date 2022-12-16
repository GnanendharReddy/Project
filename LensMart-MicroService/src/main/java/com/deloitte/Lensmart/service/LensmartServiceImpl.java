package com.deloitte.Lensmart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.Lensmart.dao.LensmartRepository;
import com.deloitte.Lensmart.entity.Lensmart;
import com.netflix.discovery.converters.Auto;

@Service
public class LensmartServiceImpl implements LensmartService{

	@Autowired
	LensmartRepository lensmartRepository;
	
	@Override
	public List<Lensmart> getLens() {
		
		return lensmartRepository.findAll();
	}

	@Override
	public Lensmart getByLensId(Integer id) {
		
		return (Lensmart) lensmartRepository.findByLensId(id);
	}

	@Override
	public Lensmart addLens(Lensmart lensmart) {
		
		return lensmartRepository.save(lensmart);
	}

}
