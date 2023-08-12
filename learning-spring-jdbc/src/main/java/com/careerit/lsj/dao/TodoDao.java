package com.careerit.lsj.dao;

import com.careerit.lsj.domain.Todo;
import com.careerit.lsj.dto.TodoDto;


import java.util.List;

public interface TodoDao {

    Todo add(Todo todo);
    List<TodoDto> findAll(long userId);
    Todo update(Todo todo);
    boolean delete(long id);
}
