package Questao1;

import Exception.MyException;

public class Pilha<T> {

    private int size;
    private int topo;
    private T[] array;

    @SuppressWarnings("unchecked")
    public Pilha(int size){
        this.size = size;
        this.topo = -1;
        this.array = (T[]) new Object[size];
    }

    public boolean isEmpty(){
        if (topo == -1) {
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if (topo == size) {
            return true;
        }
        return false;
    }

    public T peek(){
        if (isEmpty()) {
            System.out.println("Pilha está vazia. Nao dá pra retornar nada.");
            return null;
        }
        return array[topo];
    }

    public T pop(){
        if (isEmpty()) {
            System.out.println("Pilha vazia. Nada a retirar.");
            return null;
        }

        T controle = array[topo];
        topo--;
        return controle;

    }

    public T push(T novo) throws MyException{
        if (novo.equals(null)) {
            throw new MyException("Não foi possível adicionar este elemento a pilha.");
        } else if (isFull()) {
            throw new MyException("Essa pilha está cheia.");
        }

        topo++;
        array[topo] = novo;
        return array[topo];
    }

}
