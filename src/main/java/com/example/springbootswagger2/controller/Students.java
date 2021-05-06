package com.example.springbootswagger2.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.webjars.NotFoundException;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

import com.example.springbootswagger2.model.Student;

@RestController
@Tag(name = "Students", description = "the Students API")
public class Students {

  List<Student> students = new ArrayList<Student>();
  {
    students.add(new Student("Sajal", "IV", "India"));
    students.add(new Student("Lokesh", "V", "India"));
  }

  @Operation(summary = "Get a list of all students", description = "This is just an example 'single-point' route to get to know OAS with Java.")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Found the students", content = {
          @Content(mediaType = "application/json", schema = @Schema(implementation = Student.class)) }),
      @ApiResponse(responseCode = "500", description = "Failed to find students", content = @Content) })
  @GetMapping(value = "/students")
  public List<Student> getStudents() {
    return students;
  }

  @Operation(summary = "Get a student", description = "Sometthing about getting a student by name.")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Found the student", content = {
          @Content(mediaType = "application/json", schema = @Schema(implementation = Student.class)) }),
      @ApiResponse(responseCode = "500", description = "Failed to find a student", content = @Content) })
  @GetMapping(value = "/student/{name}")
  public Optional<Student> getStudent(
      @Parameter(description = "Name of stdudent. Cannot be empty.", required = true, example = "Sajal") @PathVariable String name) {
    return students.stream().filter(student -> student.getName().equals(name)).findFirst();
  }
}