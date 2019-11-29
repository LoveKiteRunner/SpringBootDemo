package com.chinabeacon.demo.service.impl;

import com.chinabeacon.demo.mbg.mapper.StudentMapper;
import com.chinabeacon.demo.mbg.model.Student;
import com.chinabeacon.demo.mbg.model.StudentExample;
import com.chinabeacon.demo.service.StudentService;
import com.chinabeacon.demo.util.api.PageRequest;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> listAllStudent() {
        StudentExample example=new StudentExample();
        example.createCriteria().andIsDeletedEqualTo(false);
        return studentMapper.selectByExample(example);
    }

    @Override
    public int createStudent(Student student) {
        student.setCreateTime(new Date());
        student.setUpdateTime(new Date());
        student.setId(java.util.UUID.randomUUID().toString());
        return studentMapper.insert(student);
    }

    @Override
    public int updateStudent(Student student) {
        return studentMapper.updateByPrimaryKeySelective(student);
    }

    @Override
    public int deleteStudent(String id) {
        Student student=getStudent(id);
        student.setIsDeleted(true);
        student.setUpdateTime(new Date());
        return updateStudent(student);
    }

    @Override
    public List<Student> listStudent(PageRequest pageRequest) {
        PageHelper.startPage(pageRequest.getPageNum(), pageRequest.getPageSize());
        StudentExample example=new StudentExample();
        example.createCriteria().andIsDeletedEqualTo(false);
        return studentMapper.selectByExample(example);
    }

    @Override
    public Student getStudent(String id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}
