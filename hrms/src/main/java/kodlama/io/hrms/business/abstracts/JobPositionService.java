package kodlama.io.hrms.business.abstracts;

import java.util.List;

import kodlama.io.hrms.entites.concretes.JobPosition;

public interface JobPositionService {
	
	List<JobPosition> getAll();
}
