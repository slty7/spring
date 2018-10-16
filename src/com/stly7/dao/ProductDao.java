package com.stly7.dao;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

@Component(value="pDao")
public class ProductDao {
	public ResultSet getResult() throws SQLException {
		String sql = "select user, host from user";
		ResultSet executeQuery = null;
		try {
			executeQuery = DBUtils.getConnection().createStatement().executeQuery(sql);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return executeQuery;
	}
}
