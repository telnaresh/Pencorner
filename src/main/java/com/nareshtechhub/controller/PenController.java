package com.nareshtechhub.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nareshtechhub.model.PenDetails;
import com.nareshtechhub.service.PenService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/pcorner")
public class PenController {

	
	PenService penservice;
	
	public PenController(PenService penservice) {
		this.penservice = penservice;		
	}
	
	@PostMapping("/create")
	public String pencreated(@RequestBody PenDetails pd){
		penservice.save(pd);
		return "Pen details saved";  
		
	}
	
	@GetMapping("/pens")
	public List<PenDetails> getAllpendetails(){
		return penservice.findAll();
		
	}
	
	  @GetMapping("/{id}")
	    public ResponseEntity<?> getPenDetails(@PathVariable("id") int id) {
	        PenDetails pen = penservice.get(id);

	        if (pen == null) {
	        	String errorMessage = "Pen not found with ID: " + id;
	            return new ResponseEntity<>(errorMessage,HttpStatus.NOT_FOUND);
	        }

	        return new ResponseEntity<>(pen, HttpStatus.OK);
	  }
   }
