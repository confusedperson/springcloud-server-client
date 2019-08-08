package com.example.demo.service;

import javax.servlet.http.HttpServletResponse;

import com.example.demo.model.FaceCustomer;
import com.example.demo.utils.JsonResult;

public interface FaceService {
	public String test();
	
	/**
     * 导出用户EXCEL
     *
     * @param userVO
     * @return VOID
     * @throws Exception
     */
	JsonResult export(FaceCustomer faceCustomer, HttpServletResponse response) throws Exception;
    
}
