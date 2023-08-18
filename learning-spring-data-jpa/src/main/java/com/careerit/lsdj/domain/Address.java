package com.careerit.lsdj.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Address {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        private String city;
        private String state;
        private String country;

 }
