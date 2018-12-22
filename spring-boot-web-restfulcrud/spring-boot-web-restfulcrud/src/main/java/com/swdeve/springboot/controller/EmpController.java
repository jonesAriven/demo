package com.swdeve.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.swdeve.springboot.dao.EmployeeDao;

@Controller
public class EmpController {

	@Autowired//有@Autowired 注解就不需要get，set方法了
	EmployeeDao employeeDao;
	
	@GetMapping("/emps")
	public String list(Model model) {
		model.addAttribute("emps", employeeDao.getAll());
		return "emp/list";
	}
}
