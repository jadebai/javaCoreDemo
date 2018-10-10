package com.baiyu.image;

import java.io.File;

/**
 * @author baiyu
 * @description: ImageUtil
 * @date: 2018/7/31
 */
public class ImageUtil {

    public static String clearWaterMark(String imagePath) {
        String clearName = imagePath.substring(imagePath.lastIndexOf("-merge-"), imagePath.lastIndexOf('.'));
        String originalImagePath = imagePath.replace(clearName, "");
        // 清除水印后删除水印图片
        File fileImg = new File(imagePath);
        if (fileImg.isFile()) {
            fileImg.delete();
        }
        // 返回原图地址
        return originalImagePath;
    }

    public static void main(String[] args) {
        // 路径为绝对路径
        String watermarkImage = "d:/1.jpg";
        String originalImgage = clearWaterMark(watermarkImage);
        System.out.println(originalImgage);
    }
}
