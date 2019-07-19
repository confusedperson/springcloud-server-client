package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.mapper.FaceCustomerMapper;
import com.example.demo.model.FaceCustomer;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringcloudServerClientApplicationTests {
	@Autowired
	private FaceCustomerMapper faceCustomerMapper;
	@Test
	public void contextLoads() {
		FaceCustomer faceCustomer = faceCustomerMapper.selectByPrimaryKey(62415389);
		System.out.println();
	}
}
