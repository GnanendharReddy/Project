package com.deloitte.Lensmart.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.Lensmart.entity.Lensmart;

@Repository
public interface LensmartRepository extends JpaRepository<Lensmart,Integer>{

	List<Lensmart> findByLensId(Integer lensId);
}
