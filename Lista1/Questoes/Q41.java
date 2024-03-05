import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Q41 {
    //==================================================== Lists ===================================================
    List<Integer> arrayListInt = new ArrayList<>(); 
    //Um array que pode crescer e diminuir de tamanho automaticamente. Recomendado para programas onde não se sabe o tamanho da lista.
    //Desvantagem: Percorrer um arraylist é um processo de complexidade O(n), tendo que percorrer elemento por elemento.

    
    List<Integer> vectorInt = new Vector<>();
    //Parecido com arraylists, mas é mais seguro para threads. Além disso, ele sempre dobra de tamanho ao chegar na capacidade maxima. Recomendado usar quando usa threads.
    //Desvantagem: É mais lento que o arraylist e linkedlist, pois é sincronizado.

    List<Integer> linkedListInt = new LinkedList<>();
    //Lista duplamente encadeada. É mais eficiente para adicionar e remover elementos do que o arraylist. Recomendado para programas onde a lista é alterada frequentemente e em qualquer lugar.
    //Desvantagem: Percorrer uma Linked List é um processo mais demorado, pois nao é indexado, tendo que percorrer elemento por elemento.

    //Velocidade: ArrayList > LinkedList > Vector

    //==================================================== Sets ====================================================

    Set<String> hashSet = new HashSet<>();
    //Conjunto de elementos que não se repetem. Não garante a ordem dos elementos. Bom em casos onde a ordem não importa. Usado para armazenar informações que nao podem ter duplicatas
    //Desvantagem: Não garante a ordem dos elementos.


    Set<String> linkedHashSet = new LinkedHashSet<>();
    //Conjunto de elementos que não se repetem. Mantém a ordem dos elementos. Bom em casos onde a ordem importa. Pode ser usado em registros de transações.
    //Desvantagem: Mais lento que o HashSet.

    Set<Integer> treeSet = new TreeSet<>();
    //Conjunto de elementos que não se repetem. Mantém a ordem dos elementos e é mais rápido que o LinkedHashSet. Usado em ordenação de elementos.
    //Desvantagem: Mais lento que o HashSet.

    //Velocidade: HashSet > TreeSet > LinkedHashSet


    //==================================================== Queue ===================================================

    Queue<Integer> priorityQueue = new PriorityQueue<>();
    //Fila de prioridade. Os elementos são ordenados de acordo com a ordem natural ou por um comparador fornecido no momento da construção. Usado para execução de tarefas com base em prioridade
    //Desvantagem: Mais lento que o LinkedList.

    Queue<Integer> linkedListQueue = new LinkedList<>();
    //Fila de elementos. Funciona de forma parecida com a LinkedList, mas é mais lenta. Usado na implementação de filas como sistema de atendimento ao cliente.
    //Desvantagem: Mais lento que o LinkedList, mesmo que os dois funcionem de forma parecida.

    //Velocidade: PriorityQueue > LinkedList

    //==================================================== Deque ===================================================

    Deque<Integer> arrayDeque = new ArrayDeque<>();
    //Fila de elementos que permite a inserção e remoção de elementos no início e no fim da fila. Usado na implementação de filas onde podem ser inseridos elementos tanto no inicio quanto no fim
    //Desvantagem: Mais lento que o LinkedList.

    //===================================================== Map ====================================================
    Map<String, Integer> hashMap = new HashMap<>();
    //Mapa de chaves e valores. Não garante a ordem dos elementos. Comumente usado para armazenar pares de chaves e valores, como ID de usuários e suas outras informaçoes.
    //Desvantagem: Não garante a ordem dos elementos.

    Map<String, Integer> linkedHashMap = new HashMap<>();
    //Mapa de chaves e valores. Mantém a ordem dos elementos. Comumente usado para registros de transações onde a ordem é importante.
    //Desvantagem: Mais lento que o HashMap.

    Map<String, Integer> treeMap = new HashMap<>();
    //Mapa de chaves e valores. Mantém a ordem dos elementos e é mais rápido que o LinkedHashMap. Usado quando é necessário ordenar os elementos de alguma forma.
    //Desvantagem: Mais lento que o HashMap.

    //Velocidade: HashMap > TreeMap > LinkedHashMap

}
