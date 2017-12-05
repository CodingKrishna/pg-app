/**
 * 
 */
package com.MyComp.PgApplicationApi.dao;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.MyComp.PgApplicationApi.bean.AddressBean;
import com.MyComp.PgApplicationApi.model.Address;
import com.MyComp.PgApplicationApi.utility.PgApplicationsUtil;
import com.google.gson.Gson;




@Repository("address")
@Transactional
public class AddressDaoImpl implements AddressDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public String add(AddressBean addressBean) {
		// TODO Auto-generated method stub
		if (addressBean == null) {
			System.out.println("NULL addressBean Obj");
		}

		Address address = new Address();

		if (addressBean.getAddressID() != 0) {
			address.setAddressID(addressBean.getAddressID());
		}
		if (addressBean.getEmailID() != null) {
			address.setEmailID(addressBean.getEmailID());
		}
		if (addressBean.getStreetName() != null) {
			address.setStreetName(addressBean.getStreetName());
		}
		System.out.println(addressBean.getCity());
		if (addressBean.getCity() != null) {
			address.setCity(addressBean.getCity());
		}
		if (addressBean.getState() != null) {
			address.setState(addressBean.getState());
		}
		if (addressBean.getStateCode() != null) {
			address.setStateCode(addressBean.getStateCode());
		}
		if (addressBean.getCountry() != null) {
			address.setCountry(addressBean.getCountry());
		}
		if (addressBean.getCountryCode() != null) {
			address.setCountryCode(addressBean.getCountryCode());
		}
		if (addressBean.getZip() != null) {
			address.setZIP(addressBean.getZip());
		}
		if (addressBean.getIsd() != 0) {
			address.setISD(addressBean.getIsd());
		}
		if (addressBean.getPhoneNumber() != 0) {
			address.setPhoneNumber(addressBean.getPhoneNumber());
		}
		if (addressBean.getLatitude() != null) {
			address.setLatitude(addressBean.getLatitude());
		}
		if (addressBean.getLongitude() != null) {
			address.setLongitude(addressBean.getLongitude());
		}

		address.setCreatedDate(new Date());
		address.setUpdatedDate(new Date());
		address.setIsActive(true);
		try {

			Session session = sessionFactory.getCurrentSession();

			session.saveOrUpdate(address);
			System.out.println("address id:" + address.getAddressID());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Sucessfully Added");
		JSONObject jsonObject = new JSONObject();
		try {
			jsonObject.put(PgApplicationsUtil.STATUS, PgApplicationsUtil.SUCCESS);
			jsonObject.put(PgApplicationsUtil.ADDRESS_ID, address.getAddressID());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonObject.toString();
	}

	@Override
	public String update(AddressBean addressBean) {
		// TODO Auto-generated method stub
		if (addressBean == null) {
			System.out.println("NULL addressBean Obj");
		}

		Address address = new Address();

		if (addressBean.getAddressID() != 0) {
			address.setAddressID(addressBean.getAddressID());
		}
		if (addressBean.getEmailID() != null) {
			address.setEmailID(addressBean.getEmailID());
		}
		if (addressBean.getStreetName() != null) {
			address.setStreetName(addressBean.getStreetName());
		}
		if (addressBean.getCity() != null) {
			address.setCity(addressBean.getCity());
		}
		if (addressBean.getState() != null) {
			address.setState(addressBean.getState());
		}
		if (addressBean.getStateCode() != null) {
			address.setStateCode(addressBean.getStateCode());
		}
		if (addressBean.getCountry() != null) {
			address.setCountry(addressBean.getCountry());
		}
		if (addressBean.getCountryCode() != null) {
			address.setCountryCode(addressBean.getCountryCode());
		}
		if (addressBean.getZip() != null) {
			address.setZIP(addressBean.getZip());
		}
		if (addressBean.getIsd() != 0) {
			address.setISD(addressBean.getIsd());
		}
		if (addressBean.getPhoneNumber() != 0) {
			address.setPhoneNumber(addressBean.getPhoneNumber());
		}
		if (addressBean.getLatitude() != null) {
			address.setLatitude(addressBean.getLatitude());
		}
		if (addressBean.getLongitude() != null) {
			address.setLongitude(addressBean.getLongitude());
		}

		address.setCreatedDate(address.getCreatedDate());
		address.setUpdatedDate(new Date());
		address.setIsActive(address.getIsActive());

		try {

			Session session = sessionFactory.getCurrentSession();

			session.saveOrUpdate(address);
			System.out.println("user.id:" + address.getAddressID());
			System.out.println("Date:" + new Date());
			System.out.println("Date Up:" + address.getUpdatedDate());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Sucessfully Updated");

		JSONObject jsonObject = new JSONObject();
		JSONObject jsonObjectData = new JSONObject();
		try {
			jsonObjectData.put(PgApplicationsUtil.ADDRESS_ID, address.getAddressID());
			jsonObject.put(PgApplicationsUtil.STATUS, PgApplicationsUtil.SUCCESS);
			jsonObject.put(PgApplicationsUtil.DATA, jsonObjectData);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonObject.toString();

	}

	@Override
	public void delete(int addressID) {

		Address address = new Address();
		Session session = sessionFactory.getCurrentSession();

		// TODO Auto-generated method stub

		try {

			address = (Address) session.get(Address.class, addressID);
			if (address != null) {
				address.setIsActive(false);
				session.saveOrUpdate(address);
				System.out.println("user.id:   " + address.getAddressID() + "   deleted");
			} else
				System.out.println("no  Data found");

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	@Override
	public String fetch(int addressID) {
		// TODO Auto-generated method stub
		Address address = new Address();
		AddressBean addressBean = new AddressBean();
		Gson gson = new Gson();
		String json = null;
		try {

			Session session = sessionFactory.getCurrentSession();

			address = (Address) session.get(Address.class, addressID);
			json = gson.toJson(address);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return json;
	}

	@Override
	public Address fetchAddress(int addressID) {
		// TODO Auto-generated method stub
		try {

			Session session = sessionFactory.getCurrentSession();

			Address address = (Address) session.get(Address.class, addressID);

			return address;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
