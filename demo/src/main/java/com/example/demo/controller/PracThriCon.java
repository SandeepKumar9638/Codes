package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.PracThri;
import com.example.demo.service.PracThriServ;

@Controller
public class PracThriCon {
	@Autowired
	PracThriServ pracThriServ;
	
	@RequestMapping("/thr")
	@ResponseBody
	public PracThri posting(@RequestBody PracThri pracThri ) {
		return pracThriServ.posting(pracThri);
		
	}

}
