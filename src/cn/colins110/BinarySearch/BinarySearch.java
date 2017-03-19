package cn.colins110.BinarySearch;

/**
 * Created by colin on 2017/3/19 0019.
 */
public class BinarySearch {
    public static int rank(int key, int[] a)
    {
        int lo=0;
        int hi=a.length-1;
        while (lo<= hi)
        {
            int mid=(lo+hi)/2;
            if(a[mid]<key) lo=mid;
            else if(a[mid]>key) hi=mid;
            else return mid;
        }
        return -1;
    }
}
