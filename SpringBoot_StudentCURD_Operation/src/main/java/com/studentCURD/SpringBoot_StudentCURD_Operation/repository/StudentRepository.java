package com.studentCURD.SpringBoot_StudentCURD_Operation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentCURD.SpringBoot_StudentCURD_Operation.api.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	List<Student> findByName(String name);
	
	Student findByEmail(String email);
	
	List<Student> findByAge(int age);
	
	Student findByMobileNumber(long mobileNumber);
	
	List<Student> findByAgeBetween(int startAge, int endAge);
}
