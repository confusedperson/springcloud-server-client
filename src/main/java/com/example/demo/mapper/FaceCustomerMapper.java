package com.example.demo.mapper;


import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.example.demo.model.FaceCustomer;
import com.example.demo.model.FaceCustomerExample;

public interface FaceCustomerMapper {
    int deleteByExample(FaceCustomerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FaceCustomer record);

    int insertSelective(FaceCustomer record);

    List<FaceCustomer> selectByExample(FaceCustomerExample example);

    FaceCustomer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FaceCustomer record, @Param("example") FaceCustomerExample example);

    int updateByExample(@Param("record") FaceCustomer record, @Param("example") FaceCustomerExample example);

    int updateByPrimaryKeySelective(FaceCustomer record);

    int updateByPrimaryKey(FaceCustomer record);
    
    List<FaceCustomer> getFaceCustomerListByDepId(@Param("depId") Integer depId,@Param("orgId") Integer orgId,@Param("deviceMac")String deviceMac,@Param("startTime")Date startTime,@Param("endTime") Date endTime);
    
    FaceCustomer selectLastByVipId(@Param("depId")Integer depId,@Param("vipId")Integer vipId);
    
    int updateRegTypeByVipId(@Param("vipId")Integer vipId,@Param("regType")Integer regType);
    
    FaceCustomer selectLastByimageUrl(@Param("imageUrl")String imageUrl);
    
    int updateUseridByVipId(@Param("vipId")Integer vipId,@Param("userId")Integer userId);
    
    int updateVipIdByVipId(@Param("srcvipId")Integer srcvipId,@Param("vipId")Integer vipId);
    
    List<FaceCustomer> getFaceCustomerListByUrl(@Param("url")String url);
    
    List<FaceCustomer> getFaceCustomerListByVipId(@Param("vipId")Integer vipId);
    
}