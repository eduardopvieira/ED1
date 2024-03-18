package Questao6;

import Exception.MyException;
import Questao3.ListaSimples;

public class PilhaListaEncadeada<T> {
    
    private int topo;
    private ListaSimples<T> ls; 

    public PilhaListaEncadeada() {
        topo = -1;
        ls = new ListaSimples<>();
    }

    public void push (T data) {
        ls.addLast(data);
        topo++;
    }

    public T pop() throws MyException {
        if (isEmpty()) {
            throw new MyException("A pilha está vazia.");
        }
        topo--;
        return ls.removeLast();
    }

    public T peek() {
        return ls.peekLast();
    }


    public boolean isEmpty() {
        return ls.isEmpty();
    }
    
    
    public boolean isFull() {
        return false;
    }

}
