package com.example.demo.homeServiceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.StudentRepository;
import com.example.demo.homeService.HomeService;
import com.example.demo.model.Student;
@Service
public class HomeServiceimpl implements HomeService{
StudentRepository sr;
@Autowired

	public Student getdata(Student s) {
	Student student = sr.save(s);
		return student;
	}

	@Override
	public List<Student> getallstu() {
Student st= (Student) sr.findAll();
	return (List<Student>) st;
	}




	@Override
	public Student delete(int id) {
	
		return null;
	}

	@Override
	public Student getSingle(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
