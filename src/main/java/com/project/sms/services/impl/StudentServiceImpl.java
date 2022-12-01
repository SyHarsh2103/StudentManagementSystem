package com.project.sms.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.sms.entity.Student;
import com.project.sms.repository.StudentRespository;
import com.project.sms.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRespository studentRespository ;
	@Override
	public List<Student> getAllStudents() {
		
		return studentRespository.findAll();
	}
	public StudentServiceImpl(StudentRespository studentRespository) {
		super();
		this.studentRespository = studentRespository;
	}
	@Override
	public void saveStudent(Student student) {
		this.studentRespository.save(student);
	
	}
	@Override
	public Student getStudentById(Long Id) {
		// TODO Auto-generated method stub
		
		return this.studentRespository.findById(Id).get();
	}
	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return this.studentRespository.save(student);
	}
	@Override
	public void deleteStudentById(Long Id) {
		// TODO Auto-generated method stub
		this.studentRespository.deleteById(Id);
	}
	
	
	
}
