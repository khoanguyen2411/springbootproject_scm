package com.khoa.springboot.repository;

import com.khoa.springboot.entity.StockLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockLevelRepository extends JpaRepository<StockLevel,Long> {
}