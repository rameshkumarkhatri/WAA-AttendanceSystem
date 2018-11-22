package edu.mum.waa.tmattendanceservice.config;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

@Component
public class UserAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		boolean hasStudentRole = false;
		boolean hasFacultyRole = false;
		boolean hasAdminRole = false;

		Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
		for (GrantedAuthority grantedAuthority : authorities) {
			System.out.println("User: "+authentication.getName()+" Authority: "+grantedAuthority.getAuthority());
			if (grantedAuthority.getAuthority().equals("STUDENT")) {
				hasStudentRole = true;
				break;
			} else if (grantedAuthority.getAuthority().equals("FACULTY")) {
				hasFacultyRole = true;
				break;
			} else {
				hasAdminRole = true;
				break;
			}
		}
		
		if(hasStudentRole) {
			redirectStrategy.sendRedirect(request, response, "/welcome-student");
		}else if(hasFacultyRole) {
			redirectStrategy.sendRedirect(request, response, "/welcome-faculty");
		}else if(hasAdminRole){
			redirectStrategy.sendRedirect(request, response, "/welcome-admin");
		}else {
			throw new IllegalStateException();
		}

	}

}
