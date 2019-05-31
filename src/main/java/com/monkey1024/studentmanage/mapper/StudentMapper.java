package com.monkey1024.studentmanage.mapper;

import com.monkey1024.studentmanage.bean.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> selectAllStudent ();

    void deleteStudent(int id);

    Integer studentNum(int sex);

    void insertStudent(Student student);

    void updateStudent(Student student);
}
