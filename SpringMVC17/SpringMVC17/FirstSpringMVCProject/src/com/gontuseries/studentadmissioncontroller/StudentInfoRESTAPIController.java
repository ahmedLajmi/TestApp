package com.gontuseries.studentadmissioncontroller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentInfoRESTAPIController {

// -----------------------------------------------------------   API -----------------------------------------------------------------------	

	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public ArrayList<Student> getStudents() {
		Student student1 = new Student();
		student1.setStudentName("Ahmed");

		Student student2 = new Student();
		student2.setStudentName("Mohammed");

		Student student3 = new Student();
		student3.setStudentName("Anis");

		ArrayList<Student> studentsList = new ArrayList<>();
		studentsList.add(student1);
		studentsList.add(student2);
		studentsList.add(student3);

		return studentsList;
	}

	@RequestMapping(value = "/student/{name}", method = RequestMethod.GET)
	public Student getStudent(@PathVariable("name") String name) {

		Student student = new Student();
		student.setStudentName(name);
		student.setStudentHobby("WWE");

		return student;
	}
	
	
	@RequestMapping(value = "/student/{name}", method = RequestMethod.PUT)
	public ResponseEntity<Student> updateStudent(@PathVariable("name") String studentName, @RequestBody Student student) {

		System.out.println("Student Name: "+studentName);
		System.out.println("Student Name: "+student.getStudentName()+" Student Hobby: "+student.getStudentHobby());

		return new ResponseEntity<Student>(student,HttpStatus.OK);
	}

}
