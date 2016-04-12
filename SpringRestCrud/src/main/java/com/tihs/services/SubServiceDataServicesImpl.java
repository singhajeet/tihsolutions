/**
 * 
 */
package com.tihs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tihs.dao.SubServiceDao;
import com.tihs.model.SubService;

/**
 * @author ajeet
 *
 */
public class SubServiceDataServicesImpl implements SubServiceDataServices{

	@Autowired
	SubServiceDao subServiceDao;
	
	@Override
	public boolean addSubService(SubService subService) throws Exception {
		return subServiceDao.addSubService(subService);
	}

	@Override
	public SubService getSubServiceById(long id) throws Exception {
		return subServiceDao.getSubServiceById(id);
	}

	@Override
	public List<SubService> getSubServiceList() throws Exception {
		return subServiceDao.getSubServiceList();
	}

	@Override
	public boolean deleteSubService(long id) throws Exception {
		return subServiceDao.deleteSubService(id);
	}

}
