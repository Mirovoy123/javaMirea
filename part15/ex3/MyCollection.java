package part15.ex3;

import java.util.*;

public class MyCollection<T> extends AbstractList<T> {
    private int size;
    private T[] data;

    public MyCollection(int capacity) {
        if (capacity < 0)
            throw new IllegalArgumentException();
        data = (T[]) new Object[capacity];
    }

    public MyCollection() {
        this(1);
    }

    public void addCapacity(int newCapacity) {
        int current = data.length;
        if (newCapacity > current) {
            T[] newData = (T[]) new Object[newCapacity];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int indexOf(Object e) {
        for (int i = 0; i < size; i++)
            if (e== data[i])
                return i;
        return -1;
    }

    public boolean contains(Object e) {
        return indexOf(e) != -1;
    }

    public Object clone() {
        MyCollection<T> clone = null;
        try {
            clone = (MyCollection<T>) super.clone();
            clone.data = (T[]) data.clone();
        } catch (CloneNotSupportedException ignored) {
        }
        return clone;
    }

    public T get(int index) {
        checkBoundExclusive(index);
        return data[index];
    }

    public T set(int index, T e) {
        checkBoundExclusive(index);
        T result = data[index];
        data[index] = e;
        return result;
    }

    public boolean add(T e) {
        if (size == data.length)
            addCapacity(size + 1);
        data[size++] = e;
        return true;
    }

    public void add(int index, T e) {
        checkBoundInclusive(index);
        if (size == data.length)
            addCapacity(size + 1);
        if (index != size)
            System.arraycopy(data, index, data, index + 1, size - index);
        data[index] = e;
        size++;
    }

    public T remove(int index) {
        checkBoundExclusive(index);
        T r = data[index];
        if (index != --size)
            System.arraycopy(data, index + 1, data, index, size - index);
        data[size] = null;
        return r;
    }

    public void clear() {
        if (size > 0) {
            Arrays.fill(data, 0, size, null);
            size = 0;
        }
    }

    public boolean addAll(Collection<? extends T> c) {
        return addAll(size, c);
    }

    public boolean addAll(int index, Collection<? extends T> c) {
        checkBoundInclusive(index);
        Iterator<? extends T> itr = c.iterator();
        if (c.size() + size > data.length)
            addCapacity(size + c.size());
        int end = index + c.size();
        if (size > 0 && index != size)
            System.arraycopy(data, index, data, end, size - index);
        size += c.size();
        for (; index < end; index++)
            data[index] = itr.next();
        return c.size() > 0;
    }
    
    private void checkBoundInclusive(int index) {
        if (index > size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

    private void checkBoundExclusive(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

}
