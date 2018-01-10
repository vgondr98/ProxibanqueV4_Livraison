package fr.proxibanque.proxibanquev4.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="fr.proxibanque.proxibanquev4.dao")
@EntityScan(basePackages= "fr.proxibanque.proxibanquev4.domaine")
@ComponentScan( basePackages="fr.proxibanque.proxibanquev4.ws.service" )
@SpringBootApplication(scanBasePackages = "fr.proxibanque.proxibanquev4")
public class SpringBootWebApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootWebApplication.class, args);
	}

}