package ImplementacaoLinkList;

public class LinkList<T> implements LLInterface<T> {
    private Node head;
    private Node tail;
    private int size;

    public LinkList() {
        head = null;
        tail = null;
        size = 0;
    }

    class Node 
    {
        T data;
        Node next;

        public Node (T data) {
            this.data = data;
            this.next = null;
        }
    }
//============================================================
    @Override
    public void addFirst(T value) {

        Node novaHead = new Node(value);

        if (head == null) {
            head = novaHead;
            tail = novaHead;

        } else {

            novaHead.next = head;
            head = novaHead;
        
        }
        size++;    
    }

    @Override
    public void addLast(T value) {
        
        Node novo = new Node(value);

        if (tail == null) {    
            tail = novo;
            head = novo;
            size++;
        } else {
        
            tail.next = novo;
            tail = novo;
            size++;
        }

    }

    @Override
    public boolean addAfter(T dado, T crit) {

        Node p = searchNode(crit);
        if (p == null) {
            System.out.println("Esse elemento nao esta na linked list.");
            return false;
        } else {
            Node novo = new Node(dado);

            if (p.next == null) {
                addLast(dado);
            }

            novo.next = p.next;
            p.next = novo;
            size++;
            return true;
        }





    }

    @Override
    public boolean addPos(T dado, int pos) {
        Node p = new Node(dado);
        Node pivo = head;

        for (int i = 0; i < pos; i++) {
            pivo = pivo.next;
        }
        p.next = pivo.next;
        pivo.next = p;
        size++;
        return true;
    }

    @Override
    public int getSize() {
        return(size);
    }

    @Override
    public boolean isEmpty() {
        if (head == null && tail == null) {
            return true;
        }
        return false;
    }

    @Override
    public T peekFirst() {
        if (head == null) {
            System.out.println("Lista vazia!!");
            return null;
        } else {
            return head.data;
        }
    }

    @Override
    public T peekLast() {
        if (isEmpty()) {
            System.out.println("Lista vazia!!");
            return null;
        } else {
            return head.data;
        }
    }

    @Override
    public T search(T crit) {
       Node busca = searchNode(crit);
       if (busca == null) {
            System.out.println("Nao foi possivel encontrar");
            return null;
       } else {
            return busca.data;
       }
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
    public T getPos(int pos)  {
        Node p = head;

        if (pos > size) {
            System.out.println("Posicao maior que o tamanho da lista");
            System.out.println("exception aqui (linha 162 +-)");
            return null;
        }

        for (int i = 0; i < pos; i++) {
            p = p.next;
        }
        return p.data;
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) {
            System.out.println("Lista vazia!!");
            //exceçao aq, tirar o return null
            return null;
        } else {
            Node p = head;
            if (head == tail) {
                System.out.println("Removido unico elemento na lista.");
                head = null;
                tail = null;
                return p.data;
            } else {
                head = p.next;
                p.next = null;
                size--;
                return p.data;
            }
        }
    }

    @Override
    public T removeLast() {
        Node p = head;
        
        if (isEmpty()) {
            System.out.println("Lista vazia.");
            //fazer uma exceção aqui, tirar o return null
            return null;
        } else {
            if (head == tail) {
                System.out.println("Removido unico elemento na lista.");
                head = null;
                tail = null;
                size--;
                return p.data;
            } else {
                Node retorno = tail;        
                
                while (p.next != tail) {
                p = p.next;
                }

                p.next = null;
                tail = p;
                size--;
                return retorno.data;
            }

        }

        
    }

    @Override
    public T remove(T crit) {
        //CASO ESTEJA VAZIA
        if (isEmpty()) {
            System.out.println("Lista vazia.");
            //TODO tirar o null e botar uma exceção
            return null;
        } else {

            //CASO SO TENHA UM ELEMENTO NA LISTA
            if (head == tail) {
                Node retorno = head;
                head = null;
                tail = null;
                size--;
                return retorno.data;    

            } else {

                Node p = head;
                Node elementoRemovido;
                
                //CASO SEJA O PRIMEIRO ELEMENTO:
                if (p.data == crit) {
                    return removeFirst();
                }

                //CASO ELEMENTO A SER REMOVIDO ESTEJA NO MEIO
                while (p.next != crit) {
                    p = p.next;
                }
                
                //CASO ELEMENTO A SER REMOVIDO NAO ESTEJA NA LISTA
                if (p.next == null) {
                    System.out.println("Elemento não foi encontrado.");
                    //TODO colocar uma exception aqui, tirar o return null
                    return null;
                }
                
                elementoRemovido = p.next;  //Elemento a ser removido é o elemento depois de p
                
                //CASO ELEMENTO A SER REMOVIDO SEJA O ULTIMO
                if (elementoRemovido.next == null) {
                    return removeLast();
                }

                p.next = elementoRemovido.next; //p.next é igual ao p.next do proximo elemento
                elementoRemovido.next = null; //
                size--;
                return elementoRemovido.data;
                
            }
        }
    }



    @Override
    public void show() {
        Node p = head;
        
        if (p == null) {
            System.out.println("lista vazia.");
        }

        while (p != null) {
            System.out.println("dado: " + p.data + " | proximo: " + p.next);
            p = p.next;
        }

    }

    @Override
    public void showReverse() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showReverse'");
    }
}
