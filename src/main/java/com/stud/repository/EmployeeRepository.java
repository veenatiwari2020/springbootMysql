package com.stud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stud.modle.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long>{



}
