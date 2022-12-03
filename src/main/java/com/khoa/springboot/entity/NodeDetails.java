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
public class NodeDetails extends Base{
    private String name;
    private String lat;
    private String long_;
    private String processingCost;
    private String maxHRCap;
    private String Sla;
}
