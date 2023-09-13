package com.example.demo.homeService;

import java.util.List;

import com.example.demo.model.Student;

public interface HomeService {

public Student getdata(Student s);

public List<Student> getallstu();

public Student getSingle(int id);

public Student delete(int id);



}
