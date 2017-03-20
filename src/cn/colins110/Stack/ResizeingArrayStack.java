package cn.colins110.Stack;

import java.util.Iterator;

/**
 * Created by colin on 2017/3/20 0020.
 */
public class ResizeingArrayStack<Item> {
    private Item[] a;
    private int N;
    public ResizeingArrayStack(int cap)
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
        if(N==a.length) resize(2*N);  //数组大小不够，扩容
        a[N++]=item;
    }
    public Item pop()
    {
        //从栈顶删除元素
        Item temp=a[--N];
        a[N]=null; //避免对象游离（保留一个不需要的对象），使垃圾回收机制自动回收弹出元素所占用的内存
        if(N>0&&N==a.length/4)  //数组太大，缩小
            resize(a.length/2);
        return temp;
    }
    private void resize(int max)  //私有函数：扩容
    {
        Item [] temp=(Item[]) new Object[max];
        for(int i=0;i<a.length;i++)
        {
            temp[i]=a[i];
        }
        a=temp;
    }

    //内部类实现迭代器
    private class ReverseArrayIterator implements Iterator<Item> {
        private int i = N;  //堆栈，后进先出，从后往前迭代！

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            return a[--i];
        }

        @Override
        public void remove() {

        }
    }
}
