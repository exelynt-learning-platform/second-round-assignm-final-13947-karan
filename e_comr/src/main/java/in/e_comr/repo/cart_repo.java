package in.e_comr.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.e_comr.model.cart.Cart;

public interface cart_repo  extends JpaRepository<Cart, Long> {}

