package com.ganeshgc.studentmanagementapplication;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // Custom query methods (if needed)
}