package com.khoa.springboot.repository;

import com.khoa.springboot.entity.NodeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeDetailsRepository extends JpaRepository<NodeDetails,Long> {
}