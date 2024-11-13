package com.nareshtechhub.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table
public class PenDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="pen_id")
	private int penid;
	@Column(name = "pen_name")
	private String penname;
	@Column(name = "pen_price")
	private int penprice;
	private String manufacturer;
	
	public PenDetails(int penid, String penname, int penprice, String manufacturer) {
		super();
		this.penid = penid;
		this.penname = penname;
		this.penprice = penprice;
		this.manufacturer = manufacturer;
	}
	

}
