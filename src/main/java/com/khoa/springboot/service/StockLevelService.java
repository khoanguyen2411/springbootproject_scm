package com.khoa.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khoa.springboot.entity.StockLevel;
import com.khoa.springboot.repository.StockLevelRepository;


@Service("StockLevelService")
public class StockLevelService {
    @Autowired
    private StockLevelRepository stockLevelRepository;

    public StockLevel getById(Long id) {
        return stockLevelRepository.findById(id).orElse(null);
    }


    public List<StockLevel> getAll() {
        return stockLevelRepository.findAll();
    }

    public StockLevel save(StockLevel data) {
        return stockLevelRepository.save(data);
    }

    public StockLevel update(Long id, StockLevel data) {
    	StockLevel old  = stockLevelRepository.findById(id).orElse(null);
        return stockLevelRepository.save(data);
    }

    public Boolean delete (Long id) {
    	StockLevel del = stockLevelRepository.findById(id).orElse(null);
        if(del != null) {
        	stockLevelRepository.delete(del);
            return true;
        }
        return false;
    }
}