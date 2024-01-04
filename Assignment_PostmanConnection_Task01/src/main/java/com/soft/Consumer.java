package com.soft;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@Path("/consumer")
public class Consumer {

	@Path("/getuserObj")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public String consumeJsonToObject() {
		
		Configuration confg = new Configuration();
		confg.configure("com/soft/cnfg/hibernate.cfg.xml");
		
		SessionFactory factory = confg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction trx = session.beginTransaction();
		 
		User user = (User) session.get(User.class, 67); 
		
//		session.save(user);
		System.out.println(user);
		
		
		
		
		return "empId::" + user.getId() + " ,empName::"  +user.getName() + " , empSalary::" + user.getSalary() + "";

	}
}
