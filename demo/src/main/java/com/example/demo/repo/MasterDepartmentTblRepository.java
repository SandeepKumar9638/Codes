package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.MasterDepartmentTbl;
@Repository
public interface MasterDepartmentTblRepository extends JpaRepository<MasterDepartmentTbl,Long> {

}
