/**
 * 
 */
package com.MyComp.PgApplicationApi.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.MyComp.PgApplicationApi.bean.AddressBean;
import com.MyComp.PgApplicationApi.service.AddressService;;



@Controller
@RequestMapping("/address")
public class AddressController {
	
	Logger logger = Logger.getLogger(AddressController.class);
	@Autowired
	AddressService addressService;
	
	@RequestMapping(value ="/add" ,method = RequestMethod.POST)
	public @ResponseBody String add(@RequestBody AddressBean addressBean) {
		System.out.println("add");
		addressService.add(addressBean);
	 return "Success";
	}
	
	@RequestMapping(value ="/update" ,method = RequestMethod.POST)
	public @ResponseBody String update(@RequestBody AddressBean addressBean) {
		System.out.println("update");
		
	 return addressService.update(addressBean);
	}
	
	@RequestMapping(value ="/delete/{addressID}" ,method = RequestMethod.GET)
	public @ResponseBody String delete(@PathVariable("addressID") int addressID) {
		System.out.println("delete");
		addressService.delete(addressID);
	 return "Record ID" + addressID +"Deleted";
	}
	
	@RequestMapping(value ="/fetch/{addressID}" ,method = RequestMethod.GET)
	public @ResponseBody String fetch(@PathVariable("addressID") int addressID) {
		System.out.println("fetch");
		System.out.println(addressID);
		return addressService.fetch(addressID);
		
	}

}
