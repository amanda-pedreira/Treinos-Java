
package com.mycompany.imc;
import java.util.Scanner;

/**
 *
 * @author amanda pedreira. emilly marqueti, isabele souto
 */
public class Imc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float altura, peso, massa;
        
        System.out.println("Peso:");      
        peso = input.nextFloat(); 
        System.out.println("Altura:");      
        altura = input.nextFloat(); 
        
        massa = peso/(altura * altura);
        
        if (massa < 26){
            System.out.println("Normal (" + massa + ")"); 
        }else if((massa >= 26) && (massa < 30)){
            System.out.println("Obeso (" + massa + ")"); 
        }else if(massa >= 30){
            System.out.println("Obeso Mórbido (" + massa + ")"); 
        }
    }
}
