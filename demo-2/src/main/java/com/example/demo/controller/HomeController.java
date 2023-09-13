package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.homeService.HomeService;
import com.example.demo.model.Student;


@RestController
public class HomeController {
@Autowired
HomeService hs;
@PostMapping("/datasaved")
public ResponseEntity<Student>getdata(@RequestBody Student s)
{
	Student student = hs.getdata(s);
	return new ResponseEntity<Student>(student,HttpStatus.CREATED);
	
}

@GetMapping("/getallStu")
public ResponseEntity<List<Student>> getallstu(){
	List<Student>stu=hs.getallstu();
	return new ResponseEntity<List<Student>>(stu, HttpStatus.OK);
}

@GetMapping("/getsingledata/{id}")
public ResponseEntity<Student>getSingle(@PathVariable("id")int id)
{
	Student st=hs.getSingle(id);
return new ResponseEntity<Student>(st,HttpStatus.OK);	
}


@DeleteMapping("/deletedata/{id}")
public ResponseEntity<String> delete(@PathVariable("id")int id) {
	Student st=hs.delete(id);
	
 return new ResponseEntity<String>("product deleted successfully....", HttpStatus.OK);
	
}
}