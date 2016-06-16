package org.one.security;



import org.one.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

  //@Autowired
 // private UserRepository userRepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    //User user = this.userRepository.findByUsername(username);

	  User user = new User();
	  user.setId("1");
	  user.setUsername("test");
	  user.setPassword("aaaa");
	  user.setEmail("test@test.com");
	  
    if (user == null) {
      throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
    } else {
      return CustomUserDetailsFactory.create(user);
    }
  }

}
