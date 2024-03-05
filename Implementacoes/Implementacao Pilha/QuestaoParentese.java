

public class QuestaoParentese<T> {

    
    public static void main (String[] args) throws MyException {
        
        String frase = "())";
        System.out.println(isValid(frase));
        
    }

    public static boolean isValid(String frase) throws MyException {

        Pilha<Character> pilha = new Pilha<Character>(10);
        char[] charArray = frase.toCharArray();

        if (charArray[0] == ')') {
            return false;
        }

        for (int i = 0; i < frase.length(); i++) {
            char c = charArray[i];

            switch (c) {
                case '(':
                    pilha.push(c);
                    break;
                case ')':
                    if (pilha.isEmpty() == true) {
                        return false;
                    }
                    pilha.pop();
                    break;
                default: break;
            }
        }
        return pilha.isEmpty();
    }
    
}
