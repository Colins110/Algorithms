package cn.colins110.sort;

import java.util.concurrent.Exchanger;

/**
 * 快速排序
 * Created by colin on 2017/4/3 0003.
 */
public class Quick {
    public static void sort(Comparable[] a)
    {
        sort(a,0,a.length-1);
    }
    private static void sort(Comparable[] a,int lo,int hi)
    {
        if(hi<=lo) return;
        int j=partition(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        //将数组切分为a[lo...i-1],a[i],a[i+1...hi]
        int i=lo,j=hi+1; //左右扫描指针
        Comparable v=a[lo];
        while (true)
        {
            //扫描左右，检查扫描是否结束并交换元素
            while(less(a[++i],v)) if(i==hi) break;
            while(less(v,a[--j])) if(j==lo) break;
            if(i>=j) break;
            exch(a,i,j);
        }
        exch(a,lo,j);
        return j;
    }
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w)<0;
    }
    private static void exch(Comparable[] a, int i, int min) {
        Comparable t=a[i];
        a[i]=a[min];
        a[min]=t;
    }
}
