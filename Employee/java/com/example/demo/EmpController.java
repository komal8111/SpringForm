package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpController
{
	@Autowired
	EmployeeRepo repo;

	@RequestMapping("/")
	public String display(Model m)
	{
		List<Employee>list=repo.findAll();
		m.addAttribute("list",list);
		return "display.jsp";
	}
	
	@RequestMapping("add")
	public String add(Model m)
	{
		Employee e=new Employee();
		m.addAttribute("employee", e);
		System.out.println(e);
		return "add.jsp";
		
	}
	
	@RequestMapping("save")
	public String save(Employee e)
	{
		repo.save(e);
		return "redirect:/";
		
	}
	
	@RequestMapping("delete/{emp_id}")
	public String delete(@PathVariable int emp_id,Model m)
	{
		
		repo.deleteById(emp_id);
		List<Employee> list=repo.findAll();
		m.addAttribute("list", list);
		return "/";
		
	}
	
	@RequestMapping("{emp_id}")
	public String edit(@PathVariable int emp_id,Model m)
	{
	
		Employee e=repo.getOne(emp_id);
		m.addAttribute("employee", e);
		return "add.jsp";
	}
	
	
}
