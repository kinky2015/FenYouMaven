package com.fenyou.core.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fenyou.core.vo.NodeVo;

import net.sf.json.JSONArray;

@Controller
public class HomeController {
	@RequestMapping(value="/loadTree.do",method = RequestMethod.POST)
	public @ResponseBody String initTree(){
//		NodeVo node = new NodeVo("1","节点1");
//		NodeVo childNodeVo = new NodeVo("1","节点2");
//		node.addChild(childNodeVo);
		List<Map<String,Object>> items = new ArrayList<Map<String,Object>>();  
		for (int i = 0; i < 10; i++) {
			Map<String,Object>  item = new HashMap<String,Object>();  
			item.put("id", i+1);  
			item.put("text", "主节点"+i);  
			item.put("state", "open");  
			items.add(item);  
		}
		JSONArray jsarray = JSONArray.fromObject(items);
		return jsarray.toString();
	}
}
