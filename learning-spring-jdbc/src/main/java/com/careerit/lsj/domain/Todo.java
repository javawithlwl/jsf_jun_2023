package com.careerit.lsj.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Todo {

    private long id;
    private String title;
    private String description;
    private long userId;
}
