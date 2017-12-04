package com.MyComp.PgApplicationApi.service;

import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.MyComp.PgApplicationApi.bean.UserBean;
import com.MyComp.PgApplicationApi.dao.UserDao;
import com.MyComp.PgApplicationApi.model.User;
import com.MyComp.PgApplicationApi.utility.PgApplicationsUtil;
import com.google.gson.Gson;

@Service("UserService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	@Override
	public String register(UserBean userBean) {

		String userexist = userDao.searchEmail(userBean);

		if (userexist == null) {
			System.out.println("user notexist");

			String userData = userDao.register(userBean);

			JSONObject jsonObjectRegiData = new JSONObject();
			int userID = 0;
			try {
				JSONObject jsonObjectRegi = new JSONObject(userData);
				jsonObjectRegiData = (JSONObject) jsonObjectRegi.get(PgApplicationsUtil.DATA);
				userID = (int) jsonObjectRegiData.get(PgApplicationsUtil.USER_ID);
				System.out.println("user ID in usersevice for points" + userID);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return userData;
		}
		;

		return userexist;
	}

	@Override
	public String fetch(int userID) {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		String json = null;
		User user = userDao.fetch(userID);
		json = gson.toJson(user);
		return json;
	}

	@Override
	public String getUserName(int userID) {
		return userDao.getUserName(userID);
	}

	@Override
	public User getUserDetails(int userID) {
		return userDao.getUserDetails(userID);
	}

	@Override
	public List<User> search(UserBean userBean) {
		List<User> userList = userDao.search(userBean);
		return userList;
	}
	
	@Override
	public void authenticate(int id) {
		userDao.authenticate(id);
	}

	@Override
	public String login(UserBean userBean) {
		
		
			return userDao.login(userBean);
		
	}
	

}
