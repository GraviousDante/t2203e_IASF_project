package com.SUN.repository;

import com.SUN.entity.JpaEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

interface JpaEmployeeRepository extends JpaRepository<JpaEmployee, Long> {

}
