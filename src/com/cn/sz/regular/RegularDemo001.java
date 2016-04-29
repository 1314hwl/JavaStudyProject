package com.cn.sz.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularDemo001 {

	public static void main(String[] args) {
		// String regular="^[0-9]{16,19}";//匹配16-19位数字
		// String cardNo="6225887378765435555";
		// System.out.println(isMatcher(cardNo, regular));

		String test = "99";
		System.out.println(isDoubleStr(test));

	}

	public static boolean isMatcher(String strEmail, String pattern) {
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(strEmail.trim());
		if (m.matches()) {
			return true;
		}
		return false;
	}

	public static boolean isDoubleStr(String doubleStr) {
		String pattern = "^\\-{0,1}[0-9]{0,}\\.{0,1}[0-9]{0,}$";
		return doubleStr.matches(pattern);
	}

}
