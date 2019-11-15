package com.chinabeacon.demo.service.impl;

import com.chinabeacon.demo.DemoApplication;
import com.chinabeacon.demo.mbg.mapper.StudentMapper;
import com.chinabeacon.demo.mbg.model.Student;
import com.chinabeacon.demo.mbg.model.StudentExample;
import com.chinabeacon.demo.service.StudentService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes={DemoApplication.class})
class StudentServiceImplTest {

    @Autowired
    private StudentMapper studentMapper;
    @Test
    public List<Student> listAllStudent() {
    /*    var example=new StudentExample();
        example.createCriteria().andIsDeletedEqualTo(false);
        var aa= studentMapper.selectByExample(example);
        System.out.println(11);
        System.out.println(aa.toString());
        return aa;*/
        System.out.println("aaddd");
        return new ArrayList<Student>();
    }
}