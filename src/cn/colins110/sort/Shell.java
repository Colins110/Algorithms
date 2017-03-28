package cn.colins110.sort;

import java.util.Scanner;

/**希尔排序
 * Created by colin on 17-3-28.
 */
public class Shell {
    public static void sort (Comparable[] a)
    { //将a[]按升序排列
        int N=a.length;
        int h=1;
        while(h<N/3) h=3*h+1; //1,4,13,40,121,364,1093，... h为每次分段小数组的长度
        while(h>=1)
        { //将数组变为h有序
            for(int i=h;i<N;i++) //i初始为第一个小数组的第二个值的位置（0+h），i++则切换到下一个小数组
            { //将a[i]插入到a[i-h],a[i-2*h],a[i-3*h]...之中 既在宽度为h的数组上使用插入排序
                for(int j=i;j>=h&&less(a[j],a[j-h]);j-=h)
                    exch(a,j,j-h);
            }
            h=h/3;  //h递减到1，小数组大小减到1，整个数组排序完成
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
