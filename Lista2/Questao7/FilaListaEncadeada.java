package Questao7;

import Exception.MyException;
import Questao3.ListaSimples;

public class FilaListaEncadeada<T> {
    
    private int size;
    private int quantity;
    private ListaSimples<T> fila;

    public FilaListaEncadeada(int size) {
        this.size = size;
        this.quantity = 0;
        fila = new ListaSimples<>();
    }

    void add (T valor) throws MyException {
        if (isFull()) {
            throw new MyException("Fila cheia");
        }
        fila.addLast(valor);
        quantity++;

    }

    public T remove() throws MyException {
        if (isEmpty()) {
            throw new MyException("Fila vazia.");
        }

        T returnValue = fila.removeFirst();
        quantity--;
        return returnValue;
    }

    public T peek() throws MyException {
        if (isEmpty()) {
            throw new MyException("Fila está vaiza.");
        }

        return fila.peekFirst();

    }

    public boolean isEmpty() {
        return fila.isEmpty();
    }

    public boolean isFull() {
        
        if (size == quantity) {
            return true;
        }
        return false;
    }

}
