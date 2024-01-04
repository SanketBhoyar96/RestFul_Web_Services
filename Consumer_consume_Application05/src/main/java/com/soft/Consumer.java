package com.soft;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/consumer")
public class Consumer {

	@Path("/getempObj")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public String consumeJsonToObject(Employee emp) {
		return "empId::" + emp.getEmpId() + " ,empName::"  + emp.getEmpName() + " , empSalary::" + emp.getSalary() + "";

	}
}
