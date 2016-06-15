package com.cn.sz.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <title>常用正则表达式2</title>
 * 
 * @author HuWeiLiang
 *
 */
public class RegularDemo002 {

	public static void main(String[] args) {
		System.out.println(isEmail("405146836@qq.com"));
	}

	/**
	 * 匹配座机/手机号码
	 * 
	 * @param phoneNo
	 * @return
	 */
	public static boolean isPhoneNo(String phoneNo) {
		Pattern p = Pattern.compile("\\d{3,4}-\\d{7,8}|^1[3,5,8]\\d{9}$");
		Matcher m = p.matcher(phoneNo);
		return m.matches();
	}

	/**
	 * <title>验证邮箱</title>
	 * <p>
	 * 1.用户名:字母，数字，中划线，下划线组成<br>
	 * 2.@<br>
	 * 3.网址:字母，数字组成<br>
	 * 4.小数点<br>
	 * 5.组织域名:2-4位字母组成<br>
	 * 6.不区分大小写
	 * Ï
	 * </p>
	 * 
	 * @param email
	 * @return
	 */
	public static boolean isEmail(String email) {
		Pattern p = Pattern.compile("[\\w\\-]+@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,4}){1,2}");
		Matcher m = p.matcher(email);
		return m.matches();
	}

}
