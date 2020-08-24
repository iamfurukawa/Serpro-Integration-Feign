package br.com.serproIntegration.serproservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.serproIntegration.serproservice.model.Auth;

@FeignClient(name = "serpro", url = "https://hom-siscomex-sapi.estaleiro.serpro.gov.br/")
public interface SerproFeign {

	@PostMapping(path = "/authenticate")
	Auth authenticate();
}
