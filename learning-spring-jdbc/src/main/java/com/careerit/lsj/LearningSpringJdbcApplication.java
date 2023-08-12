package com.careerit.lsj;

import com.careerit.lsj.dao.Player;
import com.careerit.lsj.dao.TodoDao;
import com.careerit.lsj.domain.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import java.util.List;

@SpringBootApplication
public class LearningSpringJdbcApplication implements CommandLineRunner {
	@Autowired
	private TodoDao todoDao;

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		SpringApplication.run(LearningSpringJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello from Spring Boot");
		/*Todo todo = new Todo();
		todo.setTitle("Spring Security");
		todo.setDescription("Learn Spring Boot Security");
		todo.setUserId(2L);
		Todo savedTodo = todoDao.add(todo);
		System.out.println("Todo is saved with id :"+savedTodo.getId());
		todoDao.findAll(2L).forEach(System.out::println);
		Todo todo = new Todo();
		todo.setId(2L);
		todo.setTitle("Spring Security  using JWT");
		todo.setDescription("Learn Spring Boot Security with version 3 and JWT");
		Todo updatedTodo = todoDao.update(todo);
		System.out.println("Updated todo is :"+updatedTodo);

		boolean isDeleted = todoDao.delete(2L);
		System.out.println("Is deleted :"+isDeleted);*/

		String query = "select name,country,team,role,amount from player where team = :teamName and country = :countryName";
		SqlParameterSource namedParameters = new MapSqlParameterSource()
				.addValue("teamName", "MI")
				.addValue("countryName", "India");
		List<Player> playerList = jdbcTemplate.query(query, namedParameters, (rs, rowNum) -> {
			Player player = new Player();
			player.setName(rs.getString("name"));
			player.setCountry(rs.getString("country"));
			player.setTeamName(rs.getString("team"));
			player.setRole(rs.getString("role"));
			player.setAmount(rs.getDouble("amount"));
			return player;
		});
		playerList.forEach(System.out::println);

	}
}
