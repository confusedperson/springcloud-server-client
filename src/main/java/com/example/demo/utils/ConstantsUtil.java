package com.example.demo.utils;

public class ConstantsUtil {

	public static final String COMMON_YES = "YES";
	public static final String COMMON_NO = "NO";

	public static final int COMMON_TRUE = 1;
	public static final int COMMON_FALSE = 0;

	// 通用的状态码
	public abstract class CommonCode {
		public static final String SUCCESS_CODE = "1"; // 获取数据成功状态码
		public static final String ERROR_CODE = "2"; // 获取数据出错状态码
		public static final String IS_EXIST = "3"; // 获取数据出错状态码
		public static final String FILE_FORMAT_ERROR = "4"; // 未登录状态码
		public static final String PARAM_ERROR_CODE = "0"; // 参数传递错误状态码
		public static final String UN_LOGINED_CODE = "-99"; // 未登录状态码
		public static final String UN_REGIST_CODE = "5"; // 用户未注册
		public static final String REGIST_CODE = "6"; // 用户已注册
	}

	// 通用的消息
	public abstract class CommonMessage {
		public static final String FAILED_MESSAGE = "获取数据失败!"; // 获取数据失败
		public static final String SUCCESS_MESSAGE = "请求数据成功!"; // 获取数据失败
		public static final String ERROR_MESSAGE = "请求数据出错!!"; // 获取数据出错!
		public static final String FILE_FORMAT_ERROR = "文件格式错误"; // 未登录状态码
		public static final String PARAM_ERROR_MESSAGE = "请求参数传递错误!!"; // 参数传递错误
		public static final String IS_EXIST = "记录已存在";
		public static final String JSON_FORMAT_ERROR = "json格式错误";
		public static final String UN_REGIST = "用户名或密码错误"; // 用户名或密码错误
		public static final String REGIST_CODE = "用户已注册"; // 用户已注册
	}

	// 会员表，返回类型列表
	public abstract class FaceRegType {
		public static final int CUSTOMER = 0; // 新顾客
		public static final int VIP = 1; // 会员
		public static final int WORKER = 2; // 店员
		public static final int REGULARS = 3; // 熟客
		public static final int SUSPECTWORKER = 4; // 疑似店员
	}

	// 人脸角度
	public abstract class FaceTowardType {
		public static final int center = 0; // 正
		public static final int up = 1; // 上
		public static final int down = 2; // 下
		public static final int left = 3; // 左
		public static final int right = 4; // 右
	}

	public abstract class Oss {
		public static final String IMAGEWIDTH = "ImageWidth"; // 宽度
		public static final String IMAGEHEIGHT = "ImageHeight"; // 高度
	}

	public abstract class VipArchivesType {
		public static final int SAME_TO_REGIESTER = 0; // 同注册界面
		public static final int CUSTOM = 1; // 自定义
	}

	// 会员字段类型
	public abstract class VipAttributeType {
		public static final int INLINE_TEXT = 0; // 单行文本
		public static final int MULTILINE_TEXT = 1; // 多行文本
		public static final int SINGLE_DROP_DOWN_LIST = 2; // 单选下拉列表
		public static final int SINGLE_SELECTION = 3; // 单选框
		public static final int MULTI_SELECTION = 4; // 复选框
		public static final int DATE = 5; // 日期 yyyy-MM-dd
		public static final int TIME = 6; // 时间 yyyy-MM-dd HH:mm:ss
		public static final int HEAD_PICTURE = 7; // 头像图片
		public static final int PHONE = 8; // 电话号码
		public static final int MAIL = 9; // 邮箱
	}
	
	public static final int TIME_MINUTE = 0;
	public static final int TIME_HOUR = 1;
	public static final int TIME_DAY = 2;
	public static final int TIME_WEEK = 3; // 按星期合并
	public static final int TIME_MONTH = 4;
	public static final int TIME_QUARTER = 5;
	public static final int TIME_YEAR = 6;
	public static final int WEEK_DAY = 7;	

	// 会员字段类型
	public abstract class SystemAttributeId {
		public abstract class NAME {
			// public static final String KEY = "姓名";
			public static final int VALUE = -1;
		}

		public abstract class FACE_URL {
			// public static final String KEY = "人脸照片";
			public static final int VALUE = -2;
		}

		public abstract class VIP_ID {
			// public static final String KEY = "人脸ID";
			public static final int VALUE = -3;
		}

		public abstract class PHONE {
			// public static final String KEY = "电话";
			public static final int VALUE = -4;
		}
	}

	public abstract class Coupon {
		public abstract class Type {
			public static final int CASH = 1; // 代金券
			public static final int MINUS = 2; // 满减券
			public static final int DISCOUNT = 3; // 折扣券
		}
	}

	public abstract class FaceTable{
		public static final int TABLE_TYPE_DAILY = 1; //天表
		public static final int TABLE_TYPE_HOURLY = 2;	//小时表
	}
	
	public abstract class VIP {
		public abstract class Type {
			public static final int ACTIVE = 1; // 活跃会员
			public static final int PRICELESS = 2; // 高价值会员
			public static final int SILENT = 3; // 沉默会员
			public static final int NEW = 4; // 新会员
			public static final int LOST = 5; // 流失会员
		}
	}
	
