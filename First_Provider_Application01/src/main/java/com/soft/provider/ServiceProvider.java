package com.soft.provider;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/provider")
public class ServiceProvider {
	
	
	@Path("/msg")
	@GET
	public String showMassage() {
		
		// ha response entity throgh janar(entity cha object mnun janr)
		return"Welcome to RestFul Web Services sanket";
	}

}
