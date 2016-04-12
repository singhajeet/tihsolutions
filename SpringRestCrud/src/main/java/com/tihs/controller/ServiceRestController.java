package com.tihs.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tihs.model.Service;
import com.tihs.model.Status;
import com.tihs.services.ServiceDataServices;

@Controller
@RequestMapping("/service")
public class ServiceRestController {

	@Autowired
	ServiceDataServices serviceDataServices;

	static final Logger logger = Logger.getLogger(ServiceRestController.class);

	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody
	Status addService(@RequestBody Service service) {
		try {
			serviceDataServices.addService(service);
			return new Status(1, "Service added Successfully !");
		} catch (Exception e) {
			// e.printStackTrace();
			return new Status(0, e.toString());
		}

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody
	Service getServiceById(@PathVariable("id") long id) {
		Service service = null;
		try {
			service = serviceDataServices.getServiceById(id);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return service;
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody
	List<Service> getServiceList() {

		List<Service> serviceList = null;
		try {
			serviceList = serviceDataServices.getServiceList();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return serviceList;
	}

	@RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
	public @ResponseBody
	Status deleteService(@PathVariable("id") long id) {

		try {
			serviceDataServices.deleteService(id);
			return new Status(1, "Service deleted Successfully !");
		} catch (Exception e) {
			return new Status(0, e.toString());
		}

	}
}
