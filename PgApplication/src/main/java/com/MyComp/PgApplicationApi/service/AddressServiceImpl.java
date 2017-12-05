package com.MyComp.PgApplicationApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.MyComp.PgApplicationApi.bean.AddressBean;
import com.MyComp.PgApplicationApi.dao.AddressDao;
import com.MyComp.PgApplicationApi.model.Address;



@Service("AddressService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)

public class AddressServiceImpl implements AddressService{

	@Autowired
	AddressDao addressDao;
	@Override
	public String add(AddressBean addressBean) {
		// TODO Auto-generated method stub
		return addressDao.add(addressBean);	
	}

	@Override
	public String update(AddressBean addressBean) {
		// TODO Auto-generated method stub
		return addressDao.update(addressBean);
	}

	@Override
	public void delete(int addressID) {
		// TODO Auto-generated method stub
		addressDao.delete(addressID);
	}

	@Override
	public String fetch(int addressBean) {
		// TODO Auto-generated method stub
		return addressDao.fetch(addressBean);
	}

	@Override
	public Address fetchAddress(int addressID) {
		// TODO Auto-generated method stub
		return addressDao.fetchAddress(addressID);
	}



	
}
