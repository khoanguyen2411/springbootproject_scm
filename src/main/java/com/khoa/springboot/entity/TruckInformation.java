package com.khoa.springboot.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

import java.sql.Blob;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class TruckInformation extends Base{
    private String time;
    private String unit;
    private String origin;
    private String destination;
    private String customerId;
    private String productId;
    
    @OneToMany(mappedBy = "customer_id")
    private List<DemandInformation> DemandInformations;

	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}
}
