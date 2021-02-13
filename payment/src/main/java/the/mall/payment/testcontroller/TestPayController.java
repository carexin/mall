package the.mall.payment.testcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("payment/test")
public class TestPayController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("get")
	public OrderDTO get() {

		restTemplate.postForEntity("", null, null);
		return null;
	}
}
