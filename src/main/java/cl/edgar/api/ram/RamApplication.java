package cl.edgar.api.ram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@EnableFeignClients
@SpringBootApplication
@EnableAspectJAutoProxy
@PropertySources({
		@PropertySource("classpath:rest.properties"),
		@PropertySource("classpath:security.properties")
})
public class RamApplication {

	public static void main(String[] args) {
		SpringApplication.run(RamApplication.class, args);
	}

}
