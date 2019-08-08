package com.example.demo.service.impl;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.example.demo.mapper.FaceCustomerMapper;
import com.example.demo.model.FaceCustomer;
import com.example.demo.model.FaceCustomerExample;
import com.example.demo.service.FaceService;
import com.example.demo.service.WriteExcelDataDelegated;
import com.example.demo.utils.ConstantsUtil;
import com.example.demo.utils.DateUtil;
import com.example.demo.utils.JsonResult;
import com.example.demo.utils.PoiUtil;
import com.github.pagehelper.PageHelper;

@Service
public class FaceServiceImpl implements FaceService{
	@Autowired
	private FaceCustomerMapper faceCustomerMapper;
	
	@Override
	public String test() {
		FaceCustomer faceCustomer = faceCustomerMapper.selectByPrimaryKey(62415400);
		return JsonResult.success(faceCustomer);
	}
	
	@Override
	public JsonResult export(FaceCustomer faceCustomer, HttpServletResponse response) throws Exception{
		// 总记录数
//        Integer totalRowCount = this.userMapper.selectUserVOCount(userVO);
        
        Integer totalRowCount = faceCustomerMapper.selectCount();
 
        // 导出EXCEL文件名称
        String filaName = "用户EXCEL-"+totalRowCount;
 
        // 标题
        String[] titles = {"照片", "FaceId", "时间", "设备", "身份", "性别", "年龄", "眼镜", "心情", "种族", "是否有效","无效原因"};
 
        // 开始导入
        PoiUtil.exportExcelToWebsite(response, totalRowCount, filaName, titles, new WriteExcelDataDelegated() {
            @Override
            public void writeExcelData(SXSSFSheet eachSheet, Integer startRowCount, Integer endRowCount, Integer currentPage, Integer pageSize) throws Exception {
 
                PageHelper.startPage(currentPage, pageSize);
//                List<UserVO> userVOList = userMapper.selectUserVOList(userVO);
                List<FaceCustomer> userVOList = faceCustomerMapper.selectFace();
//                System.out.println(currentPage+"===="+pageSize);
                if (!CollectionUtils.isEmpty(userVOList)) {
 
                    // --------------   这一块变量照着抄就行  强迫症 后期也封装起来     ----------------------
                    for (int i = startRowCount; i <= endRowCount; i++) {
                        SXSSFRow eachDataRow = eachSheet.createRow(i);
                        if ((i - startRowCount) < userVOList.size()) {
 
//                            UserVO eachUserVO = userVOList.get(i - startRowCount);
                        	FaceCustomer eachUserVO = userVOList.get(i - startRowCount);
                            // ---------   这一块变量照着抄就行  强迫症 后期也封装起来     -----------------------
                        	SimpleDateFormat format  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                            eachDataRow.createCell(0).setCellValue(eachUserVO.getFaceUrl() == null ? "" : eachUserVO.getFaceUrl());
                            eachDataRow.createCell(1).setCellValue(String.valueOf(eachUserVO.getVipId()) == null ? "" : String.valueOf(eachUserVO.getVipId()));
                            eachDataRow.createCell(2).setCellValue(format.format(eachUserVO.getCreateTime()) == null ? "" : format.format(eachUserVO.getCreateTime()));
                            eachDataRow.createCell(3).setCellValue(eachUserVO.getDeviceMac() == null ? "" : eachUserVO.getDeviceMac());
                            eachDataRow.createCell(4).setCellValue(regType(eachUserVO.getRegType()) == null ? "" : regType(eachUserVO.getRegType()));
//                            eachDataRow.createCell(5).setCellValue(eachUserVO.getGender() == null ? "" : eachUserVO.getGender());
//                            eachDataRow.createCell(6).setCellValue(eachUserVO.getEmail() == null ? "" : eachUserVO.getEmail());
//                            if (null != eachUserVO.getCreateUid()) {
//                                eachDataRow.createCell(7).setCellValue(eachUserVO.getCreateUid());
//                            }
//                            if (null != eachUserVO.getCreateTime()) {
//                                eachDataRow.createCell(8).setCellValue(DateUtil.formatDate(eachUserVO.getCreateTime(), DateUtil.YYYY_MM_DD_HH_MM_SS));
//                            }
//                            if (null != eachUserVO.getUpdateUid()) {
//                                eachDataRow.createCell(9).setCellValue(eachUserVO.getUpdateUid());
//                            }
//                            if (null != eachUserVO.getUpdateTime()) {
//                                eachDataRow.createCell(10).setCellValue(DateUtil.formatDate(eachUserVO.getUpdateTime(), DateUtil.YYYY_MM_DD_HH_MM_SS));
//                            }
                        }
                    }
                }
 
            }
        });
 
//        return ResultVO.getSuccess("导出用户EXCEL成功");
        return null;
	}
	
	
	private String regType(Integer regType) {
		if (regType != null) {
			switch (regType) {
			case ConstantsUtil.FaceRegType.CUSTOMER:
				return "新顾客";
			case ConstantsUtil.FaceRegType.REGULARS:
				return "熟客";
			case ConstantsUtil.FaceRegType.SUSPECTWORKER:
				return "疑似店员";
			case ConstantsUtil.FaceRegType.WORKER:
				return "店员";
			case ConstantsUtil.FaceRegType.VIP:
				return "会员";
			default:
				return "";
			}
		}
		return "";
	}
}
