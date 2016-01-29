package com.fenyou.core.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="t_node")
public class Node implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8716293343275936437L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID",length=20)
	private long id;
	@Column(name="NODETEXT",length=50)
	private String nodeText;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNodeText() {
		return nodeText;
	}
	public void setNodeText(String nodeText) {
		this.nodeText = nodeText;
	}
}
