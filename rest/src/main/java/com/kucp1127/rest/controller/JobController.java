package com.kucp1127.rest.controller;

import com.kucp1127.rest.model.JobPost;
import com.kucp1127.rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class JobController {
    @Autowired
    private JobService job;

    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs(){
        return job.getAllJob();
    }

    @GetMapping("jobPost/{postId}")
    public Optional<JobPost> getAJob(@PathVariable int postId){
        Optional<JobPost> j = job.getAJob(postId);
        return j;
    }

    @PostMapping("jobPosts")
    public void addJob(@RequestBody JobPost jobPost){
        job.addJob(jobPost);
    }

    @PutMapping("jobPosts")
    public void updateJob(@RequestBody JobPost jobPost){
        job.updateJob(jobPost);
    }
    @DeleteMapping("jobPosts")
    public void deleteJob(@RequestBody JobPost jobPost){
        job.deleteJob(jobPost);
    }
}
