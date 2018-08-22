package com.stardust.system.dao;

import java.util.List;

import com.stardust.common.config.MyMapper;
import com.stardust.system.domain.Role;
import com.stardust.system.domain.RoleWithMenu;

public interface RoleMapper extends MyMapper<Role> {
	
	List<Role> findUserRole(String userName);
	
	List<RoleWithMenu> findById(Long roleId);
}