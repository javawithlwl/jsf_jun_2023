package com.careerit.lsdj.repo;

import com.careerit.lsdj.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
}
