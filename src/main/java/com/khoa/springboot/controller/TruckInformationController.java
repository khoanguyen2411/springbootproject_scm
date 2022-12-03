package com.khoa.springboot.controller;


import com.khoa.springboot.entity.TruckInformation;
import com.khoa.springboot.service.TruckInformationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;


@RestController
@RequestMapping(value = "/api/truckInformation")
@AllArgsConstructor
public class TruckInformationController {

    private final TruckInformationService truckInformationService = new TruckInformationService();

    @GetMapping
    public List<TruckInformation> getAll(){
        return truckInformationService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getById(@PathVariable("id") Long id){
        return new ResponseEntity<>(truckInformationService.getById(id), OK);
    }

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody TruckInformation data){
        return new ResponseEntity<>(truckInformationService.save(data), OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> edit(@PathVariable("id") Long id, @RequestBody TruckInformation data){
        return new ResponseEntity<>(truckInformationService.update(id, data), OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") Long id){
    	truckInformationService.delete(id);
        return new ResponseEntity<>(OK);
    }

}