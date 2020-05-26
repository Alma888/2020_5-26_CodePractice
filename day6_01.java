//计算糖果

//A,B,C三个人是好朋友,每个人手里都有一些糖果,我们不知道他们每个人手上具体有多少个糖果,但是我们知道
//以下的信息：
//A - B, B - C, A + B, B + C. 这四个数值.每个字母代表每个人所拥有的糖果数.
//现在需要通过这四个数值计算出每个人手里有多少个糖果,即A,B,C。这里保证最多只有一组整数A,B,C满足所
//有题设条件。
//输入描述：
//输入为一行，一共4个整数，分别为A - B，B - C，A + B，B + C，用空格隔开。 范围均在-30到30之间(闭区
//间)。
//输出描述：
//输出为一行，如果存在满足的整数A，B，C则按顺序输出A，B，C，用空格隔开，行末无空格。 如果不存在
//这样的整数A，B，C，则输出No
//示例1:
//输入
//1 -2 3 4
//输出
//2 1 3

//【题目解析】：
//这是2017网易秋招的笔试题原题，希望大家认真对待。谨记一点，这个题其实一点也不难，就是高中的方程
//求解问题，大家要慢慢培养自己将带背景故事的问题转化为抽象的数学或者逻辑问题能力。
//【解题思路】：
//这道题目的实质是：判断三元一次方程组是否有解及求解。 把题目条件用方程式表示： A-B=Y1; B-C=Y2;
//A+B=Y3; B+C=Y4;
//用消元法求解： A=(Y1+Y3)/2; B=(Y3-Y1)/2=(Y2+Y4)/2; C=(Y4-Y2)/2; 由于题目给出的是整数，要求解也是整
//数，这个约束条件也需要注意下
import java.util.Scanner;

public class day6_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n1=sc.nextInt(); //A - B
            int n2=sc.nextInt(); //B - C
            int n3=sc.nextInt(); //A + B
            int n4=sc.nextInt(); //B + C

            ABC(n1,n2,n3,n4);
        }
    }

    private static void ABC(int n1, int n2, int n3, int n4) {
        int B=(n2+n4)/2;
        int A1=n1+B;
        int A2=(n1+n3)/2;
        int C=B-n2;
        if(A1!=A2){
            System.out.println("No");
        }else {
            System.out.println(A1 + " " + B + " " + C);
        }
    }
}
