package com.nstech.persistence;

import static org.junit.jupiter.api.Assertions.fail;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {RootConfig.class})
@ExtendWith(SpringExtension.class)
public class HikariDataSourceTest {
	
	private static final Logger log = Logger.getLogger(HikariDataSourceTest.class);
	@Autowired
	private DataSource dataSource;
	@Test
	public void hikariDataSourceTest() {
	try {
	Connection con = dataSource.getConnection();
	log.info("'Connection객체 : " + con + "'");
	} catch (Exception e) {
	fail(e.getMessage());
	}
	}

	
}
