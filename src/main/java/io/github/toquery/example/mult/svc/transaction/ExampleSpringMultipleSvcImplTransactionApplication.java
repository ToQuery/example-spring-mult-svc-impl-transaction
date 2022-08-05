package io.github.toquery.example.mult.svc.transaction;

import io.github.toquery.example.mult.svc.transaction.svc.UserSvc;
import io.github.toquery.example.mult.svc.transaction.svc.impl.AUserSvcImpl;
import io.github.toquery.example.mult.svc.transaction.svc.impl.BUserSvcImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class ExampleSpringMultipleSvcImplTransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleSpringMultipleSvcImplTransactionApplication.class, args);
	}


//	@Bean
//	public UserSvc userSvc() {
//		return new AUserSvcImpl();
//	}

	@Bean
	public UserSvc userSvc() {
		return new BUserSvcImpl();
	}
}
