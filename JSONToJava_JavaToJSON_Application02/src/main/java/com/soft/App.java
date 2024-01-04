package com.soft;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		try {

			Employee emp = new Employee();
			emp.setId(100);
			emp.setName("sanket");
			emp.setSalary(10202);

			ObjectMapper om = new ObjectMapper();
			String json = om.writeValueAsString(emp);
			System.out.println(emp);
			System.out.println("================================");
			System.out.println(json);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
