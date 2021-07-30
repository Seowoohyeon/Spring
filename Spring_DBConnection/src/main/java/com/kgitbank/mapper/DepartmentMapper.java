package com.kgitbank.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.kgitbank.model.Department;
import com.kgitbank.model.Employee;

public interface DepartmentMapper {

	@Select("select * from departments")
	public List<Department> getDepartList();
	
}
