package com.example.demo.controller;

import java.io.IOException;
//import java.util.List;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.UploadImage;
import com.example.demo.service.UploadImageService;

@RestController
public class UploadImageController {

	@Autowired
	UploadImageService uiservice;

	@GetMapping("/image")
	public String image() {
		return "UPLOading IMAGE";
	}

	// posting image
	@PostMapping("/saveimage")
	public UploadImage saveUI(@RequestPart("image") UploadImage image,@RequestPart("pfile") MultipartFile pfile) throws IOException   {
		return uiservice.saveUI(image,pfile);

	}
	
	@GetMapping("/images")
	  public List<UploadImage> getAllImages(){
	  
	  return uiservice.getAllImages(); }
	 

	@GetMapping("/images/{imageName}")
	public ResponseEntity<?> getImageByName(@PathVariable String imageName) {
		// Implement logic to retrieve the image by name from the service
		byte[] imageResource = uiservice.getImageByName(imageName);
		// Return the image resource in the response
		return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(imageResource);
		
		//return ResponseEntity.ok(imageResource);
	}
}
