package org.one.security;

import org.springframework.security.core.authority.AuthorityUtils;

import com.one.mongo.entity.User;

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
