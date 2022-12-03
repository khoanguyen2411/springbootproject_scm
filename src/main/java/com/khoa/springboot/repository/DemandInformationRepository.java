package com.khoa.springboot.repository;

import com.khoa.springboot.entity.DemandInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemandInformationRepository extends JpaRepository<DemandInformation,Long> {
}
