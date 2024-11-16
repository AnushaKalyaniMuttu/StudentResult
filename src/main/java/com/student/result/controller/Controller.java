package com.student.result.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.result.dto.StudentDto;
import com.student.result.entity.Student;
import com.student.result.repository.StudentRepository;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class Controller {

	private final StudentRepository studentRepository;


	@GetMapping("/hi")
	public String sayHello() {
		return "Hi There";
	}
	
	
	@PostMapping("/insert")
	public Student insertStudentDetails(@RequestBody Student student) {
		return studentRepository.save(student);
		
	}
	
	@GetMapping("/get/{studentId}")
	public StudentDto getStudentMarkList(@PathVariable int studentId) {
		Student student= studentRepository.findById(studentId).get();
		StudentDto dto=new StudentDto();
		dto.setMaths(student.getMaths());
		dto.setBiology(student.getBiology());
		dto.setPhysics(student.getPhysics());
		return dto;
	}



}
