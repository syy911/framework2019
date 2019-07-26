package com.bit.framework2;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface RowMapper<T> {
	
	abstract T mapper(ResultSet rs) throws SQLException;
}
