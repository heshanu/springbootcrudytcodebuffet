package com.ytcoder.ytcodebuffect.controller;

import com.ytcoder.ytcodebuffect.entity.Department;
import com.ytcoder.ytcodebuffect.service.DepartmentService;
import com.ytcoder.ytcodebuffect.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department department(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping(path = "/")
    public List<Department> fetchDepartmentList() {
        return departmentService.fetchDepartmentList();
    }

    @GetMapping(path = "/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) {
        return departmentService.fetchDepartmentById(departmentId);
    }

    @GetMapping(path = "/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
        departmentService.deletedepartmentById(departmentId);
        return "Department delete Successfully";
    }

    @PutMapping(path = "/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId
            , @RequestBody Department department) {
        return departmentService.updateDepartment(departmentId, department);
    }
}
