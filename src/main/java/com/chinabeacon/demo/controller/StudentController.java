package com.chinabeacon.demo.controller;

import com.chinabeacon.demo.util.api.CommonPage;
import com.chinabeacon.demo.util.api.CommonResult;
import com.chinabeacon.demo.mbg.model.Student;
import com.chinabeacon.demo.service.StudentService;
import com.chinabeacon.demo.util.api.PageRequest;
import io.swagger.annotations.*;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.mybatis.generator.codegen.ibatis2.sqlmap.elements.SelectByExampleWithBLOBsElementGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 学生管理
 */
@Api(tags = "StudentController", description = "学生管理")
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);

    @ApiOperation("获取所有学生列表")
    @PostMapping("searchAllStudents")
    @RequiresRoles("admin2")
    public CommonResult<List<Student>> searchAllStudents() throws Exception {
        return CommonResult.success(studentService.listAllStudent());
    }

@ApiOperation(value = "分页查询学生")
@PostMapping("searchPagedStudents")
    public CommonResult<CommonPage<Student>> searchPagedStudents(@RequestBody PageRequest pageRequest){
        List<Student> brandList = studentService.listStudent(pageRequest);
        return CommonResult.success(CommonPage.restPage(brandList));
    }
    @ApiOperation(value = "增加学生")
    @PostMapping("addStudent")
    public CommonResult<String> addStudent(@RequestBody Student student){
        var result=studentService.createStudent(student);
        return CommonResult.success(String.valueOf(result));
    }
}
