package io.github.toquery.example.mult.svc.transaction;

import io.github.toquery.example.mult.svc.transaction.svc.UserSvc;
import io.github.toquery.example.mult.svc.transaction.svc.impl.AUserSvcImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExampleSpringMultipleSvcImplTransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleSpringMultipleSvcImplTransactionApplication.class, args);
	}


	@Bean
	public UserSvc userSvc() {
		return new AUserSvcImpl();
	}

//	@Bean
//	public UserSvc userSvc() {
//		return new DgdUserSvcImpl();
//	}
}
