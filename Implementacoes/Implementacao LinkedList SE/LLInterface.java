package ImplementacaoLinkList;

public interface LLInterface<T> {
    
    void addFirst(T value);
    void addLast(T value);
    boolean addAfter (T dado, T crit);
    boolean addPos(T dado, int pos);

    int getSize();
    boolean isEmpty();
    T peekFirst();
    T peekLast();

    T search(T crit);
    T getPos (int pos);

    T removeFirst();
    T removeLast();
    T remove (T crit);


    //Opcionais:
    void show();
    void showReverse();

}