package com.khoa.springboot.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import java.sql.Blob;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class DemandInformation extends Base{
    private String customerId;
    private String productId;
    private String day;
    private String hour;
    private String airGround;
    private String weight;
    private String cube;
}
