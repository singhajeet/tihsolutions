/**
 * 
 */
package com.tihs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tihs.dao.ServiceDao;
import com.tihs.model.Service;

/**
 * @author ajeet
 *
 */
public class ServiceDataServicesImpl implements ServiceDataServices{

	@Autowired
	ServiceDao serviceDao;
	
	@Override
	public boolean addService(Service service) throws Exception {
		return serviceDao.addService(service);
	}

	@Override
	public Service getServiceById(long id) throws Exception {
		return serviceDao.getServiceById(id);
	}

	@Override
	public List<Service> getServiceList() throws Exception {
		return serviceDao.getServiceList();
	}

	@Override
	public boolean deleteService(long id) throws Exception {
		return serviceDao.deleteService(id);
	}

}
