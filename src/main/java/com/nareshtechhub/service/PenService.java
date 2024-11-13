package com.nareshtechhub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nareshtechhub.dao.Pendao;
import com.nareshtechhub.model.PenDetails;

import jakarta.transaction.Transactional;

@Service
public class PenService {
	@Autowired
	Pendao dao;

	public void save(PenDetails pd) {
		dao.save(pd);
		
	}

	@Transactional
	public PenDetails get(int id) {
	    PenDetails penDetails = dao.getById(id);  
	    return penDetails;  
	}

	

}
