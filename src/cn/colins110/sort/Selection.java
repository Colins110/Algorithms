package cn.colins110.sort;

import java.util.Objects;
import java.util.Scanner;

/**选择排序
 * Created by colin on 17-3-27.
 */
public class Selection {
    public static void sort (Comparable[] a )
    {
        //将a[]按升序排列
        int N =a.length;
        for(int i=0;i<N;i++)
        {
            //将a[i]a[i+1....N]中最小的元素交换
            int min=i;
            for(int j=i+1;j<N;j++)
            {
                if(less(a[j],a[min])) min=j; //找到最小值的位置
                exch(a,i,min);
            }
        }
    }

    private static void exch(Comparable[] a, int i, int min) {
        Comparable t=a[i];
        a[i]=a[min];
        a[min]=t;
    }
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w)<0;
    }
    public static boolean isSorted(Comparable[] a)
    {
        for (int i=1;i<a.length;i++)
        {
            if (less(a[i],a[i-1])) return false;
        }
        return true;
    }
    public static void show(Comparable[] a)
    {
        System.out.println("[ ");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
    }
}
