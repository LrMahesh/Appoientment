package com.app.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.app.model.UserTable;

@Component("uto")
public class UtilTemplate {

	@Autowired
	private JdbcTemplate jt;
	private UserTable ut=null;
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public List<Data> dataList1(UserTable ut) {
		// received User details based on that we are accessing the appointment
		// details
		this.ut=ut;
		String sql = "select * from appointment where usertype=? order by timeofappointment desc";

		List<Data> ls = jt.query(sql, new RowMapper<Data>() {
			// RowMapper is used to convert the single row of table in a
			// database into single object of class in java
			// using anonymous rowMapper object by implementing mapRow method
			@Override
			public Data mapRow(ResultSet rs, int rowNum) throws SQLException {
				Data dd = new Data();
				// creating empty Data object and setting the data into object
				// the data is accessed from the database by using above query.
				dd.setTime(rs.getTimestamp(1));
				dd.setPurposeOfApp(rs.getString(2));
				dd.setWhom(rs.getString(3));
				dd.setPhoneNumber(rs.getInt(4));
				dd.setAddress(rs.getString(5));
				dd.setStartTime(rs.getTimestamp(6));
				dd.setEndTime(rs.getTimestamp(7));

				return dd;
			}
			
		}, ut.getUserName());

		return ls;
	}

	public List<Data> searchData(String username) {

		// received User details based on that we are accessing the appointment
		// details
		String sql = "select * from appointment where usertype=? and whom=? order by timeofappointment";

		List<Data> ls = jt.query(sql, new RowMapper<Data>() {
			// RowMapper is used to convert the single row of table in a
			// database into single object of class in java
			// using anonymous rowMapper object by implementing mapRow method
			@Override
			public Data mapRow(ResultSet rs, int rowNum) throws SQLException {
				Data dd = new Data();
				// creating empty Data object and setting the data into object
				// the data is accessed from the database by using above query.
				dd.setTime(rs.getTimestamp(1));
				dd.setPurposeOfApp(rs.getString(2));
				dd.setWhom(rs.getString(3));
				dd.setPhoneNumber(rs.getInt(4));
				dd.setAddress(rs.getString(5));
				dd.setStartTime(rs.getTimestamp(6));
				dd.setEndTime(rs.getTimestamp(7));

				return dd;
			}
		}, ut.getUserName(),username);

		return ls;
	}

}
