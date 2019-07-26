package com.bit.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.bit.framework2.JdbcTemplate;
import com.bit.framework2.RowMapper;
import com.bit.model.entity.Bbs02Vo;

import oracle.jdbc.pool.OracleDataSource;

public class Bbs02Dao {
	//상위객체
	DataSource dataSource;
	
	public Bbs02Dao() throws SQLException {
		//다형성에 의해서 DataSource에 주입이 가능하다.
		OracleDataSource oracle =null;
		oracle=new OracleDataSource();
		oracle.setDriverType("oracle.jdbc.OracleDriver");
		oracle.setURL("jdbc:oracle:thin:@localhost:1521:xe");
		oracle.setUser("scott");
		oracle.setPassword("tiger");
		dataSource=oracle;
	}
	
	public int insertOne(Bbs02Vo bean) throws SQLException{
		String sql="INSERT INTO BBS02 VALUES (BBS02_SEQ.NEXTVAL,?,?,?,SYSDATE)";
		Object[] params={bean.getName(),bean.getSub(), bean.getContent()};
		JdbcTemplate template = new JdbcTemplate(dataSource);
		
		return template.executeUpdate(sql, params);
	}

	public List<Bbs02Vo> selectAll(String keyword) throws SQLException{
		String sql="SELECT * FROM BBS02 WHERE SUB LIKE '%'||?||'%' ORDER BY NUM DESC";
		Object[] args = {keyword};
		JdbcTemplate<Bbs02Vo> template = new JdbcTemplate<Bbs02Vo>(dataSource);
	
		return template.queryForList(sql,new RowMapper<Bbs02Vo>(){
			
			public Bbs02Vo mapper(ResultSet rs) throws SQLException{
				Bbs02Vo bean = new Bbs02Vo();
				bean.setNum(rs.getInt("num"));
				bean.setName(rs.getString("name"));
				bean.setSub(rs.getString("sub"));
				bean.setContent(rs.getString("content"));
				bean.setNalja(rs.getDate("nalja"));
				return bean;
			}
		},args);
	}
	
}
