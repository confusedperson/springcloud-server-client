package com.example.demo.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.FaceCustomer;
import com.example.demo.service.FaceService;

@RestController
@RequestMapping("/face")
public class FaceController {
	@Autowired 
	private FaceService faceService;
	
	
	@RequestMapping("/test")
	@ResponseBody
	public String getString(String id) {
		return faceService.test();
	}
	
	@RequestMapping("/export")
	@ResponseBody
	public String export(FaceCustomer faceCustomer,HttpServletResponse response) {
		 try {
			faceService.export(faceCustomer, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
