package cn.colins110.Bag;

import java.util.Iterator;

/**
 * Created by colin on 2017/3/22 0022.
 */
public class Bag<Item> implements Iterable<Item> {
    private class Node{
        Item item;
        Node next;
    }
    private Node first;
    private int N;
    public boolean isEmpty()
    {
        return first==null;
    }
    public int size()
    {
        return N;
    }
    public void add(Item item)
    {
        Node oldfirst=first;
        first=new Node();
        first.item=item;
        first.next=oldfirst;
    }
    private class BagIterator implements Iterator<Item>
    {
        private Node current =first;
        @Override
        public boolean hasNext() {
            return current !=null;
        }

        @Override
        public Item next() {
            Item temp= current.item;
            current = current.next;
            return temp;
        }

        @Override
        public void remove() {
        }
    }

    @Override
    public Iterator<Item> iterator() {
        return new BagIterator();
    }

    public static void main(String[] args) {
        System.out.println("test");
    }
}
