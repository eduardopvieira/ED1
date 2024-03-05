package Q39;
public class Q39 {

    public static void main(String[] args) {

        ClasseGenerica<String> classe = new ClasseGenerica<String>();
        //create:
        classe.create("ola");
        classe.create("bom dia");
        //read:
        System.out.println(classe.read());
        //update:
        classe.update("oi", 0);
        //delete:
        classe.delete("bom dia");

        System.out.println(classe.read());

    }
}
