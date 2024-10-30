package com.example.demo.listener;

import com.example.demo.event.StudentCreatedEvent;
import com.example.demo.event.StudentRemovedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StudentEventListener {

    @EventListener
    public void handleStudentCreated(StudentCreatedEvent event) {
        System.out.println("Student created: " + event.student());
    }

    @EventListener
    public void handleStudentRemoved(StudentRemovedEvent event) {
        System.out.println("Student removed with ID: " + event.id());
    }
}