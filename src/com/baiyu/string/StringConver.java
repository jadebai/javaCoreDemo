package com.baiyu.string;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author baiyu
 * @description: StringConver  字符串反转
 * @date: 2018/7/4
 */
public class StringConver {

    public static void main(String[] args) {
//        String str = "结束时间是";
//        long beginTime = System.currentTimeMillis();
//        long endTime = System.currentTimeMillis();
//        beginTime = System.currentTimeMillis();
//        System.out.println(convert1(str));
//        endTime = System.currentTimeMillis();
//        System.out.println("convert1====="+(endTime-beginTime));
//        beginTime = System.currentTimeMillis();
//        System.out.println(convert2(str));
//        endTime = System.currentTimeMillis();
//        System.out.println("convert2====="+(endTime-beginTime));
//        beginTime = System.currentTimeMillis();
//        System.out.println(convert3(str));
//        endTime = System.currentTimeMillis();
//        System.out.println("convert3====="+(endTime-beginTime));
//        strTo10("f0f91c35a112221b175ee8d8d4e395a010143245",4);
//        strTo10("f0f91c35a112221b175ee8d8d4e395a09275653",4);
//        strTo10("f0f91c35a112221b175ee8d8d4e395a04020989",4);
//        strTo10("f0f91c35a112221b175ee8d8d4e395a010263775",4);
//        strTo10("f0f91c35a112221b175ee8d8d4e395a04011068",4);
//        strTo10("f0f91c35a112221b175ee8d8d4e395a011367549",4);
//        strTo10("f0f91c35a112221b175ee8d8d4e395a010974146",4);

//        List<String>  a = new ArrayList<>();
//        a.add("1");
//        a.add("2");
//        a.add("3");
//
//        List<String>  b = new ArrayList<>();
//        Iterator iterator = b.iterator();
//        while (iterator.hasNext()){
//            if (iterator.next().equals("1")){
//                iterator.remove();
//            }
//        }
//        System.out.println(a.toString());
//        System.out.println(convert4("asdfgh"));
        System.out.println(Long.parseLong("0111111111111111111111111111111111111111111111111111111111111110",2));
     }


    public static String convert1(String str){
        char[] chars = str.toCharArray();
        String result = "";
        for (int i=chars.length-1;i>=0;i--){
            result += chars[i];
        }
        return result;
    }

    public static String convert2(String str){
        StringBuffer stringBuffer = new StringBuffer(str);
        String result = stringBuffer.reverse().toString();
        return result;
    }

    public static String convert3(String str){
        String result = "";
        for (int i=0;i<str.length();i++){
            result = str.charAt(i)+result;
        }
        return result;
    }

    public static String convert4(String str){
        String result = "";
        for (int i=str.length()-1;i>=0;i--){
            result = result + str.charAt(i);
        }
        return result;
    }



    public static void strTo10(String str,int length){
        System.out.println(str.hashCode() & (length-1));
    }
}
