package com.monkey1024.studentmanage.service;

import com.monkey1024.studentmanage.bean.Student;
import com.monkey1024.studentmanage.mapper.StudentMapper;
import com.monkey1024.studentmanage.util.MyCompare;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.reflect.generics.tree.Tree;

import java.util.*;

@Service
public class StudenrServiceImpl implements StudentService {
    @Autowired
    private StudentMapper smp;
    @Override
    public List<Student> selectAllStudent() {
        return smp.selectAllStudent();
    }

    @Override
    public void deleteStudent(int id) {
        smp.deleteStudent(id);
    }

    @Override
    public Integer studentNum(int sex) {
        return smp.studentNum(sex);
    }

    @Override
    public void insertStudent( Student student) {
        smp.insertStudent(student);
    }

    @Override
    public void updateStudent( Student student) {
        smp.updateStudent(student);
    }

    @Override
    public List<Student> orderByAge() {
        List<Student> students = new ArrayList<>();
        students.addAll(smp.selectAllStudent());
        Collections.sort(students,new MyCompare());
        return students;
    }

}
