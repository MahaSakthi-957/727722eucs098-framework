package com.example.ce2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ce2.model.Job;

@Repository
public interface JobRepo extends JpaRepository<Job, Integer> {
    
}
