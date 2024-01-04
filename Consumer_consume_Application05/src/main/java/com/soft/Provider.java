package com.soft;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/provider")
public class Provider {

	@Path("/getEmp")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Employee producesDataInJson() {
		
		Employee emp = new Employee();
		emp.setEmpId(101);
		emp.setEmpName("Ajaay");
		emp.setSalary(15222);
		
		return emp;
	
	}

}
