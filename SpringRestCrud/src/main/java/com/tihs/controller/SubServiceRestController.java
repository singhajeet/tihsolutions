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

import com.tihs.model.Status;
import com.tihs.model.SubService;
import com.tihs.services.SubServiceDataServices;

@Controller
@RequestMapping("/subservice")
public class SubServiceRestController {

	@Autowired
	SubServiceDataServices subServiceDataServices;

	static final Logger logger = Logger.getLogger(SubServiceRestController.class);

	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody
	Status addSubService(@RequestBody SubService subService) {
		try {
			subServiceDataServices.addSubService(subService);
			return new Status(1, "SubService added Successfully !");
		} catch (Exception e) {
			// e.printStackTrace();
			return new Status(0, e.toString());
		}

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody
	SubService getSubServiceById(@PathVariable("id") long id) {
		SubService subService = null;
		try {
			subService = subServiceDataServices.getSubServiceById(id);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return subService;
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody
	List<SubService> getSubServiceList() {
		List<SubService> subServiceList = null;
		try {
			subServiceList = subServiceDataServices.getSubServiceList();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return subServiceList;
	}

	@RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
	public @ResponseBody
	Status deleteSubService(@PathVariable("id") long id) {
		try {
			subServiceDataServices.deleteSubService(id);
			return new Status(1, "SubService deleted Successfully !");
		} catch (Exception e) {
			return new Status(0, e.toString());
		}

	}
}
