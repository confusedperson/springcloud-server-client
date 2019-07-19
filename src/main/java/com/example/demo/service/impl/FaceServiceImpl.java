package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.FaceCustomerMapper;
import com.example.demo.model.FaceCustomer;
import com.example.demo.service.FaceService;
import com.example.demo.utils.JsonResult;

@Service
public class FaceServiceImpl implements FaceService{
	@Autowired
	private FaceCustomerMapper faceCustomerMapper;
	
	@Override
	public String test() {
		FaceCustomer faceCustomer = faceCustomerMapper.selectByPrimaryKey(62415400);
		return JsonResult.success(faceCustomer);
	}
}
