package com.khoa.springboot.controller;


import com.khoa.springboot.entity.DemandInformation;
import com.khoa.springboot.service.DemandInformationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;


@RestController
@RequestMapping(value = "/api/demandInformations")
@AllArgsConstructor
public class DemandInformationController {

    private final DemandInformationService demandInformationService = new DemandInformationService();

    @GetMapping
    public List<DemandInformation> getAll(){
        return demandInformationService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getById(@PathVariable("id") Long id){
        return new ResponseEntity<>(demandInformationService.getById(id), OK);
    }

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody DemandInformation data){
        return new ResponseEntity<>(demandInformationService.save(data), OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> edit(@PathVariable("id") Long id, @RequestBody DemandInformation data){
        return new ResponseEntity<>(demandInformationService.update(id, data), OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") Long id){
    	demandInformationService.delete(id);
        return new ResponseEntity<>(OK);
    }

}
