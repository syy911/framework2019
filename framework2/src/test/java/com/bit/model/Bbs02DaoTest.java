package com.bit.model;

import java.sql.Connection;
import java.sql.SQLException;

import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.bit.model.entity.Bbs02Vo;

public class Bbs02DaoTest {
	//배포하는 war파일안에는 test내용이 들어가지 않는다
	//그냥 두고 사용하면 됨.
	
	Bbs02Dao dao;
	
	public Bbs02DaoTest() {
	}
	
	@BeforeClass
	public static void setUpBeforeClass(){
		//맨 처음 한번만 실행, 반드시 static
		//하나의 dao로 사용하는 방법
		//dao=new Bbs02Dao();
	}
	
	@AfterClass
	public static void tearDownAfterClass(){
		//맨 마지막 한번만 실행, 반드시 static
	}
	
	@Before
	public void setUp() throws SQLException{
		//각 test마다 dao생성
		dao=new Bbs02Dao();
	}
	
	@After
	public void tearDown(){
	}
	
/*	@Test
	public void testGetConnection(){
		//try catch시 오류상황에서 catch로 넘어가서 
		//오류상황이 test에서 확인되지 않는다.
		try {
			Connection conn = dao.getConnection();
			Assert.assertNotNull(conn);	//null이 아니면 성공
		} catch (SQLException e) {
			Assert.assertFalse(true);	//에러의 상황임을 나타냄
		}
	}*/
	
	@Test
	public void testInsertOne() throws SQLException{
		Bbs02Vo bean = new Bbs02Vo();
		bean.setName("tester");
		bean.setSub("testData");
		bean.setContent("test");
		
		//예상치와 실 결과값의 비교
		Assert.assertSame(1, dao.insertOne(bean));
	}
	
	@Test
	public void testSelectAll() throws SQLException{
		Assert.assertNotNull(dao.selectAll("test01"));
		Assert.assertTrue(dao.selectAll("%%").size()>0);
//		Assert.assertSame(1, dao.selectAll("test1").size());
	}

}
//		Assert.assertNull(null);	//null이면 성공
//		Assert.assertEquals(1, 1);	//같으면 성공
//		Assert.assertSame(1, 1);	//같으면 성공
//		Assert.assertNotSame(1, 2);	//같지 않으면 성공
//		Assert.assertTrue(true);	//true이면 성공
//		Assert.assertFalse(false);	//false이면 성공		
