package com.MyComp.PgApplicationApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.MyComp.PgApplicationApi.bean.PropertyDetailsBean;
import com.MyComp.PgApplicationApi.dao.PropertyDetailsDao;

@Service("PropertyDetailsService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)

public class PropertyDetailsServiceImpl implements PropertyDetailsService {
	
	@Autowired
	PropertyDetailsDao propertyDetailsDao;
	
	
	@Override
	public String add(PropertyDetailsBean propertyDetailsBean) {
		// TODO Auto-generated method stub
		return propertyDetailsDao.add(propertyDetailsBean);
	}

}
