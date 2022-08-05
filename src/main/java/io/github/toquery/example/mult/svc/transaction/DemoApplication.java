package io.github.toquery.example.mult.svc.transaction;

import io.github.toquery.example.mult.svc.transaction.svc.UserSvc;
import io.github.toquery.example.mult.svc.transaction.svc.impl.BtyUserSvcImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Bean
	public UserSvc userSvc() {
		return new BtyUserSvcImpl();
	}

//	@Bean
//	public UserSvc userSvc() {
//		return new DgdUserSvcImpl();
//	}
}
