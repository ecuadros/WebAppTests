package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype") // To create many objects, if not there is only one
public class Alien
{
	private int aid;
	private String aname;
	private String tech;
	@Autowired		    // Default it searched by class name
	@Qualifier("lap1")	// Now it searches by lap1
	private Laptop laptop;
	
	public Alien()
	{
		super();
		System.out.println("Object created ...");
	}
	public int getAid()
	{
		return aid;
	}
	public void setAid(int aid)
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
	public Laptop getLaptop()
	{
		return laptop;
	}
	public void setLaptop(Laptop laptop)
	{
		this.laptop = laptop;
	}
	public void show()
	{
		System.out.println("Hola");
		laptop.compile();
	}
}
