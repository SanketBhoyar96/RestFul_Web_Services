package com.soft;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/provider")
public class Provider {
	
	@Path("/getemp")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Employee producesDataInJson() {
		
	Employee emp = new Employee();
	emp.setEmpId(100);
	emp.setEmpName("Amit");
	emp.setSalary(32500);
	
	return emp;
	
	
	}
	
}
