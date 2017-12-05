package com.MyComp.PgApplicationApi.service;

import com.MyComp.PgApplicationApi.bean.AddressBean;
import com.MyComp.PgApplicationApi.model.Address;

public interface AddressService {

	
	String add(AddressBean addressBean);
	String update(AddressBean addressBean);
	void delete(int addressID);
	String fetch(int addressID);
	Address fetchAddress(int addressID);
}
