package com.nit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

	List<Student> findAll();

}
