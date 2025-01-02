package com.example.demo.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.ImageUpload;
import com.example.demo.repo.ImageUploadRepository;

@Service
public class ImageUploadService {

	@Autowired
	private ImageUploadRepository iuRepo;

	public ImageUpload postBomma(MultipartFile bomma) throws  IOException  {
		String fileName = bomma.getOriginalFilename();
		String uploadDirectory = "D://imagesList/";
		String filePath = uploadDirectory+fileName;
		bomma.transferTo(new File(filePath));
		
		ImageUpload iuload = new ImageUpload();
		iuload.setName(fileName);
		iuload.setBomma(filePath);
		return iuRepo.save(iuload);
	}

	public byte[] getBomma(String name) {
		try {
		String uploadDirectory = "D://imagesList/";
		Path bommapath = Paths.get(uploadDirectory).resolve(name);
		
		
			byte[] xyz = Files.readAllBytes(bommapath);
			return xyz;
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null ;
		}
		
	}
	
}
