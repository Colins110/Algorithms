package cn.colins110.LinkedList;

import java.util.Iterator;

/**
 * Created by colin on 2017/3/21 0021.
 */
public class Stack<Item> implements Iterable<Item>
 {

    private Node first;
    private int N;
    private class Node
    {
     Item item;
     Node next;
    }
    public boolean isEmpty()
    {
        return first==null;
    }
    public int size()   {return N;}
    public void push(Item item)
    {
        Node oldfirst = first;
        first=new Node();
        first.item=item;
        first.next=oldfirst;
        N++;
    }
    public Item pop()
    {
        Item item=first.item;
        first=first.next;
        N--;
        return item;
    }
    @Override
    public Iterator<Item> iterator() {
        return new LinkedListiterator();
    }
    private class LinkedListiterator implements Iterator<Item>
    {
        private Node current=first;
        @Override
        public boolean hasNext() {
            return first!=null;
        }

        @Override
        public Item next() {
            Item temp=current.item;
            current=current.next;
            return temp;
        }

        @Override
        public void remove() {
        }
    }
}
