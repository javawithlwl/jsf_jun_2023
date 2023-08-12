package com.careerit.lsdj.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "wallet_details")
@Getter
@Setter
public class Wallet {

       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       @Column(name = "id")
       private Long id;
       @Column(name = "name")
       private String name;
       @Column(name = "mobile")
       private String mobile;
       @Column(name = "balance")
       private double balance;
       @Column(name = "valid_thru")
       private LocalDate validThru;

}
