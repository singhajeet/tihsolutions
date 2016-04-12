/**
 * 
 */
package com.tihs.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.tihs.model.SubService;

/**
 * @author ajeet
 *
 */
public class SubServiceDaoImpl implements SubServiceDao {

	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;
	
	@Override
	public boolean addSubService(SubService subService) throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(subService);
		tx.commit();
		session.close();

		return false;
	}

	@Override
	public SubService getSubServiceById(long id) throws Exception {
		session = sessionFactory.openSession();
		SubService subService = (SubService) session.load(SubService.class,
				new Long(id));
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return subService;
	}

	@Override
	public List<SubService> getSubServiceList() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<SubService> subServiceList = session.createCriteria(SubService.class)
				.list();
		tx.commit();
		session.close();
		return subServiceList;
	}

	@Override
	public boolean deleteSubService(long id) throws Exception {
		session = sessionFactory.openSession();
		Object o = session.load(SubService.class, id);
		tx = session.getTransaction();
		session.beginTransaction();
		session.delete(o);
		tx.commit();
		return false;
	}

}
