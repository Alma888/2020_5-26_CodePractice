import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 题目：n个数里出现次数大于等于n/2的数
//方法二

//解题思路：
//将输入的一组数进行排序，排序后直接输出中间下标的数就是出现次数大于或等于数组大小一半
public class Main {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while(cin.hasNext()){
            list.add(cin.nextInt());
        }

        Collections.sort(list);

        System.out.println(list.get(list.size()/2-1));

    }
}