package com.maytaste.eduame.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Properties;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.sun.jersey.server.impl.container.servlet.ServletAdaptor;

public class Utils {
	
	private static Properties settingsProperties;
	
	/**
	 * 加密字符串SHA加密
	 * 
	 * @param txt
	 * @return
	 */
	public static String encrypt(String txt) {
		if (txt == null || txt.equals("")) {
			return "";
		}
		String[] hexDigits = { "0", "1", "2", "3", "4", "5", "6", "7", "8",
				"9", "a", "b", "c", "d", "e", "f" };
		byte[] bts;
		StringBuffer sb = new StringBuffer();
		try {
			MessageDigest md = MessageDigest.getInstance("SHA");
			bts = md.digest(txt.getBytes());
			for (int i = 0; i < bts.length; i++) {

				int n = bts[i];
				if (n < 0)
					n = 256 + n;
				int d1 = n / 16;
				int d2 = n % 16;
				sb.append(hexDigits[d1] + hexDigits[d2]);
			}

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		return sb.toString();
	}
	
	/**
	 * 复制文件
	 * 
	 * @param in
	 *            源文件 InputStream类型
	 * @param path
	 *            目标文件位置
	 * @return
	 */
	public static String copyFile(InputStream in, String path) {
		
		FileOutputStream out = null;
		try {
			File dir = new File(path);
			if (!dir.exists()) {
				dir.createNewFile();
			}
			out = new FileOutputStream(new File(path));
			byte[] bs = new byte[1024];
			int len = 0;
			while ((len = in.read(bs)) > 0) {
				out.write(bs, 0, len);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null){
					in.close();
				}
				if (out != null){
					out.flush();
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return path;
	}
	
	public static String toJsonString(Object obj){
		JSONSerializer ser=new JSONSerializer();
		ser.write(obj);
		return ser.toString();
	}
	
	public static <T> T parseJSONString(String str,Class<T> clazz){
		return JSON.parseObject(str, clazz);
	}
	public static <T> List<T> parseJSONStringToList(String str,Class<T> clazz){
		return JSON.parseArray(str, clazz);
	}

	public static String normalDateFormat(java.util.Date date){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		
		return sdf.format(date);
		
	}
}
