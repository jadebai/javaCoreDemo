package com.baiyu.test;

/**
 * FileName: com.baiyu.common.utils.ArrUtil
 * Author: baiyu
 * Date: 2018/12/13 0013
 * Description:
 * History:
 * <Author>      <Time>    <version>    <desc>
 * baiyu   下午 11:11    1.0       Create
 */
public class ArrUtil {


    public static void main(String[] args) {

        int size = 9;
        int[][] nums = new int[size][size];
        System.out.println("长宽为："+size);
        arrPrintln(1,size/2,nums,size);
        for (int[] a :nums){
            for (int i=0;i<size;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }

    }

    /**
     *
     * @param num  需要的赋值
     * @param quan 还有几圈
     * @param nums 数组
     * @param bigSize 长宽
     */
    public static void arrPrintln(int num,int quan,int[][] nums,int bigSize){
        //计算圈数
        int totalQuan = bigSize/2;
        System.out.println("当前还有"+quan+"圈");
        //上圈
        // x 横坐标  y 众坐标
        int x = totalQuan-quan;
        int y = totalQuan-quan;
        for (int i=y;i< bigSize-y;i++){
            nums[x][i] = num++;
        }

        //放在这里 而不是上来就判断
        // 主要是最后一圈需要打印一个值
        if (quan==0){
            return;
        }

        //右边
        x = x+1;
        y = bigSize-(totalQuan-quan)-1;
        for (int i = x;i<bigSize-(totalQuan-quan);i++){
            nums[i][y] = num++;
        }

        //下边
        x = y;
        y = (bigSize-1)-(totalQuan-quan)-1;
        for (int i = y;i>=totalQuan-quan;i--){
            nums[x][i] = num++;
        }

        //左边
        y = totalQuan-quan;
        x = (bigSize-1)-y-1;
        for (int i = x;i>y;i--){
            nums[i][y] = num++;
        }
        System.out.println("num=="+num);
        //递归调用
        arrPrintln(num,quan-1,nums,bigSize);
    }
}
