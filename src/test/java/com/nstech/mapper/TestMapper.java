package com.nstech.mapper;

import org.apache.ibatis.annotations.Select;

public interface TestMapper {
	public String getTime();
	
	@Select("Select now()")
	public String getTime2();
}
