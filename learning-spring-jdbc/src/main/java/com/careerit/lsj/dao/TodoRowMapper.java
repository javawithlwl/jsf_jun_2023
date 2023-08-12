package com.careerit.lsj.dao;


import com.careerit.lsj.dto.TodoDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TodoRowMapper implements RowMapper<TodoDto> {
    @Override
    public TodoDto mapRow(ResultSet rs, int rowNum) throws SQLException {
        TodoDto todoDto = new TodoDto();
        todoDto.setId(rs.getLong("id"));
        todoDto.setTitle(rs.getString("title"));
        todoDto.setDescription(rs.getString("description"));
        todoDto.setUserName(rs.getString("user_name"));
        return todoDto;
    }
}
