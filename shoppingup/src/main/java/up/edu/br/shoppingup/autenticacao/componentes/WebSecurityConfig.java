package up.edu.br.shoppingup.autenticacao.componentes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import up.edu.br.shoppingup.autenticacao.filter.JWTAuthenticationFilter;
import up.edu.br.shoppingup.autenticacao.filter.JWTLoginFilter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {	
	
	@Autowired
	UserDetailServiceImpl userDetailService;
	
	protected void configure(HttpSecurity httpSecurity, WebSecurity web) throws Exception {
		web
        .ignoring()
        .antMatchers("/h2/**");
		httpSecurity.authorizeRequests()
        .antMatchers("/h2/**").permitAll();
		httpSecurity.csrf().disable().authorizeRequests().antMatchers("/public/**").permitAll()
				.antMatchers(HttpMethod.POST, "/public/login").permitAll().anyRequest().authenticated().and()

				// filtra requisições de login
				.addFilterBefore(new JWTLoginFilter("/public/login", authenticationManager()),
						UsernamePasswordAuthenticationFilter.class)

				// filtra outras requisições para verificar a presença do JWT no header
				.addFilterBefore(new JWTAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {		
		auth.userDetailsService(userDetailService).passwordEncoder(passwordEncoder());
	}
	
	@Bean
    public PasswordEncoder passwordEncoder(){
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder;
    }
}
