package com.fenyou.core.controller;

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
		NodeVo node = new NodeVo("1","节点1");
		NodeVo childNodeVo = new NodeVo("2","节点2");
		node.addChild(childNodeVo);
		JSONArray result = JSONArray.fromObject(node);
		return result.toString();
	}
}
