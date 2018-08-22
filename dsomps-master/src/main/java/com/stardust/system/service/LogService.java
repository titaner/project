package com.stardust.system.service;

import java.util.List;

import com.stardust.common.service.IService;
import com.stardust.system.domain.SysLog;

public interface LogService extends IService<SysLog> {
	
	List<SysLog> findAllLogs(SysLog log);
	
	void deleteLogs(String logIds);
}
