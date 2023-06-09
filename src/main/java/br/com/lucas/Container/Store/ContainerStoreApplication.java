package br.com.lucas.Container.Store;

import br.com.lucas.Container.Store.Content.ScrapConfiguration;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

@SpringBootApplication (exclude = {SecurityAutoConfiguration.class, ManagementWebSecurityAutoConfiguration.class})
//@ComponentScan({"br.com.lucas.Container.Store"})
public class ContainerStoreApplication {
	@Bean
	public ModelMapper modelMapper(){
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setSkipNullEnabled(true);
		return modelMapper;
	}

	public static void main(String[] args) {
		SpringApplication.run(ContainerStoreApplication.class, args);

		ScrapConfiguration scrapConfiguration = new ScrapConfiguration();

		//scrapConfiguration.scrapingGenerate("azuki");

	}



}
