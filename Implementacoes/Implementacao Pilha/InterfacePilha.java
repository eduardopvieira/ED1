

public interface InterfacePilha<T> {
    void push(T number) throws MyException;

    T pop() throws MyException;

    T peek() throws MyException;

    boolean isEmpty();
    boolean isFull();
}
