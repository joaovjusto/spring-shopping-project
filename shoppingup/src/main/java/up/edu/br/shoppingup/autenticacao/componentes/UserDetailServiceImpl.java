package up.edu.br.shoppingup.autenticacao.componentes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UserDetailServiceImpl implements UserDetailsService {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public UserDetailServiceImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException, DataAccessException {		
		try {
			
			return getCustomUser(userName);
			
		} catch (Exception ex) {
			throw new UsernameNotFoundException(userName);
		}
		
	}	

	private CustomUser getCustomUser(String userName) {
		
		BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
        
		CustomUser customUser = new CustomUser("abc", bCryptEncoder.encode("abc"), true, true, true, true, new ArrayList<GrantedAuthority>());
		
		return customUser;
		
	}

	

	private List<GrantedAuthority> getUserRoles(CustomUser user) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();		

		return authorities;
	}
}