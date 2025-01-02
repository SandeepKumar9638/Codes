package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.AudioFile;

@Repository
public interface AudioFileRepository extends JpaRepository<AudioFile, Long>{

}
