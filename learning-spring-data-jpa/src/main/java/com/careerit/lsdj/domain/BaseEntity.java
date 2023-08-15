package com.careerit.lsdj.domain;

import com.careerit.lsdj.service.UserRequestService;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity {

    @Column(name="created_by",nullable = false,updatable = false)
    protected long createdBy;
    @Column(name = "modified_by",nullable = false,updatable = true)
    protected long modifiedBy;
    @Column(name="created_date",nullable = false,updatable = false)
    protected LocalDateTime createDate;
    @Column(name="modified_date",nullable = false,updatable = true)
    protected LocalDateTime modifiedDate;
    @Column(name="deleted", nullable = false)
    protected boolean deleted;

    @PrePersist
    public void onPrePersist(){
        this.createDate = LocalDateTime.now(ZoneOffset.UTC);
        this.modifiedDate = LocalDateTime.now(ZoneOffset.UTC);
        this.createdBy = UserRequestService.getRandomUser();
        this.modifiedBy = UserRequestService.getRandomUser();
    }
    @PreUpdate
    public void onPreUpdate(){
        this.modifiedDate = LocalDateTime.now(ZoneOffset.UTC);
        this.modifiedBy = UserRequestService.getRandomUser();
    }
    public abstract Object getId();
}
