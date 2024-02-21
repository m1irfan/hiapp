package com.java.hiapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.hiapp.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer>  {

}