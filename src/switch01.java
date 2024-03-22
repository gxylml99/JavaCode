import java.util.Scanner;

/**
 * Author:GXY
 * Date:2023/12/26
 * Package:PACKAGE_NAME
 */
public class switch01 {
    public static void main(String[] args) {
        Scanner MyGxy = new Scanner(System.in);
        System.out.println("输入月份");
        int month = MyGxy.nextInt();
        switch (month) {
            case 2:
            case 3:
            case 4:
                System.out.println("这个季节是春季！");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("这个季节是夏季！");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("这个季节是秋季！");
                break;
            case 11:
            case 12:
            case 1:
                System.out.println("这个季节是东季！");
                break;
            default:
                System.out.println("请输入正确的月份！");
        }
    }
}