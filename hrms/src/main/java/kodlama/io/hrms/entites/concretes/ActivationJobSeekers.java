package kodlama.io.hrms.entites.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="activation_job_seekers")
public class ActivationJobSeekers extends ActivationCode{

	@Column(name="job_seeker_id")
	private int jobSeekerId;
	
	public ActivationJobSeekers() {
		
	}

	public ActivationJobSeekers(int jobSeekerId) {
		super();
		this.jobSeekerId = jobSeekerId;
	}

	public int getJobSeekerId() {
		return jobSeekerId;
	}

	public void setJobSeekerId(int jobSeekerId) {
		this.jobSeekerId = jobSeekerId;
	}
	
	
}
