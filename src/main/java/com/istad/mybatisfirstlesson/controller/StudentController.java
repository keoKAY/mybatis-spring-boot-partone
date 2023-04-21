package com.istad.mybatisfirstlesson.controller;

import com.istad.mybatisfirstlesson.model.Student;
import com.istad.mybatisfirstlesson.service.StudentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    StudentService studentService;

    StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/allstudents")
    List<Student> getAllStudent() {

        Student newStudent = new Student(7, "July Update", "Male", "Spring", 90);
//        int result = studentService.addNewStudent(newStudent);
//        int result = studentService.editStudent(newStudent);

        int result = studentService.removeStudent(1);
        System.out.println("Inserted Row : " + result);

        return studentService.getAllStudents();
    }


}
