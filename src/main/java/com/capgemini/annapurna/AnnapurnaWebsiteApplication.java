package com.capgemini.annapurna;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableOAuth2Sso
public class AnnapurnaWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnnapurnaWebsiteApplication.class, args);
	}

	/*
	 * protected void configure(HttpSecurity http) throws Exception {
	 * http.csrf().disable().antMatcher("/**").authorizeRequests().antMatchers(
	 * "/**", "/login**").permitAll()
	 * .anyRequest().authenticated().and().logout().logoutSuccessUrl("/").
	 * clearAuthentication(true) .permitAll(); }
	 * 
	 * @RequestMapping("/user") public Principal user(Principal principal) {
	 * 
	 * return principal; }
	 */

	@Bean
	@LoadBalanced
	public RestTemplate passData() {
		return new RestTemplate();
	}

}
