package com.usaa.itnhap.gollum.garrison.dao;

import com.usaa.itnhap.gollum.garrison.domain.Flight;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FlightDao {

	JdbcTemplate jdbcTemplate = new JdbcTemplate();

	public List<Flight> getFlights(){
		String sql = "SELECT * FROM flights";
		List<Flight> flightList = jdbcTemplate.queryForList(sql, Flight.class);
		return flightList;
	}

}