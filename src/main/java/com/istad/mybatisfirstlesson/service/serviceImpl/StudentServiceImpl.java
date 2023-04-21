package com.istad.mybatisfirstlesson.service.serviceImpl;

import com.istad.mybatisfirstlesson.model.Student;
import com.istad.mybatisfirstlesson.repository.StudentRepository;
import com.istad.mybatisfirstlesson.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentServiceImpl implements StudentService {

    StudentRepository studentRepository;
    // constructor injection
//    StudentServiceImpl(StudentRepository studentRepository){
//        this.studentRepository = studentRepository;
//    }
    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.getAllStudent();
    }

    @Override
    public int addNewStudent(Student student) {
        return studentRepository.addNewStudent(student);
    }

    @Override
    public int editStudent(Student student) {
        return studentRepository.editStudent(student);
    }

    @Override
    public int removeStudent(int id) {
        return studentRepository.removeStudent(id);
    }
}
