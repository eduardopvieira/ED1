package Questao3;

import Exception.MyException;

public class ListaSimples<T> {

    class Node {
        private Node next;
        private T data;

        public Node(T data) {
            next = null;
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public ListaSimples() {
        head = null;
        tail = null;
        size = 0;
    }

//=====================================Métodos==================================================

    public void addFirst(T data) {
        Node p = new Node(data);
        
        if (head == null) {
            head = p;
            tail = p;
        } else{
            p.next = head;
            head = p;
        }
        size++;
    }

    public void addLast(T data) {
        Node p = new Node(data);
        
        if (head == null) {
            head = p;
            tail = p;
        } else {
            tail.next = p;
            tail = p;
        }
        size++;
    }

    public boolean addAfter(T data, T crit) 
    {
        Node p = head;
        while (p != null) 
        {
            if (p.data.equals(crit)) 
            {
                Node newNode = new Node(data);
                newNode.next = p.next;
                p.next = newNode;
                if (p == tail) 
                { 
                    addLast(data);
                }
                return true; // Indica que o valor foi adicionado após o critério
            }
            p = p.next;
        }
        return false; // Retorna falso se o critério não for encontrado
    }
    

    public T peekFirst() {
        return head.data;
    }
    
    public T peekLast() {
        return tail.data;
    }
    
    public T search(T crit) throws MyException{
        Node p = head;

        while (p != null) {
            if (p.data.equals(crit)) {
                return p.data;
            }
        }
        throw new MyException("Elemento nao encontrado.");
    }
    
    public T removeFirst() throws MyException
    {
        if (isEmpty()) 
        {
            throw new MyException("A lista já está vazia.");
        }

        Node removing = head;
        head = removing.next;
        removing.next = null;
        size--;
        return removing.data; 
    };

    public T removeLast() throws MyException
    {
        
        if (isEmpty()) {
            throw new MyException("A lista já está vazia.");
        }

        Node p = head;

        if (head == tail) {
            head = null;
            tail = null;
            size--;
            return p.data;
        }
        
        
        while (p.next != tail) 
        {
            p = p.next;
        }
        
        p.next = null;
        T retorno = tail.data;
        tail = p;
        size--;
        return retorno;

    };


    public T remove(T crit) throws MyException {
        
        if (isEmpty()) { //se ta vazio
            throw new MyException("Lista está vazia.");
        }

        if (search(crit) == null) { //se n achou
            throw new MyException("Valor não encontrado.");
        }
    
        if (head.data.equals(crit)) // se for o primeiro
        { 
            return removeFirst();
        }
        
        Node p = head;
        Node prev = null;
        
        while (p != null) {
            if (p.data.equals(crit)) {
                if (p == tail) // se for o último
                { 
                    return removeLast();
                } 
                else // se estiver no meio
                { 
                    prev.next = p.next;
                    p.next = null;
                    size--;
                    return p.data;
                }
            }
            prev = p;
            p = p.next;
        }
        throw new MyException("Valor nao encontrado.");
    }
    
    public boolean isEmpty(){
        if (head == null) {
            return true;
        }
        return false;
    }

    public void show() {
        Node p = head;
        while (p != null) {
            System.out.println(p.data);
            p = p.next;
        }
    }

}
