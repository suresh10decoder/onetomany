package com.one.many.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.one.many.model.College;
@Repository
public interface CollegeRepository extends JpaRepository<College,Integer> {

}
