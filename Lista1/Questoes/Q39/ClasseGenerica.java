package Q39;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenerica <T> {
    

    List <T> lista = new ArrayList<>();

    public ClasseGenerica () {}

  
    public void create(T atributo) {
        lista.add(atributo);
    }

    public List<T> read() {
        return lista;
    }

    public void update(T atributo, int index) {
        lista.set(index, atributo);
    }

    public void delete(T atributo) {
        System.out.println(atributo + " deletado com sucesso.");
        lista.remove(atributo);
    }
}
