package com.onetomanytiga.onetomanytiga.jpa;

import com.onetomanytiga.onetomanytiga.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
