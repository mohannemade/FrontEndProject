package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Product;
import model.Supplier;
import model.SupplierDAO;

@Controller
public class SupplierController {

	
	@RequestMapping(value="/supplier",method=RequestMethod.GET)
	public String supplierPage()
	{
		return "supplier";
	}
	
	@RequestMapping(value="/addsupplier", method=RequestMethod.POST)
	public String addSupplier(@ModelAttribute("supplier1")Supplier s)
	{
		SupplierDAO sd = new SupplierDAO();
		sd.insertSupplier(s);
		return "success";
	}
	
	@RequestMapping(value="/addsupplierpage", method=RequestMethod.GET)
	public String getAddSupplier()
	{
		return "addsupplier";
	}
	
}
