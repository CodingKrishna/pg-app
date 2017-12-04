package com.MyComp.PgApplicationApi.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.MyComp.PgApplicationApi.bean.UserBean;
import com.MyComp.PgApplicationApi.model.User;
import com.MyComp.PgApplicationApi.service.UserService;
import com.google.gson.Gson;

@Controller
@RequestMapping("/user")

@Transactional

public class UserController {
  Logger logger = Logger.getLogger(UserController.class);
  @Autowired
  UserService userService;

  @Autowired
  private SessionFactory sessionFactory;

  @RequestMapping(value = "/register", method = RequestMethod.POST)
  public @ResponseBody String register(@RequestBody UserBean userBean) {
    System.out.println("register");
    String data = userService.register(userBean);
    System.out.println(data);
    return data;
  }

  @RequestMapping(value = "/sendEmail", method = RequestMethod.POST)
  public @ResponseBody String sendEmail(@RequestBody UserBean userBean) {
    System.out.println("sendEmail");
    
    try {
    	String user = userService.getUserName(userBean.getUserID());
        JSONObject jsonObject1 = new JSONObject(user);
    	userBean.setFirstName(jsonObject1.getString("firstName"));
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return "Success";
  }

  @RequestMapping(value = "/login", method = RequestMethod.POST)
  public @ResponseBody String login(@RequestBody UserBean userBean) {
    System.out.println("login");
    return userService.login(userBean);
  }

  @RequestMapping(value = "/fetch/{userID}", method = RequestMethod.GET)
  public @ResponseBody String fetch(@PathVariable("userID") int userID) {
    System.out.println("fetch");
    System.out.println(userID);
    return userService.fetch(userID);
  }
  
  @RequestMapping(value = "/search", method = RequestMethod.POST)
  public @ResponseBody String searchStudents(@RequestBody UserBean userBean) {
	  List<User>  list =userService.search(userBean);
	  Gson gson = new Gson();
		String json = gson.toJson(list);	
    return json;
  }

  // fetch Username + userID
  @RequestMapping(value = "/username/{userID}", method = RequestMethod.GET)
  public @ResponseBody String Fetch(@PathVariable("userID") int userID) {
    System.out.println("username");
    System.out.println(userID);
    return userService.getUserName(userID);
  }


}
