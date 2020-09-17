package com.qhawax.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController
{
	@RequestMapping("/home")
	public ModelAndView home(Alien alien)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", name);
		mv.setViewName("home");
		return mv;
	}
//	@RequestMapping("/home")
//	public ModelAndView home(@RequestParam("myName") String name)
//	{
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("name", name);
//		mv.setViewName("home");
//		return mv;
//	}
//	@ResponseBody              // To write into the browser
//	public String home()
//	public String home(HttpServletRequest request)
//	public String home(HttpServletRequest request, HttpServletResponse reponse)
//	public String home(String name, HttpSession session)
//	public String home(@RequestParam("myName") String name, HttpSession session)
//	{
//		ModelAndView mv = new ModelAndView(;)
////		HttpSession session = request.getSession();
////		@SuppressWarnings("unused")
////		String name = request.getParameter("name");
//		session.setAttribute("name", name);
//		System.out.println("Hello abc");
//		return "home";
//	}
	
//	@RequestMapping("error")
//	public void errorxyz()
//	{
//		System.out.println("error");
//	}
}




