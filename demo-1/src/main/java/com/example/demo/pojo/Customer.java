package com.example.demo.pojo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Customer {
	private Integer id;
	private String name;
	private Integer sex;
	private Date birthday;
}
