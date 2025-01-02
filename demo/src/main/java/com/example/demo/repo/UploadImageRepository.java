package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UploadImage;
@Repository
public interface UploadImageRepository extends JpaRepository<UploadImage, Integer> {

}
