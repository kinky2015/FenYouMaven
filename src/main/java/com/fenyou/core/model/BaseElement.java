package com.fenyou.core.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="t_baseelement")
@Inheritance(strategy = InheritanceType.JOINED)
public class BaseElement implements Serializable
{

	/**
	 * <pre>
	 * 
	 * </pre>
	 */
	private static final long serialVersionUID = 4664272978979337364L;
	@Id
	@Column(name="FID",length=20)
	private long fid;
	@Column(name="FTEXT",length=50)
	private String ftext;
	public long getFid()
	{
		return fid;
	}
	public void setFid(long fid)
	{
		this.fid = fid;
	}
	public String getFtext()
	{
		return ftext;
	}
	public void setFtext(String ftext)
	{
		this.ftext = ftext;
	}
}
