package com.careerit.lsdj.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Student {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        private String name;
        private String qualification;
        private String mobile;
        @OneToOne
        @JoinColumn(name = "address_id")
        private Address address;
        @ManyToMany(mappedBy = "students")
        private List<Course> courses;
}
