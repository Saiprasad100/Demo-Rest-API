package in.sai;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {

	@PostMapping("/product")
	public String saveProduct(@RequestBody Product p) {
		System.out.println(p);
		System.out.println("Product Saved...");//For Console Printing 
		return "Product Saved....";

	}

	@GetMapping("/product/{id}")
	public Product getProduct(@PathVariable Integer id) {
		Product p = null;
		if (id == 101) {
			p = new Product(101, "Mouse", 500.00);
		} else if (id == 102) {
			p = new Product(102, "HD", 3500.00);
		}
		return p;

	}

	@GetMapping("/products")
	public List<Product> getProducts() {
		Product p1 = new Product(101, "Mouse", 500.00);
		Product p2 = new Product(102, "HD", 3500.00);
		List<Product> products = Arrays.asList(p1, p2);

		return products;
	}

}
