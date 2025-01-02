package com.example.demo.ServiceImmplements;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.MasterDepartmentTbl;
import com.example.demo.repo.MasterDepartmentTblRepository;
import com.example.demo.service.MasterDepartmentTblService;

@Service
public class MasterDepartmentTblServiceimpl implements MasterDepartmentTblService {
	
	@Autowired
	MasterDepartmentTblRepository mdtrepo;

	
	@Override
	public List<MasterDepartmentTbl> getmaster() {
		//List<MasterDepartmentTbl> mlist = new ArrayList<MasterDepartmentTbl>();
		return mdtrepo.findAll();
		}
	@Override
	public MasterDepartmentTbl postmaster(MultipartFile file,String  departmentCode, String departmentDesc,long hod
			, int isBedAvaliable,String flag,String updatedBy,Character sapFlag,Character deptStatus, Character updateFlag) {
				try {
			
				 String fileName = file.getOriginalFilename();
				 String uploadDirectory= "D://imagesList/";
				 String filePath = uploadDirectory +  fileName;
				 file.transferTo(new File(filePath));
				 MasterDepartmentTbl msd = new MasterDepartmentTbl();				 
				 msd.setDeptImage(filePath);
				 msd.setDepartmentCode(departmentCode);
				 msd.setDepartmentDesc(departmentDesc);
				 msd.setHod(hod);				
				 msd.setIsBedAvaliable(isBedAvaliable);
				 msd.setFlag(flag);
				 msd.setUpdatedBy(updatedBy);
				 msd.setSapFlag(sapFlag);
				 msd.setDeptStatus(deptStatus);
				 msd.setUpdateFlag(updateFlag);
				 return mdtrepo.save(msd);
			}
			catch(Exception e) {
				
			}
		return null;
	}


//	@Override
//	public MasterDepartmentTbl postmaster() {
//		 String fileName = file.getOriginalFilename();
//	        String uploadDirectory= "D://imagesList/";
//	        String filePath = uploadDirectory +  fileName;
//	        file.transferTo(new File(filePath));
//	        MasterDepartmentTbl msd = new MasterDepartmentTbl();
//	        msd.setFlag(flag);
//	        msd.setDeptImage(filePath);
//	       msd.setDepartmentCode(departmentCode);
//	       msd.setDepartmentDesc(departmentDesc);
//	       msd.setDeptStatus(deptStatus);
//	       msd.setIsBedAvaliable(0);
//	    return mdtrepo.save(msd);
//	}


	

}
	
