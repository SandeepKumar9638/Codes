package com.example.demo.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.List;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.UploadImage;
import com.example.demo.repo.UploadImageRepository;

@Service
public class UploadImageService {

	@Value("${uploadDirectory}")
	private String uploadDirectory;

	@Autowired
	UploadImageRepository uploadImageRepository;

	// to post the image
	public UploadImage saveUI(UploadImage image, MultipartFile pfile) {
		String fileName = pfile.getOriginalFilename();
		// String uploadDirectory= "D://imagesList/";
		String filePath = uploadDirectory + fileName;

		// Save the file to the specified directory
		try {
			pfile.transferTo(new File(filePath));
		} catch (IOException e) {

			e.printStackTrace();
		}

		// Create a new instance of UploadImage and save it to the database
		UploadImage uimage = new UploadImage();
		// uimage.setName(fileName);
		uimage.setProfileimage(filePath);
		uimage.setName(fileName);
		return uploadImageRepository.save(uimage);
	}

	public byte[] getImageByName(String imageName) {
		try {
			// String uploadDirectory= "D://imagesList/";
			Path imagePath = Paths.get(uploadDirectory);
			byte[] data = Files.readAllBytes(imagePath);
			return data;
		} catch (Exception e) {
			// Handle the exception
			e.printStackTrace();
			return null;
		}
	}

	public List<UploadImage> getAllImages() {
		// List<UploadImage> uilist = new ArrayList<UploadImage>();
		return uploadImageRepository.findAll();// .forEach(uimage->uilist.add(uimage));

	}

}
