package com.MyComp.PgApplicationApi.dao;

import java.util.List;

import com.MyComp.PgApplicationApi.bean.UserBean;
import com.MyComp.PgApplicationApi.model.User;

public interface UserDao {

  String register(UserBean userBean);
  
	String login(UserBean userBean);
  
  String searchEmail(UserBean userBean);
  
  void authenticate(int id);

  User fetch(int userID);

  String getUserName(int userID);

  User checkMailExist(String emailID);

  String updateUser(User user);

  List<User> search(UserBean userBean);
  
  User getUserDetails(int userID);
}
