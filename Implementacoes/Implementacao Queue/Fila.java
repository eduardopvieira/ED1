package ImplementacaoFila;

import Exception.MyException;

public class Fila<T> implements InterfaceFila<T> {

    private int inicio;
    private int fim;
    private int size;
    private T[] array; 

    @SuppressWarnings("unchecked")
    public Fila(int tamanho) {
        this.inicio = -1;
        this.fim = -1;
        this.size = tamanho;
        array = (T[]) new Object[tamanho];

    }


    @Override
    public void add(T number) throws MyException {
        
        if (isFull()) {
            throw new MyException("fila lotada");
        }

        fim = (fim + 1) % size;
        array[fim] = number;

        if (fim == -1) {
            fim = 0;
        }

    }

    @Override
    public T remove() throws MyException {
        
        int f = (fim + 1) % size;

        if (isEmpty()) {
            throw new MyException("Fila ja esta vazia");
        }

        T retorno = array[inicio];

        if (f == inicio) {
            inicio = -1;
            fim = -1;
        } else {
            inicio = (inicio+1)%size;
        }
        return retorno;

    }

    @Override
    public T peek() throws MyException {
        if (isEmpty()) {
            throw new MyException("A fila esta vazia");
        }        
        return array[inicio];
    }

    @Override
    public boolean isEmpty() { //correto
        if (inicio == -1 && fim == -1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isFull() { //correto
        int f = (fim+1) % size;
        if (f == inicio) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void show() {

        if (fim == -1) {
            return;
        }

        int f = (fim + 1)%size;        

        for (int i = inicio; i != f; i++) {
            if (i == (size-1)) {
                i = 0;
            }
            System.out.println(array[i]);
        }   
    }
}
