package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Long id;
    private String firstName;
    private String lastName;
    private int age;
    @Override
    public String toString() {
        return String.format("Student{id=%d, firstName='%s', lastName='%s', age=%d}", id, firstName, lastName, age);
    }
    public void setFirstName(String firstName) {
    }

    public void setLastName(String lastName) {
    }

    public void setAge(int age) {

    }

    public Object getId() {

        return null;
    }

    public void setId(long l) {
    }
}