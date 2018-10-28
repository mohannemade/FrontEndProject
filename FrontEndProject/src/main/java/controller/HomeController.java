package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String homePage()
	{
		return "home";
	}
	
	@RequestMapping(value="/error")
	public String error()
	{
		return "login";
	}
	
	@RequestMapping(value="/login")
	public String login()
	{
		return "login";
	}
	
	@RequestMapping(value="/logout")
	public String logout()
	{
		return "logout";
	}
	
	
}
