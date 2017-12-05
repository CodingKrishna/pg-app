package com.MyComp.PgApplicationApi.service;

import java.util.List;

import com.MyComp.PgApplicationApi.bean.UserBean;
import com.MyComp.PgApplicationApi.model.User;

public interface UserService {

  String register(UserBean userBean);
  String updateProfile(UserBean userBean);
  void authenticate(int id);
  String login(UserBean userBean);
  void forgetPassword(UserBean userBean);

  String fetch(int userID);
  String saveProfileImage(UserBean userBean);
  String getUserName(int userID);
  User downloadImage(Integer userID);
  List<User> search(UserBean userBean);
  
  User getCoverImage(Integer userID);
	User downloadCoverImage(Integer userID);
	String saveCoverImage(UserBean userBean);
  
  User getUserDetails(int userID);
}
