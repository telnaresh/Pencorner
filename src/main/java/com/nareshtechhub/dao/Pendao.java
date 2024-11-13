package com.nareshtechhub.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nareshtechhub.model.PenDetails;

@Repository
public interface Pendao extends JpaRepository<PenDetails, Integer>{

	

}
