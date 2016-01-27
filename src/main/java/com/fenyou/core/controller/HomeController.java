package com.fenyou.core.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fenyou.core.vo.NodeVo;

@Controller
public class HomeController {
	@RequestMapping(value="/loadTree.do",method = RequestMethod.POST)
	public @ResponseBody Map<String,Object> initTree(){
		Map<String, Object> resultMap = new HashMap<String, Object>();
		NodeVo node = new NodeVo();
		resultMap.put("node", node);
		return resultMap;
	}
}
