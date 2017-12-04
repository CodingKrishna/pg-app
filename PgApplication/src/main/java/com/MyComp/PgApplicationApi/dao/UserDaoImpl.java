package com.MyComp.PgApplicationApi.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.Restrictions;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.MyComp.PgApplicationApi.bean.UserBean;
import com.MyComp.PgApplicationApi.model.User;
import com.MyComp.PgApplicationApi.utility.PgApplicationsUtil;
import com.google.gson.Gson;

@Repository("user")
@Transactional

public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public String register(UserBean userBean) {
		if (userBean == null) {
			System.out.println("NULL addressBean Obj");
		}

		User user = new User();
		if (userBean.getUserType() != null) {
			user.setUserType(userBean.getUserType());
		}
		if (userBean.getFirstName() != null) {
			user.setFirstName(userBean.getFirstName());
		}
		if (userBean.getMiddleName() != null) {
			user.setMiddleName(userBean.getMiddleName());
		}
		if (userBean.getLastName() != null) {
			user.setLastName(userBean.getLastName());
		}
		if (userBean.getUserType() != null) {
			user.setUserType(userBean.getUserType());
		}
		if (userBean.getGenderID() != null) {
			user.setGenderID(userBean.getGenderID());
		}

		if (userBean.getEmailID() != null) {
			user.setEmailID(userBean.getEmailID());
		}
		if (userBean.getPhoneNumber() != null) {
			user.setPhoneNumber(userBean.getPhoneNumber());
		}
		if (userBean.getPassword() != null) {
			user.setPassword(userBean.getPassword());
		}

		if (userBean.getDob() != null) {
			user.setDob(userBean.getDob());
		}

		user.setCreatedDate(new Date());
		user.setUpdatedDate(new Date());
		try {

			Session session = sessionFactory.getCurrentSession();

			session.saveOrUpdate(user);
			System.out.println("user.id:" + user.getUserID());
		} catch (Exception e) {
			System.out.println("error msg" + e.getMessage());
			if (e.getMessage().startsWith("Duplicate entry")) {
				// return "User already exist";
				return "{'status':'user already exist'}";

			}
			e.printStackTrace();

		}
		System.out.println("Sucessfully updated");
		Gson gson = new Gson();
		gson.toJson(user);
		System.out.println(gson.toJson(user));
		JSONObject jsonObject = new JSONObject();
		JSONObject jsonObjectData = new JSONObject();
		try {
			jsonObjectData.put(PgApplicationsUtil.USER_TYPE, user.getUserType());
			jsonObjectData.put(PgApplicationsUtil.USER_EXIST, 0);
			jsonObjectData.put(PgApplicationsUtil.USER_ID, user.getUserID());
			//jsonObject.put(PgApplicationsUtil.STATUS, PgApplicationsUtil.SUCCESS);
			jsonObject.put(PgApplicationsUtil.DATA, jsonObjectData);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return jsonObject.toString();
	}

	@Override
	public List<User> search(UserBean userBean) {
		// TODO Auto-generated method stub
		User user = new User();
		List<User> userList = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			Criteria criteria = session.createCriteria(User.class);
			Disjunction or = Restrictions.disjunction();
			if (userBean.getFirstName() != null && !userBean.getFirstName().trim().equalsIgnoreCase(""))
				or.add(Restrictions.like("firstName", "%" + userBean.getFirstName() + "%"));

			if (userBean.getLastName() != null && !userBean.getLastName().trim().equalsIgnoreCase(""))
				or.add(Restrictions.like("lastName", "%" + userBean.getLastName() + "%"));

			if (userBean.getEmailID() != null && !userBean.getEmailID().trim().equalsIgnoreCase(""))
				or.add(Restrictions.like("emailID", "%" + userBean.getEmailID() + "%"));

			criteria.add(or);
			userList = (List<User>) criteria.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userList;
	}

	@Override
	public void authenticate(int id) {
		Session session = sessionFactory.getCurrentSession();
		User user = new User();
		user = (User) session.get(User.class, id);
		session.saveOrUpdate(user);
		// TODO Auto-generated method stub

	}

	@Override
	public User fetch(int userID) {
		// TODO Auto-generated method stub
		User user = new User();

		try {

			Session session = sessionFactory.getCurrentSession();

			user = (User) session.get(User.class, userID);

			System.out.println("user.id:" + user.getUserID());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;

	}

	//// searching for already exist emailID >>>>>>>>
	@Override
	public String searchEmail(UserBean userBean) {

		// TODO Auto-generated method stub

		Session session = sessionFactory.getCurrentSession();
		String SQL_QUERY = " from User as o where o.emailID=?";
		Query query = session.createQuery(SQL_QUERY);
		query.setParameter(0, userBean.getEmailID());
		List<User> list = query.list();
		if ((list != null) && (list.size() > 0)) {
			System.out.println("User Dao layer: User exist");

			JSONObject jsonObject = new JSONObject();
			JSONObject jsonObjectData = new JSONObject();
			try {
				jsonObjectData.put(PgApplicationsUtil.USER_EXIST, 1);
				jsonObject.put(PgApplicationsUtil.STATUS, PgApplicationsUtil.SUCCESS);
				jsonObject.put(PgApplicationsUtil.DATA, jsonObjectData);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return jsonObject.toString();

		}

		return null;

	}

	@Override
	public String getUserName(int userID) {
		// TODO Auto-generated method stub
		User user = new User();
		Gson gson = new Gson();
		UserBean userbean = new UserBean();
		String json = null;
		try {

			Session session = sessionFactory.getCurrentSession();

			user = (User) session.get(User.class, userID);
			userbean.setUserID(user.getUserID());
			userbean.setFirstName(user.getFirstName());
			userbean.setMiddleName(user.getMiddleName());
			userbean.setLastName(user.getLastName());
			userbean.setUserType(user.getUserType());
			userbean.setEmailID(user.getEmailID());

			json = gson.toJson(userbean);
			System.out.println("user.id:" + user.getUserID());
			System.out.println("FirstName:" + user.getFirstName());
			System.out.println("MiddleName:" + user.getMiddleName());
			System.out.println("LastName:" + user.getLastName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return json;

	}

	@Override
	public User getUserDetails(int userID) {
		// TODO Auto-generated method stub
		User user = new User();
		Gson gson = new Gson();
		UserBean userbean = new UserBean();
		String json = null;
		try {

			Session session = sessionFactory.getCurrentSession();

			user = (User) session.get(User.class, userID);
			System.out.println("user.id:" + user.getUserID());
			System.out.println("FirstName:" + user.getFirstName());
			System.out.println("MiddleName:" + user.getMiddleName());
			System.out.println("LastName:" + user.getLastName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;

	}
	//// get mentor relationship list>>>>>>>>>>>>

	@Override
	public User checkMailExist(String emailID) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();

		List<User> list;
		try {
			String SQL_QUERY = "from User as o where o.emailID = ?";
			Query query = session.createQuery(SQL_QUERY);
			query.setParameter(0, emailID);
			list = query.list();
			if ((list != null) && (list.size() > 0)) {
				System.out.println(" " + list.get(0).toString());
				return list.get(0);
			}

		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			System.out.println("error message " + e.getMessage());
			/* e.printStackTrace(); */

		}

		return null;

	}

	@Override
	public String updateUser(User user) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		try {
			session.saveOrUpdate(user);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

		return "Succes";
	}

}
