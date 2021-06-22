package br.com.transacao.matheusfernandes.security;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests().antMatchers(HttpMethod.GET, "/transacoes/**")
			.hasAuthority("SCOPE_transacoes:read")
			.anyRequest().authenticated()
			.and()
			.csrf().disable()
			.oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt);
	}
}
