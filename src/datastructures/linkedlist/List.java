package datastructures.linkedlist;

public interface List<T> {
    public void add(T object);

    public void add(int index, T object);

    public void remove(T object);

    public void remove(int index);

    public T get(int index);

    public int size();

    public int indexOf(T object);

    public boolean contains(T object);
}
