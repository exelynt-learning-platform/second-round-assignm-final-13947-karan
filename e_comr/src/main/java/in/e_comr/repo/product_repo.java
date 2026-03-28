package in.e_comr.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.e_comr.model.product.Product;

public interface product_repo  extends JpaRepository<Product, Long> {}


