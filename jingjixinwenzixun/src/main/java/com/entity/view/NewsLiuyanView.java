package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.NewsLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 新闻留言
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("news_liuyan")
public class NewsLiuyanView extends NewsLiuyanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表

	//级联表 新闻信息
		/**
		* 新闻标题
		*/

		@ColumnInfo(comment="新闻标题",type="varchar(200)")
		private String newsName;
		/**
		* 新闻类型
		*/
		@ColumnInfo(comment="新闻类型",type="int(11)")
		private Integer newsTypes;
			/**
			* 新闻类型的值
			*/
			@ColumnInfo(comment="新闻类型的字典表值",type="varchar(200)")
			private String newsValue;
		/**
		* 新闻图片
		*/

		@ColumnInfo(comment="新闻图片",type="varchar(200)")
		private String newsPhoto;
		/**
		* 推荐类型
		*/
		@ColumnInfo(comment="推荐类型",type="int(11)")
		private Integer tuijianTypes;
			/**
			* 推荐类型的值
			*/
			@ColumnInfo(comment="推荐类型的字典表值",type="varchar(200)")
			private String tuijianValue;
		/**
		* 新闻详情
		*/

		@ColumnInfo(comment="新闻详情",type="text")
		private String newsContent;
	//级联表 用户
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 头像
		*/

		@ColumnInfo(comment="头像",type="varchar(255)")
		private String yonghuPhoto;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 邮箱
		*/

		@ColumnInfo(comment="邮箱",type="varchar(200)")
		private String yonghuEmail;
		/**
		* 假删
		*/

		@ColumnInfo(comment="假删",type="int(11)")
		private Integer yonghuDelete;



	public NewsLiuyanView() {

	}

	public NewsLiuyanView(NewsLiuyanEntity newsLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, newsLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





	//级联表的get和set 新闻信息

		/**
		* 获取： 新闻标题
		*/
		public String getNewsName() {
			return newsName;
		}
		/**
		* 设置： 新闻标题
		*/
		public void setNewsName(String newsName) {
			this.newsName = newsName;
		}
		/**
		* 获取： 新闻类型
		*/
		public Integer getNewsTypes() {
			return newsTypes;
		}
		/**
		* 设置： 新闻类型
		*/
		public void setNewsTypes(Integer newsTypes) {
			this.newsTypes = newsTypes;
		}


			/**
			* 获取： 新闻类型的值
			*/
			public String getNewsValue() {
				return newsValue;
			}
			/**
			* 设置： 新闻类型的值
			*/
			public void setNewsValue(String newsValue) {
				this.newsValue = newsValue;
			}

		/**
		* 获取： 新闻图片
		*/
		public String getNewsPhoto() {
			return newsPhoto;
		}
		/**
		* 设置： 新闻图片
		*/
		public void setNewsPhoto(String newsPhoto) {
			this.newsPhoto = newsPhoto;
		}
		/**
		* 获取： 推荐类型
		*/
		public Integer getTuijianTypes() {
			return tuijianTypes;
		}
		/**
		* 设置： 推荐类型
		*/
		public void setTuijianTypes(Integer tuijianTypes) {
			this.tuijianTypes = tuijianTypes;
		}


			/**
			* 获取： 推荐类型的值
			*/
			public String getTuijianValue() {
				return tuijianValue;
			}
			/**
			* 设置： 推荐类型的值
			*/
			public void setTuijianValue(String tuijianValue) {
				this.tuijianValue = tuijianValue;
			}

		/**
		* 获取： 新闻详情
		*/
		public String getNewsContent() {
			return newsContent;
		}
		/**
		* 设置： 新闻详情
		*/
		public void setNewsContent(String newsContent) {
			this.newsContent = newsContent;
		}
	//级联表的get和set 用户

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}

		/**
		* 获取： 假删
		*/
		public Integer getYonghuDelete() {
			return yonghuDelete;
		}
		/**
		* 设置： 假删
		*/
		public void setYonghuDelete(Integer yonghuDelete) {
			this.yonghuDelete = yonghuDelete;
		}


	@Override
	public String toString() {
		return "NewsLiuyanView{" +
			", newsName=" + newsName +
			", newsPhoto=" + newsPhoto +
			", newsContent=" + newsContent +
			", yonghuName=" + yonghuName +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuEmail=" + yonghuEmail +
			", yonghuDelete=" + yonghuDelete +
			"} " + super.toString();
	}
}
