package com.student.result.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.result.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

}
