package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.MasterDepartmentTbl;
import com.example.demo.service.MasterDepartmentTblService;

@RestController
public class MasterDepartmentTblController {
	
	@Autowired
	MasterDepartmentTblService mdtser;
	
	
	@PostMapping(value = "/sand")
	public MasterDepartmentTbl postmaster( @RequestParam ("file") MultipartFile file,@RequestParam("departmentCode") String  departmentCode,@RequestParam("departmentDesc") String departmentDesc,@RequestParam("hod") long hod,
			@RequestParam("isBedAvaliable") int isBedAvaliable, @RequestParam("flag") String flag,@RequestParam("updatedBy") String updatedBy
			,@RequestParam("sapFlag") Character sapFlag ,@RequestParam("deptStatus") Character deptStatus,
			@RequestParam("updateFlag")Character updateFlag) {
			return mdtser.postmaster(file, departmentCode,departmentDesc,hod,isBedAvaliable,flag,updatedBy,sapFlag
					,deptStatus,updateFlag);
		
	}
	
	@GetMapping("/getmaster")
	public List<MasterDepartmentTbl> getmaster(){
		return mdtser.getmaster();
	}
	

}
