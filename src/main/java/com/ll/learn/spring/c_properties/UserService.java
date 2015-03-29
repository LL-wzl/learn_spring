package com.ll.learn.spring.c_properties;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public List<User> find(){
		String sql = "select * from t_user where id > ?";
		RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
		return jdbcTemplate.query(sql, new Object[]{1}, rowMapper);
	}
	
	public List<User> findNamedParame(){
		String sql = "select * from t_user where id > :id";
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("id", 1);
		RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
		return namedParameterJdbcTemplate.query(sql, paramMap, rowMapper);
	}
	
}
