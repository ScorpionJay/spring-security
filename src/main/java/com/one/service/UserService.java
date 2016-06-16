package com.one.service;

import java.util.Set;

import com.one.main.domain.User;
import com.one.vo.UserVo;

/**
 * @author jay
 * @since 2016年6月8日
 */
public interface UserService {

	
	/**
	 * 新增用户
	 * @param user
	 */
	void addUser(UserVo userVo);
	
	/**
	 * 根据用户名查找用户
	 * @param userName
	 * @return
	 */
	User getByUsername(String username);
	
	/**
	 * 查找所有用户
	 * @return
	 */
	Set<UserVo> findAllUsers();
	
}
