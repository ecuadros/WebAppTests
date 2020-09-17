package com.qhawax.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
	@RequestMapping("/home")
//	@ResponseBody              // To write into the browser
	public String home(HttpServletRequest request)
	{
		String name = request.getParameter("name");
		System.out.println("Hello abc");
		return "home";
	}
	
//	@RequestMapping("error")
//	public void errorxyz()
//	{
//		System.out.println("error");
//	}
}




