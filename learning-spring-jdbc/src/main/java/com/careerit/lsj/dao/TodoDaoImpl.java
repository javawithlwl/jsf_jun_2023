package com.careerit.lsj.dao;

import com.careerit.lsj.domain.Todo;
import com.careerit.lsj.dto.TodoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class TodoDaoImpl implements TodoDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final String ADD_TODO = "insert into todo (title,description,user_id) values(?,?,?)";
    private final String FIND_ALL_TODO = """
            select
            	t.id as id,
            	t.title as title,
            	t.description as description,
            	u.username as user_name
            from
            	todo t
            join app_user u on
            	t.user_id = u.id
            where
            	t.user_id = ?;
            """;
    private final String UPDATE_TODO = "update todo set title=?,description=? where id=?";
    private final String GET_BY_ID = "select id,title,description,user_id from todo where id = ?";
    private final String DELETE_BY_ID = "delete from todo where id = ?";
    @Override
    public Todo add(Todo todo) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(ADD_TODO, new String[]{"id"});
            ps.setString(1, todo.getTitle());
            ps.setString(2, todo.getDescription());
            ps.setLong(3, todo.getUserId());
            return ps;
        }, keyHolder);
        todo.setId(keyHolder.getKey().longValue());
        return todo;
    }

    @Override
    public List<TodoDto> findAll(long userId) {
        return jdbcTemplate.query(FIND_ALL_TODO,new TodoRowMapper(), userId);
    }

    @Override
    public Todo update(Todo todo) {
        jdbcTemplate.update(UPDATE_TODO,todo.getTitle(),todo.getDescription(),todo.getId());
        List<Todo> list = jdbcTemplate.query(GET_BY_ID, (rs, rowNum) -> {
            Todo todo1 = new Todo();
            todo1.setId(rs.getLong("id"));
            todo1.setTitle(rs.getString("title"));
            todo1.setDescription(rs.getString("description"));
            todo1.setUserId(rs.getLong("user_id"));
            return todo1;
        }, todo.getId());
        return list.get(0);
    }

    @Override
    public boolean delete(long id) {
        int count = jdbcTemplate.update(DELETE_BY_ID, id);
        return count == 1;
    }
}
