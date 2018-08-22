package com.stardust.job.service;

import java.util.List;

import com.stardust.common.service.IService;
import com.stardust.job.domain.JobLog;

public interface JobLogService extends IService<JobLog>{

	List<JobLog> findAllJobLogs(JobLog jobLog);

	void saveJobLog(JobLog log);
	
	void deleteBatch(String jobLogIds);
}
