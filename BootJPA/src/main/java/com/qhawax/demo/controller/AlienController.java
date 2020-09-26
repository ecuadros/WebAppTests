package com.qhawax.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.qhawax.demo.dao.AlienRepository;
import com.qhawax.demo.model.Alien;

@Controller
public class AlienController
{
	@Autowired
	AlienRepository aRepo;
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}

	@RequestMapping("/addAlien")
	public String addAlien(Alien alien)
	{
		aRepo.save(alien);
		return "home.jsp";
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aid)
	{
		ModelAndView mv = new ModelAndView("showAlien.jsp");
		Alien alien = aRepo.findById(aid).orElse(new Alien());
		System.out.println(aRepo.findByTech("Java"));
		System.out.println(aRepo.findByAidGreaterThan(aid));
		System.out.println(aRepo.findByAidGreaterThanEqual(aid));
		System.out.println(aRepo.findByAidLessThan(aid));
		System.out.println(aRepo.findByAidLessThanEqual(aid));
		System.out.println(aRepo.findByAidGreaterThanEqualAndTechGreaterThanEqualOrAnameContaining(aid, "Pascal", "Cuadros"));
		mv.addObject(alien);
		return mv;
	}
	@RequestMapping("/getFlexible")
	public ModelAndView getAlien(@RequestParam Integer aid, @RequestParam String field)
	{
		ModelAndView mv = new ModelAndView("showFlexible.jsp");
		
		Alien alien = aRepo.findById(aid).orElse(new Alien());
		mv.addObject(alien);
		mv.addObject("field", field);
		mv.addObject("content", "${alien."+field+"}");
		return mv;
	}
	
	@RequestMapping("/queryByField")
	public ModelAndView specificQuery(@RequestParam String field)
	{
		ModelAndView mv = new ModelAndView("showAlien.jsp");
		Alien alien = aRepo.findById(105).orElse(new Alien());
		System.out.println(aRepo.findAll(Sort.by(field).ascending()));
		mv.addObject(alien);
		return mv;
	}
	
	
	@RequestMapping("/deleteAlien")
	public void removeAlien(Alien alien)
	{
		// aRepo.delete(alien);
	}
	
//	@RequestMapping("/home")
//	public ModelAndView home(Alien alien)
//	{
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("name", name);
//		mv.setViewName("home");
//		return mv;
//	}
}
