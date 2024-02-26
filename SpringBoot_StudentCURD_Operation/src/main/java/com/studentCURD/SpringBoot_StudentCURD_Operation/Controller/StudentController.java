package com.studentCURD.SpringBoot_StudentCURD_Operation.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.studentCURD.SpringBoot_StudentCURD_Operation.api.Student;
import com.studentCURD.SpringBoot_StudentCURD_Operation.repository.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	StudentRepository sr;

	@PostMapping("/saveStudent")
	public String saveStudentData(@RequestBody Student student) {
		sr.save(student);
		return "Student Save Successfully";
	}

	@PutMapping("/updateStudent")
	public String updateStudentData(@RequestBody Student student) {
		sr.save(student);
		return "Student Update Successfully";
	}

	@DeleteMapping("/deleteStudent")
	public String deleteStudentData(@RequestParam int id) {
		sr.deleteById(id);
		return "Student Delete Successfully";
	}

	@GetMapping("/fetchAllStudent")
	public List<Student> fetchAllStudentData() {
		List<Student> students = sr.findAll();
		return students;
	}

	@GetMapping("/fetchStudentById")
	public Student fetchStudentDataById(@RequestParam int id) {
		Optional<Student> optional = sr.findById(id);
		Student studentId = optional.get();
		return studentId;
	}

	@GetMapping("/fetchStudentByName")
	public List<Student> fetchStudentDataByName(@RequestParam String name) {
		return sr.findByName(name);
	}

	@GetMapping("/fetchStudentByEmail")
	public Student fetchStudentDataByEmail(@RequestParam String email) {
		return sr.findByEmail(email);
	}

	@GetMapping("/fetchStudentByAge")
	public List<Student> fetchStudentDataByAge(@RequestParam int age) {
		return sr.findByAge(age);
	}

	@GetMapping("/fetchStudentByNumber")
	public Student fetchStudentDataByNumber(@RequestParam long mobileNumber) {
		return sr.findByMobileNumber(mobileNumber);
	}

	@GetMapping("/fetchStudentByAgeBetween")
	public List<Student> fetchStudentDataBetweenAge(@RequestParam int startAge, @RequestParam int endAge) {
		return sr.findByAgeBetween(startAge, endAge);
	}
}
