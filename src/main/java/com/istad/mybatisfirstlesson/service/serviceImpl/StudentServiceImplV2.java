package com.istad.mybatisfirstlesson.service.serviceImpl;
import com.istad.mybatisfirstlesson.model.Student;
import com.istad.mybatisfirstlesson.service.StudentService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Primary
public class StudentServiceImplV2 implements StudentService {
    @Override
    public List<Student> getAllStudents() {
        System.out.println("New select all Logic is added !!! ");
        return null;
    }

    @Override
    public int addNewStudent(Student student) {
        System.out.println("new insert logic !! ");
        return 0;
    }

    @Override
    public int editStudent(Student student) {
        return 0;
    }

    @Override
    public int removeStudent(int id) {
        return 0;
    }
}
