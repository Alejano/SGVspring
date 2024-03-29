package com.SGV.PGJ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
		
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Autowired
	public void configurerGlobal(AuthenticationManagerBuilder builder) throws Exception {
		
		PasswordEncoder encoder = passwordEncoder();
		UserBuilder users = User.builder().passwordEncoder(encoder::encode);
		
		builder.inMemoryAuthentication()
		.withUser(users.username("admin").password("123").roles("ADMIN","USER"))
		.withUser(users.username("1").password("123").roles("USER"));		
				
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
	
		http.authorizeRequests().antMatchers("/CSS/**", "/js/**", "/images/**" ).permitAll()
		.antMatchers("/Usuarios").hasAnyRole("ADMIN")
		.antMatchers("/home").hasAnyRole("ADMIN","USER")
		.anyRequest().authenticated()
		.and()
		.formLogin().loginPage("/login")
		.permitAll()
		.and()
		.logout().permitAll();
		
	}
	
	
	
	
	
		
}































