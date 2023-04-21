package com.istad.mybatisfirstlesson.repository;


import com.istad.mybatisfirstlesson.model.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface StudentRepository {
    @Select("select * from student_tb")
    List<Student> getAllStudent();

    @Insert("insert  into student_tb (id, fullname, gender, classroom, score)\n" +
            "values (#{student.id}, #{student.fullName}, #{student.gender},#{student.classroom} ,#{student.score});")
    int addNewStudent(@Param("student") Student student);


    @Update("update student_tb set fullname = #{student.fullName},\n" +
            "                      gender=#{student.gender},classroom=#{student.classroom},score=#{student.score}\n" +
            "                  where id = #{student.id}")
    int editStudent(@Param("student") Student student);


    @Delete("delete  from student_tb where    id = #{id};")
    int removeStudent(int id );


}
