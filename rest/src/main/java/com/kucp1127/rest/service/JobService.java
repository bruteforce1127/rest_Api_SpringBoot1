package com.kucp1127.rest.service;


import com.kucp1127.rest.Repository.JobRepo;
import com.kucp1127.rest.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {
    @Autowired
    private JobRepo jobRepository;
    public JobRepo getJobRepository() {
        return jobRepository;
    }

    public void setJobRepository(JobRepo jobRepository) {
        this.jobRepository = jobRepository;
    }

    public void addJob(JobPost job){
        jobRepository.save(job);
    }
    public List<JobPost> getAllJob(){
        return jobRepository.findAll();
    }

    public Optional<JobPost> getAJob(int postId){
        return jobRepository.findById(postId);
    }

    public void updateJob(JobPost jobPost) {
        jobRepository.save(jobPost);
    }

    public void deleteJob(JobPost jobPost) {
        jobRepository.delete(jobPost);
    }
}
