package com.monkey1024.studentmanage.controller;

import com.alibaba.fastjson.JSON;
import com.monkey1024.studentmanage.bean.Student;
import com.monkey1024.studentmanage.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student")
    public String findAllStudent(){
        List<Student> al = studentService.selectAllStudent();
        return JSON.toJSONString(al);
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
    }

    @GetMapping("/studentnum/{sex}")
    public String studentSex(@PathVariable int sex){
        int i = studentService.studentNum(sex);
        return JSON.toJSONString(i);
    }

    @PostMapping("/student")
    public String insertStudent(@RequestBody @Valid Student student, BindingResult br){
        if (br.hasErrors()){
            System.out.println(br.getFieldError().getDefaultMessage());
            return null;
        }
        studentService.insertStudent(student);
        return JSON.toJSONString("true");
    }

    @PutMapping("/student")
    public String updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
        return JSON.toJSONString("true");
    }

    @GetMapping("/order")
    public String orderByAge(){
        return JSON.toJSONString( studentService.orderByAge());
    }

}


