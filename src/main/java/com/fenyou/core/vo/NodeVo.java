package com.fenyou.core.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NodeVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1741572848217111084L;
	private String id;
	private String text;
	private String state = "open";
	private boolean checked;
	private Map<String,Object> attributes;
	private List<NodeVo> children;
	
	public NodeVo(String id,String text){
		this.id=id;
		this.text=text;
		attributes = new HashMap<String, Object>();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public List<NodeVo> getChildren() {
		return children;
	}
	public void setChildren(List<NodeVo> children) {
		this.children = children;
	}
	public boolean isChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	public Map<String, Object> getAttributes() {
		return attributes;
	}
	public void setAttributes(Map<String, Object> attributes) {
		this.attributes = attributes;
	}
	public void addChild(NodeVo nodeVo) {
		if (children == null) {
			children = new ArrayList<NodeVo>();
		}
		children.add(nodeVo);
	}
	@Override
	public String toString() {
		
		return "NodeVo [id=" + id + ", text=" + text + ",state" + state + ", checked=" + checked+ ",  attributes=" + attributes + ",children=" + children + "]";
		
	}
}
