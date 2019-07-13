package com.one.many.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.one.many.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>
{
	
}