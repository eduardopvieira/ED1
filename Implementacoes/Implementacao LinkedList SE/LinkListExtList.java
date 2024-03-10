package ImplementacaoLinkList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import ImplementacaoLinkList.MyException;

public class LinkListExtList<T> implements List<T> {

    class Node {
        private Node next;
        private Node prev;
        private T data;

        public Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LinkListExtList(){
        this.size = 0;
        this.head = null;
        this.tail = null;
    }


//MÉTODOS DA LINKED LIST======================================================================================================
    void addFirstLL(T value) {
        Node novo = new Node(value);
        if (isEmpty()) {
            novo = head;
            novo = tail;
        } else {
            novo.next = head;
            head.prev = novo;
            head = novo;
        }
        size++;
    }

    void addLastLL(T value){
        Node novo = new Node(value);
        if (isEmpty()) {
            novo = head;
            novo = tail;
        } else {
            novo.prev = tail;
            tail.next = novo;
            tail = novo;
        }
        size++;
    };

    T peekFirst() {
        return head.data;
    };
    T peekLast() {
        return tail.data;
    };

    T removeFirstLL() {
        if (isEmpty())
        {
            System.out.println("Linked List vazia.");
            return null;
        }
        else if (head == tail)
        {
            Node p = head;
            head = null;
            tail = null;
            size--;
            return p.data;
        } else
        {

            Node p = head;
            Node novaHead = head.next;
            novaHead.prev = null;
            p.next = null;
            head = novaHead;
            size--;
            return p.data;

        }

    }


    T removeLastLL() {
        if (isEmpty()) {
            System.out.println("Linked List vazia.");
            return null;
        } else {
            if (head == tail) {
                Node p = head;
                head = null;
                tail = null;
                size--;
                return p.data;
            } else {
                Node p = tail.prev;
                p.next = null;
                p = tail;
                tail = p.prev;
                p.prev = null;
                size--;
                return p.data;
            }
        }
    }



//MÉTODOS DA LIST========================================================================================================
    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean contains(Object o) {
        Node p = head;
        while (p != tail) {
            p = p.next;
            if (p.data == o) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        addLastLL(t);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (contains(o) == false) {
            System.out.println("Objeto não está na lista.");
            return false;
        } else if (head == tail && head.data == o) {
            head.next = null;
            tail.prev = null;
            head = null;
            tail = null;
            size--;
            return true;
        }

        Node p = head;
        while (p.data != o) {
            p = p.next;
        }

        Node p2 = p.next;
        Node p0 = p.prev;

        p.next = null;
        p.prev = null;
        p0.next = p2;
        p2.prev = p0;
        size--;
        return true;

    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) throws MyException {
        if (contains(c) == false) {
            throw new MyException("Não há nenhuma ocorrêncai desse valor na lista.");
        }

        Node p = head;
        while (p.next != null) {
            if (p.data == c) {
                remove(c);
            }
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
    }

    @Override
    public boolean equals(Object o) {
        if (this != o) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public T get(int index) {
        Node p = head;
        for (int i = 0; i < index; i++) {
            if (p.next == null) {
                System.out.println("Não existe nenhum elemento no seu indice.");
                return null;
            }
            p = p.next;
        }
        return p.data;
    }

    @Override
    public T set(int index, T element) {
        Node p = head;

        for (int i = 0; i < index; i++) {
            if (p.next == null) {
                System.out.println("Não existe nenhum elemento no seu indice.");
                return null;
            }
            p = p.next;
        }
        p.data = element;

        return p.data;
    }

    @Override
    public void add(int index, T element) {
        if (index == 0) {
            addFirstLL(element);
        }

        Node p = head;

        for (int i = 0; i < index; i++) {
            if (p.next == null) {
                addLastLL(element);
            }
            p = p.next;
        }
        Node novoElemento = new Node(element);
        novoElemento.next = p.next;
        p.next = novoElemento;
        novoElemento.prev = p;
        p = novoElemento.next;
        p.prev = novoElemento;
        size++;
    }

    @Override
    public T remove(int index) {
        Node p = head;

        if (index == 0)
        {
            removeFirstLL();
        }
        else if (index == size)
        {
            removeLastLL();
        }

        for (int i = 0; i < index; i++) {
            if (p.next == null) {
                System.out.println("Não existe nenhum elemento no seu indice.");
                return null;
            }
            p = p.next;
        }
        Node pivo = p.next;
        pivo.prev = p.prev;
        pivo = p.prev;
        pivo.next = p.next;
        p.next = null;
        p.prev = null;
        size--;
        return p.data;
    }

    @Override
    public int indexOf(Object o) throws MyException{
        if (contains(o) == false) {
            throw new MyException("Esse elemento nao esta na lista.");
        }

        int contador = 0;
        Node p = head;
        while (p.data != o) {
            p = p.next;
            contador++;
        }
        return contador;
    }

    @Override
    public int lastIndexOf(Object o) throws MyException{
        if(contains(o) == false) {
            throw new MyException("Esse elemento nao existe na lista.");
        }

        int contador = 0;
        int lastOccurence = 0;
        Node p = head;

        while (p.next != null) {
            p = p.next;
            contador++;
            if (p.data == o) {
                lastOccurence = contador;
            }
        }
        return lastOccurence;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    //Nao precisa fazer
    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

}
