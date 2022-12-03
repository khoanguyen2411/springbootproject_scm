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
public class StockLevel extends Base{
    @OneToMany(mappedBy = "product")
    private List<DemandInformation> DemandInformations;
    @OneToMany(mappedBy = "customer_id")
    private List<NodeDetails> NodeDetailsList;
}
