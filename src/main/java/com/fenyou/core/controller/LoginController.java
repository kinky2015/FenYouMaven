package com.fenyou.core.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fenyou.core.common.base.impl.AbstractBaseController;
import com.fenyou.core.model.User;
import com.fenyou.core.service.UserService;

@Controller
public class LoginController extends AbstractBaseController{
	@Autowired
	private UserService<User> userService;
	@RequestMapping(value="/login.do",method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> login(User user){
		System.out.println("登陆到controller中了！userName:"+user.getUserName()+",password:"+user.getPassWord());
		boolean loginResult = userService.isExist(user);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("loginResult", loginResult);
		return resultMap;
	}
}
