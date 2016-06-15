package com.cn.sz.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <title>正则表达式3</title>
 * @author HuWeiLiang
 *
 */
public class RegularDemo003 {
	
	public static void main(String[] args) {
		
		Pattern pattern=Pattern.compile("\\w+");
		Matcher matcher=pattern.matcher("aslqwer2134");
	    while(matcher.find()){
//	    	matcher.group();
	    	System.out.println(matcher.group(0));
	    }
	    matcher.replaceAll("*");
	    
		
		
	}

}
