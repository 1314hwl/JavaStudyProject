package com.cn.sz.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <title>正则表达式</title>
 * <p>
 * 1.^匹配开头<br>
 * 2.$匹配结尾<br>
 * </p>
 * 
 * @author HuWeiLiang
 *
 */
public class RegularDemo001 {

	public static void main(String[] args) {

		System.out.println(isMathcherTest8("gogo toto homehome"));

		// String regex = "\\d{3,}";
		// System.out.println(isMatcher("902", regex));
		// System.out.println("\\\"");

		// String pattern="^[0-9a-zA-Z]{5,19}";
		// System.out.println(isMatcher("1LSAKJFLKJASFD23HJ5", pattern));

	}

	public static boolean isMatcher(String content, String regex) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(content);
		return matcher.matches();
	}
	
	
	
	/**
	 * <title>零宽断言</title>
	 * <p>
	 * 1.?=exp 断言自身出现的位置的后面能匹配表达式exp<br>
	 * 2.?<=exp断言自身出现的位置的前面能匹配表达式exp<br>
	 * 3.?!exp断言自身出现的位置的后面不能匹配表达式exp<br>
	 * 4.?<!exp断言自身出现的位置的前面不能匹配表达式exp<br>
	 * </p>
	 * 
	 * @param content
	 * @return
	 */
	public static boolean isMathcherTest9(String content) {
		String regex = "[a-z]+(?=ing)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(content);
		return matcher.matches();
	}
	
	/**
	 * <title>()</title>
	 * <p>
	 * 分组
	 * </p>
	 * 
	 * @param content
	 * @return
	 */
	public static boolean isMathcherTest8(String content) {
		String regex = "([a-z]{2})\1";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(content);
		return matcher.matches();
	}
	/**
	 * <title>|</title>
	 * <p>
	 * 或
	 * </p>
	 * 
	 * @param content
	 * @return
	 */
	public static boolean isMathcherTest7(String content) {
		String regex = "g|b";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(content);
		return matcher.matches();
	}
	/**
	 * <title>\w</title>
	 * <p>
	 * 匹配,字母数字下划线
	 * </p>
	 * 
	 * @param content
	 * @return
	 */
	public static boolean isMathcherTest6(String content) {
		String regex = "\\w";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(content);
		return matcher.matches();
	}

	/**
	 * <title>|</title>
	 * <p>
	 * 两者取一
	 * </p>
	 * 
	 * 
	 * @param content
	 * @return
	 */
	public static boolean isMathcherTest5(String content) {
		String regex = "J|A";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(content);
		return matcher.matches();
	}

	/**
	 * <title>{}</title>
	 * 
	 * @param content
	 * @return
	 */
	public static boolean isMathcherTest4(String content) {
		// 指定连续出现多少次
		String regex = "J{3}";
		// 至少出现4次
		regex = "J{4,}";
		// J容许出现的次数在3，7次之间
		regex = "J{3,7}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(content);
		return matcher.matches();
	}

	/**
	 * <title>?</title>
	 * 表示0-1次
	 * @param content
	 * @return
	 */
	public static boolean isMathcherTest3(String content) {
		// JA/A出现0次以上
		String regex = "JA?";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(content);
		return matcher.matches();
	}

	/**
	 * <title>+</title>
	 * 
	 * @param content
	 * @return
	 */
	public static boolean isMathcherTest2(String content) {
		// 一个以上A
		// 表示1个以上A
		String regex = "A+.*";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(content);
		return matcher.matches();
	}

	/**
	 * <title>*</title>
	 * 0次以上
	 * @param content
	 * @return
	 */
	public static boolean isMatcherTest1(String content) {
		// 表示0个以上A，//TODO 不是很理解，只能是A么？不能包含A以外的其它字母？
		String regex = "A*.*";
		// 0个以上任意字符
		// regex = ".*";
		// A-D之间0个以上任意字符
		// TODO 未理解，未测试通过
		// regex = "A.*D";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(content);
		return matcher.matches();

	}

	/**
	 * <title>匹配0-9a-zA-Z</title>
	 * <p>
	 * []:加入特定限制条件<br>
	 * {}:出现的次数<br>
	 * \d:和0-9效果相同
	 * </p>
	 * 
	 * @param content
	 * @return
	 */
	public static boolean isMatcherNumber(String content) {
		// 匹配所有0-9A-Za-z，长度为2-9
		// String regex = "[0-9A-Za-z]{2,9}";
		// 匹配所有0-9A-Za-z，长度为2-9
		String regex = "[\\da-zA-Z]{2,9}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(content);
		return matcher.matches();
	}

	/**
	 * <title>[^]的使用</title>
	 * 
	 * @param content
	 * @return
	 */
	public static boolean isMatherTest(String content) {
		String regex = "[^0-9]";// 表示非0-9的数字
		regex = "[^0-9[a-z]]";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(content);
		return matcher.matches();
	}

	/**
	 * 匹配开头^和结尾$
	 * 
	 * @param content
	 * @return
	 */
	public static boolean isMatcherStartAndEnd(String content) {
		// ^匹配字符串以"abc"开头的所有字母
		// String regex="^abc.*";
		// $匹配所有以def结尾的字符串
		String regex = ".*def$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(content);
		return matcher.matches();
	}
	/**
	 * \b:前面的字符和后面的字符不全是\w
	 * 
	 * @param content
	 * @return
	 */
	public static boolean isMatcherB(String content) {
		String regex = "h\b";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(content);
		return matcher.matches();
	}
	

	public static boolean isDoubleStr(String doubleStr) {
		String pattern = "^\\-{0,1}[0-9]{0,}\\.{0,1}[0-9]{0,}$";
		return doubleStr.matches(pattern);
	}

	/**
	 * <title>验证银联卡号</title>
	 * <p>
	 * 16~19位数字
	 * </p>
	 * 
	 * @param bankCardNo
	 * @return
	 */
	public static boolean isBankCardNo(String bankCardNo) {
		String regex = "^[0-9]{16,19}";
		return isMatcher(bankCardNo, regex);
	}

}
