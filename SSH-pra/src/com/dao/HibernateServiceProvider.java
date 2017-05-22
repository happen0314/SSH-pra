package com.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateServiceProvider {
	private static SessionFactory sessionFactory=null;
	private static Configuration configuration=new Configuration();
	
	
	public HibernateServiceProvider(){
		initHibernate();
	}
	
	
	public static synchronized void initHibernate() throws HibernateException{
		if(sessionFactory==null)
			try{
				configuration.configure();
				sessionFactory=configuration.buildSessionFactory();
			}catch(HibernateException he){
				System.err.println("Error Crateing SessionFactory");
				throw he;
			}
	}
	
	
	public static void rebuildSessionFactory()throws HibernateException{
		try{
			configuration.configure();
			sessionFactory=configuration.buildSessionFactory();
		}catch(HibernateException he){
			System.err.println("Error Creating SeddionFactory");
			throw he;
		}
	}
	
	
	public Session getSession()throws HibernateException{
		if(sessionFactory==null){
			rebuildSessionFactory();
		}
		Session session=sessionFactory.openSession();
		return session;
	}
	
	public void closeSessionFactory()throws HibernateException{
		sessionFactory.close();
	}

}
