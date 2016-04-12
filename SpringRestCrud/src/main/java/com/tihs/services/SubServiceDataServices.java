package com.tihs.services;

import java.util.List;

import com.tihs.model.SubService;

public interface SubServiceDataServices {
	public boolean addSubService(SubService subService) throws Exception;
	public SubService getSubServiceById(long id) throws Exception;
	public List<SubService> getSubServiceList() throws Exception;
	public boolean deleteSubService(long id) throws Exception;
}
