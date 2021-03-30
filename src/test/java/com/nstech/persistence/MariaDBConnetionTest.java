package com.nstech.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

public class MariaDBConnetionTest {
	
	/*final String DRIVER = "org.mariadb.jdbc.Driver";
	final String URL = "jdbc:mariadb://127.0.0.1:3306";
	final String USER = "nstech";
	final String PASSWORD = "1111";

	@Test
	public void mariaTest() throws Exception{
		Class.forName(DRIVER);
		
		try(Connection con = DriverManager.getConnection(URL, USER, PASSWORD) ){
			System.out.println(con);
		}catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
*/		
	private static final Logger log = Logger.getLogger(MariaDBConnetionTest.class);
	String url ="jdbc:mariadb://localhost:3306/nstech?user=nstech&password=1111";
	@Test
	public void connectionTest() {
	try {
	// Class.forName("org.mariadb.jdbc.Driver"); 주석처리 가능
	// 자동으로 JDBC드라이버를 호출함(현재 버전2.6.2, 최소 지원 버전은 잘 모르겠음)
	Connection connection = DriverManager.getConnection(url);
	log.info("### connection : " + connection + " - 연결 성공 ####");
	}catch (SQLException e) {
	e.printStackTrace();

	
}
	}
}
