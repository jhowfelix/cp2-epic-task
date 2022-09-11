package br.com.fiap.epictaskapi.config.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

	// @Bean
	// public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	// 	http.httpBasic().and().authorizeHttpRequests().antMatchers(HttpMethod.GET, "/api/task/**").permitAll()
	// 			.antMatchers(HttpMethod.POST, "/api/task/**").authenticated().anyRequest().denyAll().and().csrf()
	// 			.disable();
	// 	return http.build();
	// }

	@Bean
	 public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
			http.httpBasic()
			.and()
			.authorizeHttpRequests()
				.antMatchers(HttpMethod.GET, "/api/user/**").permitAll()
				.antMatchers(HttpMethod.DELETE, "/api/user/**").authenticated()
				.antMatchers(HttpMethod.POST, "/api/user/**").permitAll()
				.antMatchers(HttpMethod.PUT, "/api/user/**").authenticated()
				.antMatchers(HttpMethod.GET, "/api/integrantes").permitAll()
				.anyRequest().denyAll()
			.and()
			.csrf().disable();
		return http.build();
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
