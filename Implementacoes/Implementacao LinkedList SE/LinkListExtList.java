package ImplementacaoLinkList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkListExtList<T> extends List<T> {

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
            size++;
        } else {
            novo.next = head;
            head.prev = novo;
            head = novo;
            size++;
        }
    }

    void addLastLL(T value){
        Node novo = new Node(value);
        if (isEmpty()) {
            novo = head;
            novo = tail;
            size++;
        } else {
            novo.prev = tail;
            tail.next = novo;
            tail = novo;
            size++;
        }
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


    T removeLastLL();



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
        return false;
    }

    //Nao precisa fazer
    @Override
    public Iterator<T> iterator() {
        return null;
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
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
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
    public boolean removeAll(Collection<?> c) {
        return false;
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
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
