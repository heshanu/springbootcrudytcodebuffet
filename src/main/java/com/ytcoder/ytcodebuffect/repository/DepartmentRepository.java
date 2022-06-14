package com.ytcoder.ytcodebuffect.repository;

import com.ytcoder.ytcodebuffect.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
