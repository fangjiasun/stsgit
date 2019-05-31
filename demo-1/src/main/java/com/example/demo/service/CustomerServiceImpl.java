package com.example.demo.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.demo.mapper.CustomerMapper;
import com.example.demo.pojo.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Inject
	private CustomerMapper customerMapper;
	@Override
	public List<Customer> queryAllCustomer() {
		List<Customer> customers =  customerMapper.queryAllCustomer();
		System.out.println("===============customerMapper:"+customerMapper);
		System.out.println("===============customers:"+customers);
		return customers;
	}
	
}
