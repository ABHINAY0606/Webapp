package com.wip.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wip.entity.SEmployee;
import com.wip.repository.SEmployeeRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class SEmployeeServiceImpl implements SEmployeeService {

	@Autowired
	private SEmployeeRepository sEmployeeRepository;

	@Override
	public void createEmployee(SEmployee employee) {

		sEmployeeRepository.save(employee);
		System.out.println("Created " + employee.getEname() + "Successfully ");
	}

	@Override
	public List<SEmployee> getAllEmployee() {

		return sEmployeeRepository.findAll();
	}

	@Override
	public List<SEmployee> updateEmployee(SEmployee employee) {

		sEmployeeRepository.save(employee);
		return getAllEmployee();
	}

	@Override
	public List<SEmployee> deleteEmployee(Long eid) {
		sEmployeeRepository.deleteById(eid);
		return getAllEmployee();
	}
}
