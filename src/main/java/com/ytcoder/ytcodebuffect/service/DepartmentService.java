package com.ytcoder.ytcodebuffect.service;

import com.ytcoder.ytcodebuffect.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    Department fetchDepartmentById(Long departmentId);

    public void deletedepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);
}
