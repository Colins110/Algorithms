package cn.colins110.sort;

import java.util.Scanner;

/**插入排序
 * Created by colin on 17-3-28.
 */
public class Insertion {
    public static void sort(Comparable[] a)
    {
        int N=a.length;
        for(int i=1;i<N;i++)
        {
            //将a[i]插入到a[i-1],a[i-2],a[i-3]...之中
            for(int j=i;j>0&&less(a[j],a[j-1]);j--)
            {
                exch(a,j,j-1);
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
