package Questao8;

import java.util.Scanner;

import Exception.MyException;
import Questao1.Pilha;

public class ExpPosFixa {
    
    

    public static void main(String[] args) throws MyException {
        Pilha<Integer> pilha = new Pilha<Integer>(20);
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        String[] arrayValores = entrada.split("\\s+");
        operacoes(pilha, arrayValores);
        sc.close();
    }

    public static void operacoes(Pilha<Integer> pilha, String[] arrayValores) throws NumberFormatException, MyException {
        int resultado;
        for (String valor : arrayValores) 
        {
            if (isInt(valor)) 
            {
                pilha.push(Integer.parseInt(valor));
            } 
            else
            {                
                int num2 = pilha.pop();
                int num1 = pilha.pop();

                switch (valor) 
                {
                    case "+":
                        resultado = num1 + num2;
                        pilha.push(resultado);
                        break;

                    case "-":
                        resultado = num1 - num2;
                        pilha.push(resultado);
                        break;
                }  
            }
        }
        System.out.println(pilha.peek()); //mostrando o elemento do topo
    }


    public static boolean isInt(String data) throws MyException{
        try {
            Integer.parseInt(data);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
        

    }

}
