package com.soft;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.soft.UserOperation.UserOp;

@Path("/provider")
public class Provider {

	@Path("/getEmp")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public User producesDataInJson() {
		
		
		User user = new User();
		user.setId(69);
		user.setName("aniket");
		user.setSalary(6700);
		
//		UserOp op = new UserOp();
//		op.saveUser(user);
		
		Configuration confg = new Configuration();
		confg.configure("com/soft/cnfg/hibernate.cfg.xml");
		
		SessionFactory factory = confg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction trx = session.beginTransaction();
		 
		
		session.save(user);
		System.out.println(user);
		
		
		trx.commit();
		return user;
		
	
	}

}
