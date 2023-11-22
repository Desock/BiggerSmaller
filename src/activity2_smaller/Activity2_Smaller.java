package activity2_smaller;

import java.util.Scanner;
/* En este programa el problema estaba en una serie de variables mal declaradas y una variable llamada "medio"
que nunca se iba a leer. Corrigiendo esos errores, hemos visto que habia un "if" statement que sobraba por 
completo. Ese "if" que era el 3er bloque de "if" que habia en el codigo, lo que hacia era realizar otra comprobacion
entre 2 de las variables, entonces, lo que hemos hecho ha sido eliminarla y ya el programa hace lo que pide el 
ejercicio. */

public class Activity2_Smaller {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program can give you the biggest and smallest number of three");
        System.out.println("Write a number");
        int variable_1 = scanner.nextInt();
        
        System.out.println("Write another number");
        int variable_2 = scanner.nextInt();
        
        
        System.out.println("Write the third number");
        int variable_3 = scanner.nextInt();
        int small;
        
        
        if(variable_1 > variable_2 && variable_1 > variable_3){
            int big = variable_1;
            if(variable_2 > variable_3){
            
                small = variable_3;
                }else{
                    
                small = variable_3;
                }
            System.out.println("The biggest number is " + big + " The smallest number is:" + small );            
        }
        
        if(variable_2 > variable_1 && variable_2 > variable_3){
            int big= variable_2;
            if(variable_1 > variable_3){
                    
            small = variable_3;
                }else{
                
            
                small = variable_1;
            }
            System.out.println("The biggest number is " + big + "The smallest number is:" + small);        
            
        }
    }    
}