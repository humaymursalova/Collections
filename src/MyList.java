public interface MyList<E> {
    void add(E element);

    void add(int index, E element);

    int size();

    boolean contains(Object o);

    E get(int index);

    E get(E element);

    void remove(int index);

    void remove(E element);

    String toString();


}