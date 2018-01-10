package fr.gtm.proxibanque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
/*
@SpringBootApplication
public class ProxibanqueV4WebservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProxibanqueV4WebservicesApplication.class, args);
	}*/
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="fr.gtm.proxibanque.dao")
@EntityScan(basePackages="fr.gtm.proxibanque.domaine")
@SpringBootApplication(scanBasePackages = "fr.gtm.proxibanque")
public class ProxibanqueV4WebservicesApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ProxibanqueV4WebservicesApplication.class, args);
	}

}
