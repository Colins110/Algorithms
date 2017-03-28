package cn.colins110.sort;

import java.util.Scanner;

/**自顶向下的归并排序
 * Created by colin on 17-3-28.
 */
public class Merge {
    private static Comparable[] aux;    //归并所需辅助数组
    public static void sort (Comparable[] a)
    {
        aux=new Comparable[a.length];   //一次性分配空间
        sort(a,0,a.length-1);

    }
    private static void sort(Comparable[] a,int lo,int hi)
    {   //将数组a[lo]到a[hi]排序
        if(hi<=lo) return;
        int mid=(lo+hi)/2;
        sort(a,lo,mid);                 //将左半边排序
        sort(a,mid+1,hi);           //将右半边排序
        merge(a,lo,mid,hi);             //归并结果
    }
    private static void merge(Comparable[] a,int lo,int mid,int hi)
    {   //将a[lo...mid]和a[mid+1...hi]归并
        int i=lo,j=mid+1;
        for(int k=lo;k<=hi;k++)
        {
            aux[k]=a[k];                //将a[lo...hi]复制到aux[lo...hi]
        }
        for(int k=lo;k<=hi;k++)
        {
            if (i>mid) a[k]=aux[j++];
            else if (j>hi) a[k]=aux[i++];
            else if(less(aux[j],aux[i])) a[k]=aux[j++];
            else a[k]=aux[i++];
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
