package ImplementacaoLinkList;

public class LinkListDuplaEncadeada<T> implements LLInterface<T> {

    class Node
    {
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

    public LinkListDuplaEncadeada() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public void addFirst(T value) {
        Node p = new Node(value);
        head.prev = p;
        p.next = head;
        head = p;
        size++;
    }

    @Override
    public void addLast(T value) {
        Node p = new Node(value);
        tail.next = p;
        p.prev = tail;
        tail = p;
        size++;
    }

    @Override
    public boolean addAfter(T dado, T crit) {
        return false;
    }

    @Override
    public boolean addPos(T dado, int pos) {
        return false;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    @Override
    public T peekFirst() {
        return head.data;
    }

    @Override
    public T peekLast() {
        return tail.data;
    }

    @Override
    public T search(T crit) {
        return null;
    }

    @Override
    public T getPos(int pos) {
        Node p = head;
        for (int i = 0; i < pos; i++) {
            p = p.next;
        }
        return p.data;
    }

    @Override
    public T removeFirst() {
        Node h = head;
        Node p = head.next;
        h.next = null;
        p.prev = null;
        head = p;
        size--;
        return h.data;
    }

    @Override
    public T removeLast() {
        Node t = tail;
        Node p = tail.prev;

        if (isEmpty()) {
            System.out.println("Lista vazia.");
            return null;
        } else if (head == tail) {
            tail = null;
            head = null;
            size--;
            return t.data;
        }

        p.next = null;
        t.prev = null;
        tail = p;
        size--;
        return t.data;
    }

    public Node searchNode(T crit) {
        Node p = head;
        while (p != null) {
            if (p.data.equals(crit)) {
                return p;
            }
            p = p.next;
        }
        return null;
    }


    @Override
    public T remove(T crit) {
        Node p = (searchNode(crit));

        if (p == null)
        {
            System.out.println("Nao existe esse elemento");
            return null;
        }

        if (head == tail) {
            System.out.println("remoçao de unico elemento");
            Node h = head;
            head = null;
            tail = null;
            return head.data;
        } else if (p == head) {
            removeFirst();
        } else if (p == tail) {
            removeLast();
        }

        Node antes = p.prev;
        Node depois = p.next;

        antes.next = depois;
        depois.prev = antes;
        p.next = null;
        p.prev = null;
        size--;
        return p.data;
    }

    @Override
    public void show() {

    }

    @Override
    public void showReverse() {

    }
}
