package com.onetomanytiga.onetomanytiga.jpa;

import com.onetomanytiga.onetomanytiga.model.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
    List<Assignment> findByStudentId(Long studentId);
}
