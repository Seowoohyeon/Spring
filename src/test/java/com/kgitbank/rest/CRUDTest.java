package com.kgitbank.rest;

import static org.junit.Assert.*;

import java.awt.Menu;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kgitbank.mapper.MenuMapper;
import com.zaxxer.hikari.HikariDataSource;

import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class CRUDTest {
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	@Autowired
	private MenuMapper mmpper;
	
	@Test
	public void test() {
		try(
			SqlSession session = sqlSessionFactory.openSession();
			Connection conn = session.getConnection();
		) {
			log.info(conn);
			assertNotNull(conn);
		} catch (SQLException e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	@Ignore
	public void getEmpListTest() {
		List<Menu> menus = mmpper.getMenuList();
		
		if (menus.size() == 0) {
			fail("¾Æ´Ñµí");
		}
		
		for (Menu menu : menus) {
			System.out.println(menu);
		}
	}

}
