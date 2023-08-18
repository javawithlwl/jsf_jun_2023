package com.careerit.lsdj.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Course {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String title;
        private int duration;
        private double fee;
        @ManyToOne
        @JoinColumn(name="trainer_id")
        private Trainer trainer;
        @ManyToMany
        @JoinTable(
                name="student_course",
                joinColumns = @JoinColumn(name = "course_id"),
                inverseJoinColumns = @JoinColumn(name = "student_id")
        )
        private List<Student> students;

}
