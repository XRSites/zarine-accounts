package br.com.xrsites.zarineaccounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import br.com.xrsites.zarineaccounts.config.AppProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class ZarineAccountsApp {

	public static void main(String[] args) {
		SpringApplication.run(ZarineAccountsApp.class, args);
	}

}
