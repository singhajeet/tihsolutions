package com.tihs.services;

import java.util.List;

import com.tihs.model.Service;

public interface ServiceDataServices {
	public boolean addService(Service service) throws Exception;
	public Service getServiceById(long id) throws Exception;
	public List<Service> getServiceList() throws Exception;
	public boolean deleteService(long id) throws Exception;
}
