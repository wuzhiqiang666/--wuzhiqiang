package com.monkey1024.studentmanage.util;

import com.monkey1024.studentmanage.bean.Student;

import java.util.Comparator;

public class MyCompare implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int num=s1.getAge()-s2.getAge();
        if (num==0){
             num = s1.getScore()-s2.getScore();
        }
        return num;
    }
}
