package com.maltese.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.maltese.accounts.controller") })
@EnableJpaRepositories("com.maltese.accounts.repository")
@EntityScan("com.maltese.accounts.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
	info = @Info(
			title = "Accounts microservices REST API Documentation",
			description = "Maltese Accounts microservice REST API Documentation",
			version = "v1",
			contact = @Contact(
					name = "Jason Xie",
					email = "xjason0312@gmail.com",
					url = "https://www.linkedin.com/in/jasonxie0312/"
			),
			license = @License(
					name = "Apache 2.0",
					url = ""
			)
	),
		externalDocs = @ExternalDocumentation(
				description = "Maltese Accounts microservice REST API Documentation",
				url = ""
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
