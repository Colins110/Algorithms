package cn.colins110.Queue;

import java.util.Iterator;

/**
 * Created by colin on 2017/3/21 0021.
 */
public class Queue<Item> /*implements Iterable<Item>*/{
    private class Node
    {
        Item item;
        Node next;
    }
    private Node first;
    private Node last;
    private int N;
    public boolean isEmpty()
    {
        return first==null;
    }
    public int size()   {return N;}
    public void enqueue(Item item) //向表尾增加元素
    {
        Node oldlast=last;
        last=new Node();
        last.item=item;
        last.next=null;
        if(isEmpty())
            first=last;
        else
            oldlast.next=last;
        N++;
    }
    public Item dequeue() //从表头删除数据
    {
        Item item=first.item;
        first=first.next;
        if(isEmpty()) last=null;
        N--;
        return item;
    }
    /*
    @Override
    public Iterator<Item> iterator() {
        return null;
    }*/
}
