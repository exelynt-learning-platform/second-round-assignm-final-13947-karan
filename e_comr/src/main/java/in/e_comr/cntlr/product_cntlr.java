package in.e_comr.cntlr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.e_comr.model.product.Product;
import in.e_comr.repo.product_repo;

@RestController
@RequestMapping("/products")
public class product_cntlr {
	
	
	    @Autowired
	    private product_repo repo;

	    @PostMapping
	    public Product addProduct(@RequestBody Product p){
	        return repo.save(p);
	    }

	    @GetMapping
	    public List<Product> getAll(){
	        return repo.findAll();
	    }

	    @PutMapping("/{id}")
	    public Product update(@PathVariable Long id, @RequestBody Product p){
	        p.setId(id);
	        return repo.save(p);
	    }

	    @DeleteMapping("/{id}")
	    public void delete(@PathVariable Long id){
	        repo.deleteById(id);
	    }
	}


