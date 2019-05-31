package com.example.demo.web;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.pojo.Customer;
import com.example.demo.service.CustomerService;

@Controller
public class CustomerController {
	@Inject
	private CustomerService customerService;
	
	@RequestMapping("list")
	public ModelAndView getList(){
		ModelAndView model = new ModelAndView();
		List<Customer> customers = customerService.queryAllCustomer();
		model.addObject("customers", customers);
		model.setViewName("list");
		return model;
	} 
}
