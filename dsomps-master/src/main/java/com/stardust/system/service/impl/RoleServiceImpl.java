package com.stardust.system.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.stardust.common.service.impl.BaseService;
import com.stardust.system.dao.RoleMapper;
import com.stardust.system.dao.RoleMenuMapper;
import com.stardust.system.domain.Role;
import com.stardust.system.domain.RoleMenu;
import com.stardust.system.domain.RoleWithMenu;
import com.stardust.system.service.RoleMenuServie;
import com.stardust.system.service.RoleService;
import com.stardust.system.service.UserRoleService;
import tk.mybatis.mapper.entity.Example;

@Service("roleService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class RoleServiceImpl extends BaseService<Role> implements RoleService {

	@Autowired
	private RoleMapper roleMapper;

	@Autowired
	private RoleMenuMapper roleMenuMapper;

	@Autowired
	private UserRoleService userRoleService;

	@Autowired
	private RoleMenuServie roleMenuService;

	@Override
	public List<Role> findUserRole(String userName) {
		return this.roleMapper.findUserRole(userName);
	}

	@Override
	public List<Role> findAllRole(Role role) {
		try {
			Example example = new Example(Role.class);
			if (StringUtils.isNotBlank(role.getRoleName())) {
				example.createCriteria().andCondition("role_name=", role.getRoleName());
			}
			example.setOrderByClause("create_time");
			return this.selectByExample(example);
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<>();
		}
	}

	@Override
	public Role findByName(String roleName) {
		Example example = new Example(Role.class);
		example.createCriteria().andCondition("lower(role_name)=", roleName.toLowerCase());
		List<Role> list = this.selectByExample(example);
		return list.size() == 0 ? null : list.get(0);
	}

	@Override
	@Transactional
	public void addRole(Role role, Long[] menuIds) {
		role.setCreateTime(new Date());
		this.save(role);
		setRoleMenus(role, menuIds);
	}

	private void setRoleMenus(Role role, Long[] menuIds) {
		Arrays.stream(menuIds).forEach(menuId -> {
			RoleMenu rm = new RoleMenu();
			rm.setMenuId(menuId);
			rm.setRoleId(role.getRoleId());
			this.roleMenuMapper.insert(rm);
		});
	}

	@Override
	@Transactional
	public void deleteRoles(String roleIds) {
		List<String> list = Arrays.asList(roleIds.split(","));
		this.batchDelete(list, "roleId", Role.class);

		this.roleMenuService.deleteRoleMenusByRoleId(roleIds);
		this.userRoleService.deleteUserRolesByRoleId(roleIds);

	}

	@Override
	public RoleWithMenu findRoleWithMenus(Long roleId) {
		List<RoleWithMenu> list = this.roleMapper.findById(roleId);
		List<Long> menuList = new ArrayList<>();
		for (RoleWithMenu rwm : list) {
			menuList.add(rwm.getMenuId());
		}
		if (list.size() == 0) {
			return null;
		}
		RoleWithMenu roleWithMenu = list.get(0);
		roleWithMenu.setMenuIds(menuList);
		return roleWithMenu;
	}

	@Override
	@Transactional
	public void updateRole(Role role, Long[] menuIds) {
		role.setModifyTime(new Date());
		this.updateNotNull(role);
		Example example = new Example(RoleMenu.class);
		example.createCriteria().andCondition("role_id=", role.getRoleId());
		this.roleMenuMapper.deleteByExample(example);
		setRoleMenus(role, menuIds);
	}

}
