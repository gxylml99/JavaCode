package zhangJie;

import java.util.Random;

/**
 * Author:GXY
 * Date:2023/12/30
 * Package:zhangJie
 */
public class lian03 {
    public static void main(String[] args) {
//        判断一个整数是否是水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方
//        和等于其本身。例如：153=1*1*1+3*3*3+5*5*5
//        Scanner myInt = new Scanner(System.in);
//        System.out.println("输入数字");
//        int gxy = myInt.nextInt();
        Random random = new Random();
        int gxy=random.nextInt(1000)+1;

        int digitCount = String.valueOf(gxy).length();
        System.out.println("随即输入的数："+gxy);
        if (digitCount <= 4) {

            for (int i = gxy; i > 100; i--) {
                int b = i / 100;
                int c = i % 100 / 10;
                int d = i % 10;
//                    System.out.println(b);
//                    System.out.println(c);
//                    System.out.println(d);

            if ((i == b * b * b + c * c * c + d * d * d)) {

                    System.out.println(i + "");
                }


        }

        } else {
            System.out.println("请输入四位数以下的数");
        }


    }
}
//package com.java;
//public class HelloWorld {
//    public static void main(String[] args) {
//        int n=100;
//        System.out.println("水仙花数为：");
//        do{
//            int i=n%10;       //获取个位
//            int j=(n/10)%10;  //获取十位
//            int k=n/100;       //获取百位
//            //判断是否为水仙花数
//            if((i*i*i+j*j*j+k*k*k)==n){
//                System.out.println(n+"");
//            }
//            n++;
//        }while(n<1000);
//    }
//}