package the.mall.order.service.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import the.mall.order.service.api.models.OrderDTO;

/**
 * 提供给payment使用的接口
 */
@RestController
@RequestMapping("/order-for-pay")
public class OrderForPayController {

	@PostMapping("order-dto-of")
	public OrderDTO orderDtoOf(String orderNo) {
		OrderDTO order = new OrderDTO();
		order.setOrderNo(orderNo);
		order.setAmount("188.00");

		return order;
	}

}
