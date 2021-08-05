package com.kgitbank.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.kgitbank.rest.model.Menu;


public interface MenuMapper {

	@Select("select * from menu")
	public List<Menu> getMenuList();
	
	
}
