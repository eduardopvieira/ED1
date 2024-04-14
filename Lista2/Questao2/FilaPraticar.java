package Questao2;

import Exception.MyException;

public class FilaPraticar <T>{
    private int maxSize;
    private int first;
    private int last;
    private Object[] array;

    public FilaPraticar(int maxSize) {
        this.maxSize = maxSize;
        this.first = -1;
        this.last = -1;
        this.array = new Object[maxSize];
    }

    public void add (T data) throws MyException {
        if (isFull()) {
            throw new MyException("Fila cheia");
        }

        int lastTemp = (last + 1)%maxSize;
        last = lastTemp;
        array[last] = data;
        
        if (first == -1) {
            first = 0;
        }

    }
    
    @SuppressWarnings("unchecked")
    public T remove (T data) throws MyException {
        if (isEmpty()) {
            throw new MyException("A lista ja esta vazia");
        }

        T remover = (T)array[first];

        if (first == last) {
            
            first = -1;
            last = -1;

        } else {
            first = (first + 1) % maxSize;
        }

        return remover;

    }

    @SuppressWarnings("unchecked")
    public T peek() throws MyException {
        if (isEmpty()) {
            throw new MyException("A fila está vazia");
        }

        T retorno = (T) array[first];
        return retorno;
    }
    

    public boolean isFull() {
        if (((last + 1)%maxSize) == first) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (first == -1) {
            return true;
        }
        return false;
    }

    public void show() throws MyException {
        if (isEmpty()) {
            throw new MyException("A fila está vazia");
        }

        int i = first;

        while (i != last) {
            System.out.println(array[i]);
            i = (i + 1)%maxSize;
        } 
        
    }
}
