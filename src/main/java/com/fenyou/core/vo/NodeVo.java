package com.fenyou.core.vo;

import java.io.Serializable;
import java.util.List;

public class NodeVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1741572848217111084L;
	private String id;
	private String text;
	private String state;
	private List<NodeVo> children;
	
	public NodeVo(String id, String text, String state, List<NodeVo> children) {
		super();
		this.id = id;
		this.text = text;
		this.state = state;
		this.children = children;
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
}
