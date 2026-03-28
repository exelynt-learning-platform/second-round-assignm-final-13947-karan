package in.e_comr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.e_comr.model.cart.Cart;
import in.e_comr.repo.cart_repo;


public class cartservice {
	@Service
	public class CartService {

	    @Autowired
	    private cart_repo repo;

	    public Cart addToCart(Cart cart){
	        return repo.save(cart);
	    }

	    public List<Cart> getCart(){
	        return repo.findAll();
	    }
	}
}
