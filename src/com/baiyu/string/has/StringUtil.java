package com.baiyu.string.has;

import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @author baiyu
 * @description: StringUtil   营销云-最大公因子
 * @date: 2019/4/4
 */
public class StringUtil {

    public static void main(String[] args) {
        String a = "acdcdf";//流程
//        String a = "gfcd";//流程
//        String b = " ";//用户执行过的流程节点
        String b = "afcdcdef";//用户执行过的流程节点
        System.out.println(aInB(a,b));
        try {
            System.out.println(URLDecoder.decode(URLDecoder.decode("http%253A%252F%252Fmj.dev.weimob.com%252Fmobile%252F","utf-8"),"utf-8"));
        }catch (Exception e){

        }
    }

    private static String aInB(String a, String b) {
        if (a == null || "".equals(a)){
            return "a 为空";
        }
        if (null == b || "".equals(b)){
            return a.substring(0,1);
        }
        int j = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<a.length();i++){
            if (j == b.length()){
                break;
            }
            for (int k =j; k < b.length();k++ ){
                j++;
                if (a.charAt(i) == b.charAt(k)){
                    stringBuilder.append(b.charAt(k));
                    break;
                }
            }
        }
        System.out.println("stringbuffer ===" + stringBuilder.toString());
        if (a.equals(stringBuilder.toString())){
            return "当前流程已经结束";
        }else if (a.startsWith(stringBuilder.toString())){
            return a.replace(stringBuilder.toString(),"").substring(0,1);
        }else{
            return "当前流程不能执行";
        }
    }
}
