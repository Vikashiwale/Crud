package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.main.model.Student;
import com.cjc.main.service.HomeService;

@Controller
public class HomeController {

	@Autowired
	HomeService hs;
	
	
	@RequestMapping("/")
	public String preLogin()
	{
		return "login";
	}
	
	@RequestMapping("/reg")
	public String registerpage()
	{
		return "register";
	}
	@RequestMapping("/register")
	public String registerData(@ModelAttribute Student s)
	{
                  Student st=		 hs.saveData(s);
                  if(st!=null)
                  {
                	  return "login";        	  
                  }
                  else {
                	  return "register";
                  }
		 

                  
	}
	@RequestMapping("/log")
	public String loginUser(@RequestParam("uname") String un,@RequestParam("pass") String ps,Model m)
	{
	     Student st	=hs.loginCheck(un,ps);
	           
	        Iterable<Student>  ls   =  hs.ShowData();
	                 
	     if(st!=null)
	     {
	    	 m.addAttribute("data", ls);
		return "success";
	     }else {
	    	 return "login";
	     }
	}
	@RequestMapping("/edit")
	public String editpage(@ModelAttribute Student s, Model m)
	{
		if(s.getSid()>0)
		{
			
		      Student st=	hs.editData(s.getSid());
			
		      m.addAttribute("data", st);
		      
		      
			return "edit";	
			
		}
		else
		{
			return "success";
		}
		
	}
	
	@RequestMapping("/updatestud")
	public String updataUser(@ModelAttribute Student s,Model m)
	{
		        Student st     =      hs.saveData(s);
		       Iterable<Student>   ls=hs.ShowData();
		           if(st!=null)
		           {
		        	   m.addAttribute("data", ls);
		        	   return "success";
		           }else
		           {		
		
	                   	return "edit";
		           }
	}
}
























