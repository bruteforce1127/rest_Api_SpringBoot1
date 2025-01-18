package com.kucp1127.rest.Repository;

import com.kucp1127.rest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepo extends JpaRepository<JobPost , Integer> {

}
