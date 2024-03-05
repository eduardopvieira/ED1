

public class Pilha<T> implements InterfacePilha<T> {

    private int size;
    private int topo;
    private T[] array;


    @SuppressWarnings("unchecked")
    public Pilha(int size){
        this.size = size;
        this.topo = -1;
        this.array = ((T[]) new Object[size]);
    }

    @Override
    public boolean isEmpty() {
        if (topo == -1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        if (topo == (size-1)) {
            return true;
        }
        return false;
    }

    @Override
    public T peek() throws MyException {
        if (isEmpty() == true) {
            throw new MyException("Pilha está vazia. Nada a retornar");
        }
        return array[topo];
    }

    @Override
    public T pop() throws MyException {
        if (isEmpty() == true) {
            throw new MyException("Pilha vazia. Não dá pra tirar nada.");
        }

        T pivo = array[topo];
        topo--;
        return pivo;

    }

    @Override
    public void push(T elemento) throws MyException {
        if (isFull() == true) {
            throw new MyException("Pilha está lotada. Tire algum elemento.");
        }
        else {
            topo++;
            array[topo] = elemento;
        }   
    }
}
