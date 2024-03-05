
public class MainPilha <T> {
    public static void main(String[] args) throws MyException {
     
        Pilha<Integer> pilha = new Pilha<Integer>(10);
    
        System.out.println(pilha.isEmpty()); //retornar true
        pilha.push(1);
        System.out.println(pilha.peek()); //retorna 1
        System.out.println(pilha.isFull()); //retorna false
        pilha.push(2);
        System.out.println(pilha.peek()); //retorna 2
        System.out.println(pilha.isEmpty()); //retorna false
        System.out.println(pilha.isFull()); //retorna true (se o size for 2)
        System.out.println(pilha.pop()); //retorna o 2


    }

}
