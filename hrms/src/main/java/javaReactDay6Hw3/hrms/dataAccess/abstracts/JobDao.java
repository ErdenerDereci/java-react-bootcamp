package javaReactDay6Hw3.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javaReactDay6Hw3.hrms.entities.concretes.Job;

public interface JobDao extends JpaRepository<Job,Integer>{

}
