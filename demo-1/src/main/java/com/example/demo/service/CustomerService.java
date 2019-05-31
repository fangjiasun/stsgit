package com.example.demo.service;

import java.util.List;

import com.example.demo.pojo.Customer;

public interface CustomerService {
	/**
	 * 获取所有用户信息
	 * @return
	 */
	List<Customer> queryAllCustomer();
}
