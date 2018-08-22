package com.stardust.system.service;

import com.stardust.common.service.IService;
import com.stardust.system.domain.UserRole;

public interface UserRoleService extends IService<UserRole> {

	void deleteUserRolesByRoleId(String roleIds);

	void deleteUserRolesByUserId(String userIds);
}
