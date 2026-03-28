package in.e_comr.cntlr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.e_comr.model.cart.Cart;
import in.e_comr.repo.cart_repo;


public class cart_cntlr {
	@RestController
	@RequestMapping
	public class CartController {

	    @Autowired
	    private cart_repo repo;

	    @PostMapping("/cart")
	    public Cart addToCart(@RequestBody Cart cart){
	        return repo.save(cart);
	    }

	    @GetMapping("/cart")
	    public List<Cart> getCart(){
	        return repo.findAll();
	    }
	}

}
