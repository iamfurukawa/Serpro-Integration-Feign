package br.com.serproIntegration.serproservice;

import org.apache.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import feign.RequestInterceptor;
import feign.RequestTemplate;

@Component
public class HeaderInterceptor implements RequestInterceptor {

	@Override
	public void apply(RequestTemplate requestTemplate) {
		requestTemplate.header(HttpHeaders.AUTHORIZATION,
				"Basic NlhvWUlEUjIybWhrMWJlcV9kcVczMVR4NlhzYTpQSWk5YmdwVzJWczhUTkdLcFowTzZ4cHBGOEFh");
		requestTemplate.header("Role-Type", "IMPEXP");
		requestTemplate.header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
	}
}
