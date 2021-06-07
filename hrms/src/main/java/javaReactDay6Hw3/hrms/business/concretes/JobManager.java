package javaReactDay6Hw3.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaReactDay6Hw3.hrms.business.absratcs.JobService;
import javaReactDay6Hw3.hrms.dataAccess.abstracts.JobDao;
import javaReactDay6Hw3.hrms.entities.concretes.Job;

@Service
public class JobManager implements JobService {
	
	private JobDao jobDao;
	
	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}
	@Override
	public List<Job> getAll() {
		// TODO Auto-generated method stub
		return jobDao.findAll();
	}

}
