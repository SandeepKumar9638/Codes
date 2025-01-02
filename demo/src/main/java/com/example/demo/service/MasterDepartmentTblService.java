package com.example.demo.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.MasterDepartmentTbl;

public interface MasterDepartmentTblService {



	//MasterDepartmentTbl postmaster(MasterDepartmentTbl master, MultipartFile picture) throws Exception, IOException;

	List<MasterDepartmentTbl> getmaster();

	MasterDepartmentTbl postmaster(MultipartFile file,String  departmentCode, String departmentDesc,long hod,int isBedAvaliable,String flag
			,String updatedBy, Character sapFlag, Character deptStatus, Character updateFlag);

//	MasterDepartmentTbl postmaster(MultipartFile file, String flag, String departmentCode, String departmentDesc, long hod,
//			int isBedAvaliable, String updatedBy, Character updateFlag, Character sapFlag,
//			Character deptStatus) throws IllegalStateException, IOException;

	//MasterDepartmentTbl postmaster(MultipartFile file, String flag, String departmentCode, String departmentDesc,long hod)throws IllegalStateException, IOException;

	

	//MasterDepartmentTbl postmaster( MultipartFile file, String flag,String departmentCode, Character deptStatus, Character sapFlag, Character updateFlag, String departmentDesc, int isBedAvaliable, String updatedBy, long hod) throws IllegalStateException, IOException;

}
