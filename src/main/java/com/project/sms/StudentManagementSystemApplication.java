package com.project.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.sms.entity.Student;
import com.project.sms.services.StudentService;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentService studentService;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		/*
		 * Student student1 = new Student(); student1.setFirstName("Ramesh");
		 * student1.setLastName("Panchal"); student1.setEmail("ramesh@gmail.com");
		 * this.studentService.saveStudent(student1);
		 * 
		 * Student student2 = new Student(); student2.setFirstName("Harsh");
		 * student2.setLastName("Panchal"); student2.setEmail("harsh@gmail.com");
		 * this.studentService.saveStudent(student2);
		 * 
		 * Student student3 = new Student(); student3.setFirstName("Parth");
		 * student3.setLastName("Mehta"); student3.setEmail("parth@gmail.com");
		 * this.studentService.saveStudent(student3);
		 */
		
	}

}
