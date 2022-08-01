package com.wesledev.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesledev.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
