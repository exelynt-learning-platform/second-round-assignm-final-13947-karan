package in.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ecom.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
