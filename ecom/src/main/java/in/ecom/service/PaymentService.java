package in.ecom.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import com.stripe.model.PaymentIntent;
@Service
public class PaymentService {
	public PaymentIntent createPaymentIntent(Double amount) {
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("amount", (long) (amount * 100));
            params.put("currency", "inr");

            return PaymentIntent.create(params);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
