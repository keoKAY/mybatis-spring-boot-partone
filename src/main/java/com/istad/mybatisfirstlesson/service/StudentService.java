package com.istad.mybatisfirstlesson.service;

import com.istad.mybatisfirstlesson.model.Student;

import java.util.List;

public interface StudentService {

    // determine features

    List<Student> getAllStudents();
    int addNewStudent(Student student);
    int editStudent(Student student);
    int removeStudent(int id);


}
