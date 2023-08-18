package com.careerit.lsdj.repo;

import com.careerit.lsdj.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Long> {
}
