package hu.mik.java2.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import hu.mik.java2.product.bean.Product;

@Controller
@RequestMapping("/products")
public class ProductController {
	
	@RequestMapping("/product")
	public String product(Model model) {
		Product p = new Product();
		p.setCategoryID(1);
		p.setProductName("adidas melegítő");
		p.setDescription("nem loppott olcsó ruha");
		p.setPrice(5000);
		p.setDiscount(50);
		model.addAttribute("product", p);
		return "product_list";
	}
	
}
