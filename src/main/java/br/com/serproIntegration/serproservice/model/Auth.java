package br.com.serproIntegration.serproservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Auth {
	private int expires_in;
	private String scope;
	private String token_type;
	private String access_token;
	private String jwt_token;
}
