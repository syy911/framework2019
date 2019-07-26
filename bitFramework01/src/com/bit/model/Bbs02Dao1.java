package com.bit.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.framework.TemplateQuery;
import com.bit.framework.TemplateUpdate;
import com.bit.model.entity.Bbs02Vo;

public class Bbs02Dao1 {
	
	public Bbs02Dao1() {}	

	TemplateUpdate tempupdate=new TemplateUpdate();
	TemplateQuery template = new TemplateQuery(){
		@Override
		public Object mapper(ResultSet rs) throws SQLException {
			Bbs02Vo bean=new Bbs02Vo();
			bean.setNum(rs.getInt("num"));
			bean.setName(rs.getString("name"));
			bean.setSub(rs.getString("sub"));
			bean.setContent(rs.getString("content"));
			bean.setNalja(rs.getDate("nalja"));
			return bean;
		}
	};
	
	public List getList() throws SQLException{
		String sql="select num,name,sub,nalja from bbs02";
		//Object 배열 값이 없을때 null을 넣으면 for문 length에서 오류떨어진다.
		return template.executeQuery(sql, new Object[]{});
	}

	public Bbs02Vo selectOne(int num) throws SQLException{
		String sql="select * from bbs02 where num=?";
		return (Bbs02Vo) template.executeQuery(sql, new Object[]{num}).get(0);
	}
	
	
	public void insertOne(String name, String sub, String content) throws SQLException {
		String sql="insert into bbs02 values (bbs02_seq.nextval,?,?,?,sysdate)";
		tempupdate.executeUpdate(sql, new Object[]{name, sub, content});		
	}
	
	public int updateOne(Bbs02Vo bean) throws SQLException{
		String sql="update bbs02 set sub=?, content=? where num=?";
		return tempupdate.executeUpdate(sql, new Object[]{bean.getSub(), bean.getContent(), bean.getNum()});
	}
	
	public int deleteOne(int num) throws SQLException{
		String sql="delete from bbs02 where num=?";
		return tempupdate.executeUpdate(sql, new Object[]{num});
	}
}
