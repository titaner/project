package com.stardust.system.service;

import java.util.List;

import com.stardust.system.domain.UserOnline;

public interface SessionService {

	List<UserOnline> list();

	boolean forceLogout(String sessionId);
}
