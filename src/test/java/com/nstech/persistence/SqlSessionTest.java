package com.nstech.persistence;

import static org.junit.jupiter.api.Assertions.fail;

import java.sql.Connection;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {RootConfig.class})
@ExtendWith(SpringExtension.class)
public class SqlSessionTest {
	

		private static final Logger log = Logger.getLogger(SqlSessionTest.class);
		@Autowired
		private SqlSessionFactory sqlSessionFactory;
		@Test
		public void sqlSessionFactoryTest() {
		try {
		SqlSession session = sqlSessionFactory.openSession();
		Connection connection = session.getConnection();
		log.info("'Session 객체 : " + session + "'");
		log.info("'Connection 객체 : " + connection + "'");
		} catch (Exception e) {
		fail(e.getMessage());
		}
		}

		
}
