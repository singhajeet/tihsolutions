/**
 * 
 */
package com.tihs.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.tihs.model.Service;

/**
 * @author ajeet
 *
 */
public class ServiceDaoImpl implements ServiceDao {

	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;
	
	@Override
	public boolean addService(Service service) throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(service);
		tx.commit();
		session.close();

		return false;
	}

	@Override
	public Service getServiceById(long id) throws Exception {
		session = sessionFactory.openSession();
		Service service = (Service) session.load(Service.class,
				new Long(id));
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return service;
	}

	@Override
	public List<Service> getServiceList() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<Service> serviceList = session.createCriteria(Service.class)
				.list();
		tx.commit();
		session.close();
		return serviceList;
	}

	@Override
	public boolean deleteService(long id) throws Exception {
		session = sessionFactory.openSession();
		Object o = session.load(Service.class, id);
		tx = session.getTransaction();
		session.beginTransaction();
		session.delete(o);
		tx.commit();
		return false;
	}

}