	//人脸客流设备
	public static final int FACE_DEVICE_TYPE = 2;
	
    public abstract class FaceWebRecord{
		
		//性别分析结果
		public abstract class Gender{
			public static final int MALE = 0; //男人
			public static final int FAMALE = 1;	//女人
		}	
		
		//是否佩戴眼镜的分析结果
		public abstract class Glass{
			public static final int NONE = 0;	//不佩戴眼镜
			public static final int DARK = 1;	//佩戴墨镜
			public static final int NORMAL = 2;	//佩戴普通眼镜
		}	
		//情绪识别结果
		public abstract class Emotion{
			public static final int ANGER = 0;			//愤怒
			public static final int DISGUST = 1;		//厌恶
			public static final int FEAR = 2;			//恐惧
			public static final int HAPPINESS = 3;		//高兴(目前只支持)
			public static final int NEUTRAL = 4;		//平静(目前只支持)
			public static final int SADNESS = 5;		//伤心
			public static final int SURPRISE = 6;		//惊讶
		}
		
		//人种分析结果
		public abstract class Race{
			public static final int ASIAN = 0;	//亚洲人
			public static final int WHITE = 1;	//白人
			public static final int BLACK = 2;	//黑人
		}
		
		//人种分析结果
		public abstract class ErrorReason{
			public static final int Occlusion = 0;	//人脸遮挡	左眼被遮挡，右眼被遮挡，鼻子被遮挡，嘴巴被遮挡，左脸颊被遮挡，右脸颊被遮挡，下巴被遮挡，
			public static final int Blur = 1;	//人脸模糊	人脸模糊
			public static final int Dark = 2;	//光照不足	光照程度不佳
			public static final int Overflow = 3;	//溢出边界	人脸溢出图像边界
			public static final int Angle = 4;	//角度问题	三维旋转之俯仰角度过大，平面内旋转角度过大，三维旋转之左右旋转角度过大 
			public static final int NoFace = 5;	//没有人脸	没有检测到人脸
		}
	}
    
  //face++
  	public abstract class FacePlusPlus{
  		//性别分析结果
  		public abstract class Gender{
  			public static final String MALE = "0"; //男人
  			public static final String FAMALE = "1";	//女人
  		}	
  		//是否佩戴眼镜的分析结果
  		public abstract class Glass{
  			public static final String NONE = "None";	//不佩戴眼镜
  			public static final String DARK = "Dark";	//佩戴墨镜
  			public static final String NORMAL = "Normal";	//佩戴普通眼镜
  		}	
  		//情绪识别结果
  		public abstract class Emotion{
  			public static final String ANGER = "anger";			//愤怒
  			public static final String DISGUST = "disgust";		//厌恶
  			public static final String FEAR = "fear";			//恐惧
  			public static final String HAPPINESS = "happiness";	//高兴
  			public static final String NEUTRAL = "neutral";		//平静
  			public static final String SADNESS = "sadness";		//伤心
  			public static final String SURPRISE = "surprise";	//惊讶
  			
  		}
  		//人种分析结果
  		public abstract class Ethnicity{
  			public static final String ASIAN = "Asian";	//亚洲人
  			public static final String WHITE = "White";	//白人
  			public static final String BLACK = "Black";	//黑人
  		}
  	}
  	
  	// 默认语言：简体中文
 	public static final String DEFAULT_LANG = "SIMPLIFIED_CHINESE";
 	// 语言-英语
 	public static final String LANG_ENGLISH="ENGLISH";	
 	// 语言-繁体中文
 	public static final String LANG_TRADITIONAL_CHINESE="TRADITIONAL_CHINESE";
 	// 语言-法语
 	public static final String LANG_FRENCH = "FRENCH";
 	// 语言-德语
 	public static final String LANG_GERMAN = "GERMAN";
 	// 语言-意大利语
 	public static final String LANG_ITALIAN = "ITALIAN";
 	// 语言-日语
 	public static final String LANG_JAPANESE = "JAPANESE";
 	// 语言-韩语
 	public static final String LANG_KOREAN = "KOREAN";
 	public static final String LANG_TAIWAN="TAIWAN";
 	
 	
 	public static final int TYPE_FACE_IMGPUSH = 9000;
 	/**
	 * 迁移人脸的新websocket推送
	 */
 	public static final int NEW_TYPE_FACE_IMGPUSH = 9003;
	/**
	 * 华为等厂商专用推送
	 */
 	public static final int TYPE_FACE_HUAWEI = 9004;
 	
 	//组织架构
	public abstract class OrganizeCode{
		public static final String ENTERPRISE_PREFIX= "G_";//企业前缀
		public static final String ORGANIZE_PREFIX= "O_";//组织架构前缀
		public static final String DEPART_PREFIX= "D_";//部门前缀
		public static final String AREA_PREFIX="A_";//区域
		public static final String SHOP_PREFIX="S_";//门店
		public static final String TAG_PREFIX="T_";//标签
		public static final String FLOW_DEVICE_PREFIX= "F_";//设备前缀
	}
}
