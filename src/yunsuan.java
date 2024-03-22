/**
 * Author:GXY
 * Date:2023/12/26
 * Package:PACKAGE_NAME
 */
/*
  运算符操作                   在计算机运算的时候，都是以补码的方式来运算的.
 */

public class yunsuan {
    public static void main(String[] args) {
//        2的原码00000000 00000000 00000000 00000010
//        2的补码00000000 00000000 00000000 00000010
//        3的原码00000000 00000000 00000000 00000011
//        3的补码00000000 00000000 00000000 00000011
//        按位&  两位全为1，结果为1，否则为0
//        2的补码00000000 00000000 00000000 00000010
//        3的补码00000000 00000000 00000000 00000011
//         答案是00000000 00000000 00000000 00000010   ====2
        System.out.println(2 & 3);//2
//        -2的原码10000000 00000000 00000000 00000010
//        -2的反码11111111 11111111 11111111 11111101
//        -2的补码11111111 11111111 11111111 11111110
//        ~-2 0->1,1->0
//         答案是00000000 00000000 00000000 00000001  ====1
        System.out.println(~-2);//1
        //        2的原码00000000 00000000 00000000 00000010
        // ~2操作后为负值  11111111 11111111 11111111 11111101     运算后的补码
        //运算后的反码  负数的反码=负数的补码-1 11111111 11111111 11111111 11111100
        //运算后的原码 负数的反码=它的原码符号位不变，其它位取反(0->1,1->0)
        //原码为：10000000 00000000 00000000 00000011 ====-3
        System.out.println(~2);//-3

//        2的补码00000000 00000000 00000000 00000010
//        3的补码00000000 00000000 00000000 00000011
//  2|3 两位有一个为1，结果为1，否则为0 00000000 00000000 00000000 00000011 ====3
        System.out.println(2 | 3);//3
        System.out.println(2 ^ 3);//1
//        按位与&:  两位全为1，结果为1，否则为0
//        按位或|:两位有一个为1，结果为1，否则为0
//        按位异或^:两位一个为0，一个为1，结果为1，否则为0
//        按位取反~:0->1,1->0

        /*
        1 二进制的最高位是符号位：0表示正数，1表示负数（老韩口诀：0->0  1->-）
        2.正数的原码，反码，补码都一样（三码合一）
        3.负数的反码=它的原码符号位不变，其它位取反(0->1,1->0)
        4.负数的补码=它的反码+1，负数的反码=负数的补码-1
        5.0的反码，补码都是0
        6.java没有无符号数，换言之，java中的数都是有符号的
        7.在计算机运算的时候，都是以补码的方式来运算的.
        8.当我们看运算结果的时候，要看他的原码（重点）
         */
    }
}
