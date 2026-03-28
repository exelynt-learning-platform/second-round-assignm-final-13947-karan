package in.e_comr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.e_comr.model.product.Product;
import in.e_comr.repo.product_repo;


public class productservice {
	

	@Service
	public class ProductService {

	    @Autowired
	    private product_repo repo;

	    public Product addProduct(Product p){
	        if(p.getPrice() <= 0){
	            throw new RuntimeException("Invalid price");
	        }
	        return repo.save(p);
	    }

	    public List<Product> getAllProducts(){
	        return repo.findAll();
	    }

	    public Product updateProduct(Long id, Product p){
	        p.setId(id);
	        return repo.save(p);
	    }

	    public void deleteProduct(Long id){
	        repo.deleteById(id);
	    }
	}

}
