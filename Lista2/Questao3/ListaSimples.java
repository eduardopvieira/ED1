package Questao3;

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
    
    public T search(T crit) {
        Node p = head;
        while (p.data != crit) {
            if (p.data.equals(crit)) {
                System.out.println("Valor nao encontrado.");
                return null;
            }
            p = p.next;
        }
        System.out.println("Valor encontrado.");
        return p.data;
    }
    
    public T removeFirst() 
    {
        Node removing = head;
        head = removing.next;
        removing.next = null;
        return removing.data; 
    };

    public T removeLast() {
        
        if (isEmpty()) {
            System.out.println("Lista vazia!");
            return null;
        }
        
        Node p = head;
        while (p.next != tail) {
            p = p.next;
        }
        p.next = null;
        T retorno = tail.data;
        tail = p;
        size--;
        return retorno;

    };


    public T remove(T crit) {
        Node p = head;
        Node prev = null;
    
        if (search(crit) == null) {
            System.out.println("Nao existe esse valor");
            return null;
        }
    
        if (head.data.equals(crit)) { // se for o primeiro
            return removeFirst();
        } else {            
            while (p != null && !p.data.equals(crit)) {
                prev = p;
                p = p.next;
            }
            if (p == null) { // se o valor não foi encontrado
                System.out.println("Valor nao encontrado na lista");
                return null;
            } else if (p == tail) { // se for o último
                return removeLast();
            } else { // se estiver no meio
                prev.next = p.next;
                return p.data;
            }
        }
    }


    
    public boolean isEmpty(){
        if (head == null) {
            return true;
        }
        return false;
    }


}
