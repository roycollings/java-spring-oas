package com.example.springbootswagger2.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

import com.example.springbootswagger2.model.Student;

@RestController
public class Students {

  List<Student> students = new ArrayList<Student>();
  {
    students.add(new Student("Sajal", "IV", "India"));
    students.add(new Student("Lokesh", "V", "India"));
  }

  @Operation(summary = "Get a list of all students")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Found the students", content = {
          @Content(mediaType = "application/json", schema = @Schema(implementation = Student.class)) }),
      @ApiResponse(responseCode = "500", description = "Failed to find students", content = @Content) })
  @RequestMapping(value = "/students", method = RequestMethod.GET)
  public List<Student> getStudents() {
    return students;
  }
}