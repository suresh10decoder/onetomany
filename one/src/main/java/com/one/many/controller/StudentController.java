package com.one.many.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.one.many.model.College;
import com.one.many.model.Student;
import com.one.many.service.StudentService;

@RestController
@RequestMapping("one")
public class StudentController {
	@Autowired
	StudentService service;

	@PostMapping("/student")
	public Student insert(@RequestBody Student student) {
		return service.insert(student);
	}

	@GetMapping("/student")
	public ArrayList<Student> getAll() {
		return service.getAll();
	}

	@PostMapping("/college")
	public College newInsert(@RequestBody College college) {
		return service.newInsert(college);
	}

	@GetMapping("/college")
	public ArrayList<College> newGetAll(){
		return service.newGetAll();
	}

}