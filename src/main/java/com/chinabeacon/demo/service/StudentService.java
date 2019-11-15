package com.chinabeacon.demo.service;

import com.chinabeacon.demo.mbg.model.Student;
import com.chinabeacon.demo.util.api.PageRequest;

import java.util.List;

public interface StudentService {
    List<Student> listAllStudent();

    int createStudent(Student student);

    int updateStudent(Student student);

    int deleteStudent(String id);

    List<Student> listStudent(PageRequest pageRequest);

    Student getStudent(String id);
}
