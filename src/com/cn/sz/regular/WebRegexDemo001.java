package com.cn.sz.regular;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class WebRegexDemo001 {
	public static void main(String[] args) {
		
		
		System.out.println(getUrlContent("http://www.163.com"));
		
	}
	
	public static String getUrlContent(String url){
		StringBuilder sb=new StringBuilder();
		try {
			URL mUrl=new URL(url);
			BufferedReader reader=new BufferedReader(new InputStreamReader(mUrl.openStream()));
			String content=null;
			while((content=reader.readLine())!=null){
				sb.append(content);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb.toString();
	}

}
