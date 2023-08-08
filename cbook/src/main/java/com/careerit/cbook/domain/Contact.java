package com.careerit.cbook.domain;

import jakarta.annotation.PostConstruct;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "contact")
@Getter
@Setter
public class Contact {
    @Id
    private UUID id;
    private String name;
    private String email;
    private String mobile;

    @PrePersist
    public void init(){
        this.id = UUID.randomUUID();
    }
}
