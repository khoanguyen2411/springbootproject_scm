package com.khoa.springboot.repository;

import com.khoa.springboot.entity.TruckInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TruckInformationRepository extends JpaRepository<TruckInformation,Long> {
}