package cn.colins110.Stack;

/**
 * Created by colin on 2017/3/20 0020.
 */
public class FixedCapacityStack<Item> {
    private Item[] a;
    private int N;
    public FixedCapacityStack(int cap)
    {
        a=(Item[]) new Object[cap];
        N=0;
    }
    public boolean isEmpty()
    {
        return N==0;
    }
    public int size()
    {
        return N;
    }
    public void push(Item item)
    {
        a[N++]=item;
    }
    public Item pop()
    {
        return a[--N];
    }
}
