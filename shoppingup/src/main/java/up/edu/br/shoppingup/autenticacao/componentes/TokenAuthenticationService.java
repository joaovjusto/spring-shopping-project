package up.edu.br.shoppingup.autenticacao.componentes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class TokenAuthenticationService {

	// EXPIRATION_TIME = 100 anos
	static final long EXPIRATION_TIME = (60 * 1000);
	static final String SECRET = "ShoppingUp";
	static final String TOKEN_PREFIX = "Bearer";
	static final String HEADER_STRING = "Authorization";
	
	public static String getToken(HttpServletResponse response, String username) {
			
		String token = Jwts.builder()
				.setSubject(username)
				.setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
				.signWith(SignatureAlgorithm.HS512, SECRET)
				.compact();		
		
		return token;
	}

	@SuppressWarnings("unchecked")
	public static Authentication getAuthentication(HttpServletRequest request) {
		String token = request.getHeader(HEADER_STRING);

		if (token != null) {

			// faz parse do token
			Claims claims = null;

			try {

				claims = Jwts.parser().setSigningKey(SECRET).parseClaimsJws(token.replace(TOKEN_PREFIX, "")).getBody();

			} catch (ExpiredJwtException e) {
				claims = e.getClaims();
			}

			if (claims != null) {

				if (claims.getSubject() != null) {
					ArrayList<String> authsList = (ArrayList<String>) claims.get("ROLES");

					List<GrantedAuthority> authorities = new ArrayList<>(authsList.size());

					for (String role : authsList) {
						authorities.add(new SimpleGrantedAuthority("ROLE_" + role));
					}

					return new UsernamePasswordAuthenticationToken(claims.getSubject(), authorities, authorities);
				}

			}
		}
		return null;
	}

}
