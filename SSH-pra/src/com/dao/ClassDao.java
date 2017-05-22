package com.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.po.ClassPO;

public class ClassDao extends HibernateDaoSupport{
	private ClassPO classpo;
	public ClassPO getClasspo() {
		return classpo;
	}
	public void setClasspo(ClassPO classpo) {
		this.classpo = classpo;
	}
	public boolean saveClass(ClassPO classpo)throws Exception{
		boolean flag=false;
		this.getHibernateTemplate().save(classpo);
		flag=true;
		return flag;
	}

}
