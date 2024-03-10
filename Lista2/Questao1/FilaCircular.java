public class FilaCircular<T> {

    private int size;
    private T[] array;
    private int first;
    private int last;

    public FilaCircular(int size){
        this.size = size;
        this.array = (T[]) new Object[size];
        this.first = -1;
        this.last = -1;
    }

    public boolean add(T elemento) {
        int temp = (last + 1)%size;

        if (isEmpty()) {
            first++;
            last++;
            this.array[first] = elemento;
            return true;
        } else if (temp == first) {
            System.out.println("Fila cheia.");
            return false;
        } else {
            last = temp;
            array[last] = elemento;
            return true;
        }
    }

    public boolean isEmpty(){
        if (first == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull(){
        int temp = (last + 1) % size;
        if (temp == first) {
            return true;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public T remove() throws MyException {
        if (first == -1) {
            throw new MyException("Fila vazia.");
        }

        T retorno = array[first];
        if (first == last) {
            first = -1;
            last = -1;
        }
        else
        {
            first =(first + 1) % size;
        }
        return retorno;
    }
}
