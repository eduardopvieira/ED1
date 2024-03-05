package ImplementacaoFila;

import Exception.MyException;


public interface InterfaceFila <T>{
    void add(T number) throws MyException;
    
    T remove() throws MyException;

    T peek() throws MyException;

    boolean isEmpty();

    boolean isFull();

    void show();
    
}
