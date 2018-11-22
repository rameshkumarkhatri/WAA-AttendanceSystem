package edu.mum.waa.tmattendanceservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//	@Autowired
//	BCryptPasswordEncoder encoder;
//	@Bean
//	public static BCryptPasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//
	@Autowired
	UserAuthenticationSuccessHandler successHandler;
//
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("samuel").password(encoder.encode("paulos")).roles("STUDENT").and()
//				.withUser("elaine").password(encoder.encode("elaine")).roles("FACULTY").and().withUser("john")
//				.password(encoder.encode("john")).roles("ADMIN");
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests().antMatchers("/**").hasAnyRole("STUDENT", "FACULTY", "ADMIN").anyRequest()
//				.authenticated().and().formLogin().loginPage("/login").successHandler(successHandler).permitAll();
//		// .successForwardUrl("/home").permitAll();
//		// http.csrf().disable();
//	}
//

	@Autowired
	private UserDetailsService userDetailsService;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/").permitAll().antMatchers("/**")
				.hasAnyAuthority("ADMIN", "STUDENT", "FACULTY").anyRequest().fullyAuthenticated().and().formLogin()
				.loginPage("/login").successHandler(successHandler).permitAll();
		// .and().logout().logoutUrl("/logout").deleteCookies("remember-me").logoutSuccessUrl("/login")
		// .permitAll().and().rememberMe();
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService);
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/resources/**", "/static/**", "/home/**",  "/css/**", "/js/**", "/img/**", "/vendor/**",
				"/device-mockups/**");
	}

}
