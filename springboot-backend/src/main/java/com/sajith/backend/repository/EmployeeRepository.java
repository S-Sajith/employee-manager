package com.sajith.backend.repository;

import com.sajith.backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
