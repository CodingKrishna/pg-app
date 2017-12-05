package com.MyComp.PgApplicationApi.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.MyComp.PgApplicationApi.bean.PropertyDetailsBean;
@Repository("property")
@Transactional
public class PropertyDetailsDaoImpl implements PropertyDetailsDao{

	@Autowired SessionFactory sessionFactory;
	
	
	@Override
	public String add(PropertyDetailsBean propertyDetailsBean) {
		// TODO Auto-generated method stub
		
		if (propertyDetailsBean != null) {
			System.out.println("Null propertyDetailsBean obj");
		}
		
		
		return null;
	}

}
