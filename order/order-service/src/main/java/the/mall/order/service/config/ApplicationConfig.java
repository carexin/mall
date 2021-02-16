package the.mall.order.service.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationConfig {

	@Bean
	@LoadBalanced// 客户端负载均衡, todo 如何通过一个注解就让restTemplate扩展了功能?
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
