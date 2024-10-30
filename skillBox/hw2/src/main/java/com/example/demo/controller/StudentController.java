package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import java.util.List;

@ShellComponent
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @ShellMethod("View all students")
    public List<Student> viewStudents() {
        return studentService.findAll();
    }

    @ShellMethod("Add a student")
    public String addStudent(String firstName, String lastName, int age) {
        Student student = new Student();
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setAge(age);
        studentService.addStudent(student);
        return String.format("Student added: %s", student);
    }

    @ShellMethod("Remove a student by ID")
    public String removeStudent(Long id) {
        studentService.removeStudent(id);
        return String.format("Student with ID %d removed", id);
    }

    @ShellMethod("Clear all students")
    public String clearStudents() {
        studentService.clearStudents();
        return "All students cleared";
    }
}