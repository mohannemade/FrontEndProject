package controller;
import java.util.Collection;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Product;
import model.ProductDAO;
import model.Supplier;
import model.SupplierDAO;

@Controller
public class ProductController {

	@RequestMapping(value="/productpage",method=RequestMethod.GET)
	public String productsPage() {
		return "product";
	}
	
	@RequestMapping(value="/success", method=RequestMethod.POST)
	public String addProduct(@Valid @ModelAttribute("product1")Product p,@Valid @ModelAttribute("supplier")Supplier s,BindingResult result)
	{
		if(result.hasErrors())
		{
			return "product";
		}
		
		ProductDAO pd = new ProductDAO();
		//SupplierDAO sd = new SupplierDAO();
		p.setSupplier(s);
		
		boolean b = pd.insertProduct(p);
		//sd.updateSupplier(s);
		
		return "success";
	}
	
	@RequestMapping(value="/products", method=RequestMethod.GET)
	@ResponseBody
	public List<Product> listProducts(){
		
		List<Product> lp = null;
		try
		{
			ProductDAO pd = new ProductDAO();
			lp = pd.getProducts();
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return lp;		
	}
	
	@RequestMapping(value="/listview",method=RequestMethod.GET)
	public String listProductsView()
	{
		return "listproducts";
	}	
	
}














