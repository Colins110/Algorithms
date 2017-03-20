package cn.colins110.Stack;

/**
 * Created by colin on 2017/3/20 0020.
 */
public class FixedCapacityStackofStrings {
    private String[] a;
    private int N;
    public FixedCapacityStackofStrings(int cap)
    {
        a=new String[cap];
        N=0;
    }
    public boolean isEmpty() {return N==0;}
    public int size() {return N;}
    public void push(String item)
    {
        a[N++]=item;
    }
    public String pop()
    {
        return a[--N];
    }
}
