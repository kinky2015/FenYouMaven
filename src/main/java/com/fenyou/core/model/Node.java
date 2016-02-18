package com.fenyou.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="t_node")
public class Node extends BaseElement{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8716293343275936437L;
	@Column(name="NODETEXT",length=50)
	private String nodeText;
	@Column(name="URL",length=50)
	private String url;
	
	public String getNodeText() {
		return nodeText;
	}
	public void setNodeText(String nodeText) {
		this.nodeText = nodeText;
	}
	public String getUrl()
	{
		return url;
	}
	public void setUrl(String url)
	{
		this.url = url;
	}
}
