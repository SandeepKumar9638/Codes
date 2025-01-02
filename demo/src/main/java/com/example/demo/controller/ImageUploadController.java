package com.example.demo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.ImageUpload;
import com.example.demo.service.ImageUploadService;

@RestController
public class ImageUploadController {

	@Autowired
	ImageUploadService iuService;
	
	
	@GetMapping("/bommas")
	public String image() {
		return "UPLOading IMAGE";
	}
	
	
	@PostMapping("/bomma")
	public ImageUpload postBomma(@RequestParam MultipartFile bomma) throws IOException {
		return iuService.postBomma(bomma);
	}
	
	@GetMapping("/bomma/{bommaName}")
	public ResponseEntity<?> getBomma(@PathVariable String bommaName){
		byte[] bommaResource = iuService.getBomma(bommaName);
		return ResponseEntity.ok().contentType(MediaType.valueOf("image/png")).body(bommaResource);
	}
}
