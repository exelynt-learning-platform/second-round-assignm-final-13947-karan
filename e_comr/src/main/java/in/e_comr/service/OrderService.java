package in.e_comr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.e_comr.model.order;
import in.e_comr.model.product.Product;
import in.e_comr.repo.order_repo;


@Service
public class OrderService {


    @Autowired
    private order_repo repo;

    public order createOrder(order order) {

        double total = 0;

        for (Product p : order.getProducts()) {
            total += p.getPrice();
        }

        order.setTotalPrice(total);
        order.setStatus("CREATED");

        return repo.save(order);
    }

    public List<order> getOrders() {
        return repo.findAll();
    }
}