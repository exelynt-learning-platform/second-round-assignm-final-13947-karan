package in.e_comr.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.e_comr.model.order;

public interface order_repo extends JpaRepository<order, Long> {
	
	
}
