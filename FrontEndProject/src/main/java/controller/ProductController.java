package controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Product;
import model.ProductDAO;

@Controller
public class ProductController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String productsPage() {
		return "product";
	}
	
	@RequestMapping(value="/success", method=RequestMethod.POST)
	public String productSuccess(@ModelAttribute("product1")Product p)
	{
		ProductDAO pd = new ProductDAO();
		pd.insertProduct(p);
		return "success";
	}
}
