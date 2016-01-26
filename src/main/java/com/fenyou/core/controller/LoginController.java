package com.fenyou.core.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fenyou.core.model.User;
import com.fenyou.core.service.UserService;

@Controller
@RequestMapping("/pages")
public class LoginController {
	@Autowired
	private UserService<User> userService;
	@RequestMapping("/login.do")
	public @ResponseBody Map<String, Object> login(@RequestParam("username") String username,
            @RequestParam("password") String password, ModelMap modelMap){
		System.out.println("登陆到controller中了！");
		System.out.println(username);
		System.out.println(password);
		 Map<String, Object> resultMap = new HashMap<String, Object>();
		 resultMap.put("message", "登录成功");
		return resultMap;
	}
}
