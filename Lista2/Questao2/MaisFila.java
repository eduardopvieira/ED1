package Questao2;

import javax.print.DocFlavor.INPUT_STREAM;

import Exception.MyException;

public class MaisFila <T> {
    private int size;
    private int first;
    private int last;
    private Object[] array;

    public MaisFila(int tamanho) {
        this.size = tamanho;
        this.first = -1;
        this.last = -1;
        array = new Object[tamanho];
    }

    public void add(T value) throws MyException{
        
        if (isFull()) {
            throw new MyException("A fila está cheia");
        }

        if (isEmpty()) {
            first++;
            last++;
            array[last] = value;
        } else {
            last = (last + 1)%size;
            array[last] = value;
            System.out.println("Adicionado o elemento " + value);
        }
    }

    @SuppressWarnings("unchecked")
    public T peek() throws MyException{
        if (isEmpty()) {
            throw new MyException("A fila está vazia");
        }
        T retorno = (T) array[first];
        return retorno;
    }

    @SuppressWarnings("unchecked")
    public T remove() throws MyException{
        if (isEmpty()) {
            throw new MyException("A fila está vazia.");
        }

        T retorno = (T) array[first];

        if (first == last) {
            first = -1;
            last = -1;
        } else {
            first = (first + 1)%size;
        }

        return retorno;
    }

    public boolean isEmpty(){
        if (first == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull(){
        int lastTemp = (last + 1) % size;
        if (first == lastTemp) {
            return true;
        }
        return false;
    }

    public void show() throws MyException {
        if (isEmpty()) {
           System.out.println("fila vazia");
        } 

        int i = first;
        while (i != last) {
            System.out.println(array[i]);
            i = (i + 1)%size;
        }
    }
}
