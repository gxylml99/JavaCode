package zhangJie;

import java.util.Scanner;

/**
 * Author:GXY
 * Date:2023/12/30
 * Package:zhangJie
 */
public class lian02 {
    public static void main(String[] args) {
//        2.实现判断一个整数，属于哪个范围：大于0；小于0；等于0 Homework02java
//        3.判断一个年份是否为闰年Homework03.java
//        4.判断一个整数是否是水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方
//        和等于其本身。例如：153=1*1*1+3*3*3+5*5*5
//        Homework04.java
        Scanner myInt = new Scanner(System.in);
        System.out.println("输入数字");
        int a = myInt.nextInt();
        if (a > 0) {
            System.out.println("该" + a + "大于0");
        } else if (a < 0) {
            System.out.println("该" + a + "小于0");
        }
        else {
            System.out.println("该"+a+"等于0");

        }
    }
}
