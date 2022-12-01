package com.project.sms.services;

import java.util.List;

import com.project.sms.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	void saveStudent(Student student);
	Student getStudentById(Long Id);
	Student updateStudent(Student student);
	void deleteStudentById(Long Id);
}
