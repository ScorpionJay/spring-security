package org.one.security;

import org.one.entity.User;
import org.springframework.security.core.authority.AuthorityUtils;

public class CustomUserDetailsFactory {

  public static CustomUserDetials create(User user) {
    return new CustomUserDetials(
      user.getId(),
      user.getUsername(),
      user.getPassword(),
      user.getEmail(),
      user.getLastPasswordReset(),
      AuthorityUtils.commaSeparatedStringToAuthorityList(user.getAuthorities())
    );
  }

}
