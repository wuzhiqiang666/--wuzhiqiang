package com.monkey1024.studentmanage.service;

import com.monkey1024.studentmanage.bean.Student;

import java.util.List;
import java.util.Set;

public interface StudentService {
    List<Student> selectAllStudent ();

    void deleteStudent(int id);

    Integer studentNum(int sex);

    void insertStudent(Student student);

    void updateStudent(Student student);

    List<Student> orderByAge();
}
