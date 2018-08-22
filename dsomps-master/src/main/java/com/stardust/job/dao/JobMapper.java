package com.stardust.job.dao;

import java.util.List;

import com.stardust.common.config.MyMapper;
import com.stardust.job.domain.Job;

public interface JobMapper extends MyMapper<Job> {
	
	List<Job> queryList();
}