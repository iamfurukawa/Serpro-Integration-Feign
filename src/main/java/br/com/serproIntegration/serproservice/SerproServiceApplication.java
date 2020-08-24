package br.com.serproIntegration.serproservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import br.com.serproIntegration.serproservice.feign.SerproFeign;
import br.com.serproIntegration.serproservice.model.Auth;
import lombok.extern.log4j.Log4j2;

@SpringBootApplication
@EnableFeignClients
@Log4j2
public class SerproServiceApplication implements CommandLineRunner{
	
	@Autowired
	private SerproFeign serproFeign;

	public static void main(String[] args) {
		SpringApplication.run(SerproServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Auth auth = serproFeign.authenticate();
		log.info(auth.toString());
	}

}
