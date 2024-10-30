package com.example.demo.service;
import com.example.demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class StudentService {
    private final List<Student> students = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong();

    public List<Student> findAll() {
        return students;
    }

    public void addStudent(Student student) {
        student.setId(counter.incrementAndGet());
        students.add(student);
    }

    public void removeStudent(Long id) {
        students.removeIf(student -> student.getId().equals(id));
    }

    public void clearStudents() {
        students.clear();
    }
}