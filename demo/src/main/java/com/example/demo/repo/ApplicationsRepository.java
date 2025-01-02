package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Applications;
@Repository
public interface ApplicationsRepository extends JpaRepository<Applications, Long> {

	Applications findById(long id);
}
