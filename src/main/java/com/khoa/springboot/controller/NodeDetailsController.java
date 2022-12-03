package com.khoa.springboot.controller;


import com.khoa.springboot.entity.NodeDetails;
import com.khoa.springboot.service.NodeDetailsService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;


@RestController
@RequestMapping(value = "/api/nodeDetails")
@AllArgsConstructor
public class NodeDetailsController {

    private final NodeDetailsService nodeDetailsService = new NodeDetailsService();

    @GetMapping
    public List<NodeDetails> getAll(){
        return nodeDetailsService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getById(@PathVariable("id") Long id){
        return new ResponseEntity<>(nodeDetailsService.getById(id), OK);
    }

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody NodeDetails data){
        return new ResponseEntity<>(nodeDetailsService.save(data), OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> edit(@PathVariable("id") Long id, @RequestBody NodeDetails data){
        return new ResponseEntity<>(nodeDetailsService.update(id, data), OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") Long id){
    	nodeDetailsService.delete(id);
        return new ResponseEntity<>(OK);
    }

}