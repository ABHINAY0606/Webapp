package com.wip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wip.entity.SEmployee;



@Repository
public interface SEmployeeRepository extends JpaRepository<SEmployee, Long> {
     	
     	
     	
}