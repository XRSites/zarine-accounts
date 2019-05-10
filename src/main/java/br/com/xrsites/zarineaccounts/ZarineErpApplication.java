package br.com.xrsites.zarineaccounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import br.com.xrsites.zarineaccounts.config.AppProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class ZarineErpApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZarineErpApplication.class, args);
	}

}