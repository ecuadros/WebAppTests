package com.qhawax.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien
{
	@Id 	 	 	
	private Integer aid;
	private String aname;
	private String tech;
	
	public Integer getAid()
	{
		return aid;
	}
	public void setAid(Integer aid)
	{
		this.aid = aid;
	}
	public String getAname()
	{
		return aname;
	}
	public void setAname(String aname)
	{
		this.aname = aname;
	}
	
	public String getTech()
	{
		return tech;
	}
	public void setTech(String tech)
	{
		this.tech = tech;
	}
	@Override
	public String toString()
	{
		return "\nAlien [aid=" + aid + ", aname=" + aname + ", tech=" + tech + "]";
	}
	
	
}
