package in.ecom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ecom.model.Cart;
import in.ecom.model.CartItem;
import in.ecom.model.Product;
import in.ecom.model.User;
import in.ecom.repository.CartRepository;
import in.ecom.repository.ProductRepository;

@Service
public class CartService {
	@Autowired CartRepository cartRepo;
    @Autowired ProductRepository productRepo;

    public Cart add(User user, Long productId, int qty) {

        Cart cart = cartRepo.findByUser(user)
                .orElse(new Cart());

        cart.setUser(user);

        Product product = productRepo.findById(productId).orElseThrow();

        CartItem item = new CartItem();
        item.setProduct(product);
        item.setQuantity(qty);

        cart.getItems().add(item);

        return cartRepo.save(cart);
    }
}
