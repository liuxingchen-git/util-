package com.liuxingchen.util;
/**
 * 
 * @ClassName: NumberUtil 
 * @Description: TODO
 * @author: HP
 * @date: 2020年1月3日 下午7:18:06
 */
public class NumberUtil {
	/**
	 * 
	 * @Title: isNumber 
	 * @Description: 判断是否是数字
	 * @param src
	 * @return
	 * @return: boolean
	 */
	public static boolean isNumber(String src) {
		String reg = "^(-)?[0-9]+(\\.[0-9]+)?$";
		System.out.println(reg);
		return src.matches(reg);
	}
	
}
