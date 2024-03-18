package Questao4;

import Exception.MyException;

public class ListaDupla <T> {

    class Node {
        private T data;
        private Node next;
        private Node prev;

        public Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
        
    }

    private Node head;
    private Node tail;
    private int size;

    public ListaDupla() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public int getSize() {
        return size;
    }

    public T peekFirst() {
        return head.data;
    }

    public T peekLast() {
        return tail.data;
    }

    public void addFirst(T data) {
        Node novo = new Node(data);
        
        if (isEmpty()) 
        {
            head = novo;
            tail = novo;
        } 
        else 
        { 
            novo.next = head;
            head.prev = novo;
            head = novo;
        }

        size++;
    }

    public void addLast(T data) {
        Node novo = new Node(data);

        if (isEmpty()) 
        {
            head = novo;
            tail = novo;
        } 
        else 
        { 
            novo.prev = tail;
            tail.next = novo;
            tail = novo;
        }

        size++;

    }


    public T search (T crit) {
        Node p = head;
        while (p != null) {
            if (p.data == crit) {
               return p.data;
            }
            p = p.next;
        }
        return null;
    }

    public boolean addAfter(T data, T crit) throws MyException {
        
        T resultado = search(crit);

        if (resultado == null) {
            return false;
        }        

        Node p = head;
        Node novo = new Node(data);

        while (p.data != resultado) {
            p = p.next;
        }

        novo.next = p.next;
        p.next = novo;
        novo.prev = p;
        p = novo.next;
        p.prev = novo;
        size++;
        return true;

    }

    public T removeFirst() {
        
        Node tirar = head;
        
        if (size == 1) {
            head = null;
            tail = null;
            size = 0;
            return tirar.data;
        }

        Node novaHead = head.next;
        tirar.next = null;
        novaHead.prev = null;
        head = novaHead;
        size--;
        return tirar.data;

    }

    public T removeLast() {
        
        Node tirar = tail;

        if (size == 1) {
            head = null;
            tail = null;
            size = 0;
        } else {

            Node novaTail = tail.prev;

            tirar.prev =  null;
            novaTail.next = null;
            tail = novaTail;
            size--;
            
        }
        return tirar.data;
    }

    T remove(T crit) throws MyException{
        
        if (size == 1) {
            return removeFirst();
        } 
        
        else if (size == 0) {
            throw new MyException("Não tem nenhum elemento para ser removido");
        }

        T resultado = search(crit);
        if (resultado == null) {
            throw new MyException("Não tem esse valor na lista.");
        }

        Node p = head;
        while (p != resultado) {
            p = p.next;
        }

        if (p.next == null) {
            return removeLast();
        }

        Node antes = p.prev;
        Node prox = p.next;
        
        antes.next = prox;
        prox.prev = antes;
        p.next = null;
        p.prev = null;
        size--;
        return p.data;

    }

}