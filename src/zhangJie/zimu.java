package zhangJie;

/**
 * Author:GXY
 * Date:2024/1/1
 * Package:zhangJie
 */
public class zimu {
    public static void main(String[] args){
//        输出小写的a-z以及大写的Z-A
        for (char i = 97;i<=122;i++){
            System.out.print(i+" ");
        }
        System.out.println("\t");

        for (char i = 90;i>=65;i--){
            System.out.print(i+" ");
        }
        System.out.println("\t");
        for (char j ='a';j<='z';j++){
            System.out.print(j+" ");
        }
        System.out.println("\t");
        for (char k ='Z';k>='A';k--){
            System.out.print(k+" ");
        }
    }
}
