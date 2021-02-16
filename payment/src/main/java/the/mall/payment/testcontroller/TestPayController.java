package the.mall.payment.testcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("payment/test")
public class TestPayController {

	private static final String orderUrl = "http://localhost:7001/order-for-pay/order-dto-of?orderNo=123123";

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("get")
	public OrderDTO get() {

		OrderDTO orderDTO = restTemplate.postForEntity(orderUrl, "no1112", OrderDTO.class).getBody();
		return orderDTO;
	}
}
