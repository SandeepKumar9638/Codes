package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.AudioFile;
import com.example.demo.repo.AudioFileRepository;

@Service
public class AudioFileService {
	
	@Autowired
	AudioFileRepository audioFileRepository;

	public AudioFile uploadSpeech(MultipartFile file) {
		 String text = "Sample text from speech file: " + file.getOriginalFilename();

	        // Create a new Speech entity and save it to the database
		 AudioFile speech = new AudioFile();
	        speech.setText(text);
	        return audioFileRepository.save(speech);
	}

	public AudioFile getSpeech(Long id) {
		 return audioFileRepository.findById(id)
	                .orElseThrow(() -> new IllegalArgumentException("Speech with id " + id + " not found"));
	
		
	}

}
