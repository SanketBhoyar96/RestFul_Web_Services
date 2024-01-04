package com.soft.UserOperation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.soft.Provider;
import com.soft.User;

public class UserOp {

	
	public User saveUser(User user) {
		
		Configuration confg = new Configuration();
		confg.configure("com/soft/cnfg/hibernate.cfg.xml");
		
		SessionFactory factory = confg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction trx = session.beginTransaction();
		
		Provider pro = new Provider();
		user = pro.producesDataInJson(); 
		System.out.println(user);
		
		session.save(user);
		
		
		trx.commit();
		return user;
		
		
	}
}
