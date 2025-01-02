package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.AudioFile;
import com.example.demo.service.AudioFileService;

@RestController
public class AudioFileController {
	@Autowired
	AudioFileService audioFileService;
	
	@GetMapping("/audio")
	public String getaudio(){
		return "Listening";
	}
	
	 @PostMapping("/upload")
	    public AudioFile uploadSpeech(@RequestParam("file") MultipartFile file) {
	        return audioFileService.uploadSpeech(file);
	    }

	    @GetMapping("/{id}")
	    public AudioFile getSpeech(@PathVariable Long id) {
	        return audioFileService.getSpeech(id);
	    }
	}


