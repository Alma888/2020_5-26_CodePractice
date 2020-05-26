//标题:  n个数里出现次数大于等于n/2的数
//      输入n个整数，输出出现次数大于等于数组长度一半的数。
//    【输入描述】
//          每个测试输入包含 n个空格分割的n个整数，n不超过100，其中有一个整
//          数出现次数大于等于n/2。
//    【输出描述】
//          输出出现次数大于等于n/2的数。
//    【示例1】输入  3 9 3 2 5 6 7 3 2 3 3 3
//                    输出   3

//【题目解析】：
//这道题目看上去在考数学相关问题，但是通过前几天的训练，
// 相信大家一眼就能看出来这道题其实还是考察你的String类用的6不6.
// 刷过<<剑指 offer>>的童鞋相信对这道题目不会陌生，没错就是原题！
//【解题思路】：
//关键方法：
//str.split(" "):按照空格切分字符串
//Integer.valueOf(str):将数字字符串转为int
import java.util.Scanner;

//方法一：
public class day6_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String[] str = sc.nextLine().split(" ");
            int[] arr=new int[str.length];
            for(int i=0;i<str.length;i++){
                arr[i] = Integer.valueOf(str[i]);
            }
            int num = arr[0];
            int count =1;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] == num) {
                    count++;
                } else if (count > 0) {
                    count--;
                } else {
                    num = arr[j];
                }
            }
                System.out.println(num);
            }
        }
    }

