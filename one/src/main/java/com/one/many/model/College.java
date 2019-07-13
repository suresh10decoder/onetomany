 package com.one.many.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//this is foreign key
	private Long id;
	private String name;
	private String location;
	private String category;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
     private List<Student> student;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getlocation() {
		return location;
	}

	public void setlocation(String location) {
		this.location = location;
	}

	public String getcategory() {
		return category;
	}

	public void setcategory(String category) {
		this.category = category;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Branch [id=" + id + ", name=" + name + ", location=" + location + ", category=" + category
				+ ", Student=" + student + "]";
	}
    
	

}
