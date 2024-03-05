import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {


    public static List<String> fizzBuzz (int n) {
              
        List<String> retorno = new ArrayList<>();
        String array[] = new String[n];
       
        for (int i = 1; i <= n; i++) {
            if (i%15 == 0) {
                array[i-1] = "FizzBuzz";
                retorno.add(array[i-1]); 
            } else if (i%5 == 0)  {
                array[i-1] = "Buzz";
                retorno.add(array[i-1]); 
            } else if (i%3 == 0) {
                array[i-1] = "Fizz";
                retorno.add(array[i-1]); 
            } else {
                array[i-1] = String.valueOf(i);
                retorno.add(array[i-1]); 
            }
        }
        return retorno;
    }


    public static void main(String[] args) {
        fizzBuzz(15);
    }
}

