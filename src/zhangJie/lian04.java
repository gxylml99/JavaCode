package zhangJie;

/**
 * Author:GXY
 * Date:2023/12/31
 * Package:zhangJie
 */
public class lian04 {
    public static void main(String[] args) {
//        输出1-100之间的不能被5整除的数，每5个一行
        int count = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 5 != 0) {
                count++;
                System.out.print(i + "\t");
                if (count % 5 == 0) {
                        System.out.println("嘿嘿");
                }

            }

        }
    }
}
