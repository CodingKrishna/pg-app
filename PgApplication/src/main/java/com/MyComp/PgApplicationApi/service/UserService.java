package com.MyComp.PgApplicationApi.service;

import java.util.List;

import com.MyComp.PgApplicationApi.bean.UserBean;
import com.MyComp.PgApplicationApi.model.User;

public interface UserService {

  String register(UserBean userBean);
  void authenticate(int id);
  String login(UserBean userBean);

  String fetch(int userID);

  String getUserName(int userID);

  List<User> search(UserBean userBean);
  
  User getUserDetails(int userID);
}
