package com.stardust.system.dao;

import java.util.List;

import com.stardust.common.config.MyMapper;
import com.stardust.system.domain.User;
import com.stardust.system.domain.UserWithRole;

public interface UserMapper extends MyMapper<User> {

	List<User> findUserWithDept(User user);
	
	List<UserWithRole> findUserWithRole(Long userId);
	
	User findUserProfile(User user);
}