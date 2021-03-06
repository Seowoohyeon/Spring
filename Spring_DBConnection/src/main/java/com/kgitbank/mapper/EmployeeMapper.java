package com.kgitbank.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.kgitbank.model.Employee;

public interface EmployeeMapper {

	@Select("select * from employees")
	public List<Employee> getEmpList();
	
	public List<Employee> getEmpList2();
	
//	public HashMap<String, Object> getEmployeeMap(int id);
	
	public Employee getEmployee(int id);
	
	public int create(Employee e);
	
}
