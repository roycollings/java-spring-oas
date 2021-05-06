package com.example.springbootswagger2.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springbootswagger2.model.Student;

@RestController
public class Swagger2DemoRestController {

  List<Student> students = new ArrayList<Student>();
  {
    students.add(new Student("Sajal", "IV", "India"));
    students.add(new Student("Lokesh", "V", "India"));
  }

  @RequestMapping(value = "/getStudents")
  public List<Student> getStudents() {
    return students;
  }
}