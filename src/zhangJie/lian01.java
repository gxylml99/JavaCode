package zhangJie;

/**
 * Author:GXY
 * Date:2023/12/30
 * Package:zhangJie
 */
public class lian01 {
    public static void main(String[] args) {
//        1.编程实现如下功能
//        先自己做，再听老师评讲，这样学习有效果
//        某人有100,000元，每经过一次路口，需要交费，规则如下：
//        1)当现金>50000时，每次交5%
//        2)当现金<=50000时，每次交1000
//        编程计算该人可以经过多少次路口，要求：使用while break方式完成
        double money = 100000;
        int i = 0;
        while (true) {
            if (money > 50000) {
                money = money - money * 0.05;
                i++;
            } else if (money >= 1000 ) {
                money = money - 1000;
                i++;
            }else {
                break;
            }
        }
        System.out.println("还有"+money+"钱"+"\n"+"可以过"+i+"次");
    }
}
