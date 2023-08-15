package com.careerit.lsdj.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BaseDto {

    protected String createdUser;
    protected String modifiedUser;
    protected long createdBy;
    protected long modifiedBy;
    protected LocalDateTime createdDate;
    protected LocalDateTime modifiedDate;
}
