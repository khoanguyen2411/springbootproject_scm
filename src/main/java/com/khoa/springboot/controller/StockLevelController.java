package com.khoa.springboot.controller;


import com.khoa.springboot.entity.StockLevel;
import com.khoa.springboot.service.StockLevelService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;


@RestController
@RequestMapping(value = "/api/stockLevel")
@AllArgsConstructor
public class StockLevelController {

    private final StockLevelService stockLevelService = new StockLevelService();

    @GetMapping
    public List<StockLevel> getAll(){
        return stockLevelService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getById(@PathVariable("id") Long id){
        return new ResponseEntity<>(stockLevelService.getById(id), OK);
    }

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody StockLevel data){
        return new ResponseEntity<>(stockLevelService.save(data), OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> edit(@PathVariable("id") Long id, @RequestBody StockLevel data){
        return new ResponseEntity<>(stockLevelService.update(id, data), OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") Long id){
    	stockLevelService.delete(id);
        return new ResponseEntity<>(OK);
    }

}