package com.MyComp.PgApplicationApi.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.MyComp.PgApplicationApi.bean.PropertyDetailsBean;
import com.MyComp.PgApplicationApi.service.PropertyDetailsService;

@Controller
@RequestMapping("property")
public class PropertyDetailsController {
	
	Logger logger = Logger.getLogger(PropertyDetailsController.class); 
	
	@Autowired
	PropertyDetailsService propertyDetailsService;
	
	@RequestMapping(value = "/add" ,method = RequestMethod.POST)
	public @ResponseBody String add(@RequestBody PropertyDetailsBean  propertyDetailsBean){
		System.out.println("add");
		propertyDetailsService.add(propertyDetailsBean);
		return "Success";
	}
	
	
	
	

}
