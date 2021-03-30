package com.nstech.mapper;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.nstech.persistence.RootConfig;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes= {RootConfig.class})
public class MapperTest {

	private static final Logger log = Logger.getLogger(MapperTest.class);
	
	@Autowired
	private TestMapper testMapper;
	
	@Test
	public void getTime() {
		log.info("'현재 시각 : " + testMapper.getTime() +"'");
		log.info("'현재 시각 : " + testMapper.getTime2() +"'");
	}
}
