

package com.mycompany.aulacondicionais;
import java.util.Scanner;
/**
 *
 * @author amanda pedreira, isabele souto
 */
public class AulaCondicionais {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String nome;
        int faltas, recuperacao;
        float n1, n2, n3, media, notaRecuperacao;
        
        System.out.println("*-- Calcula Media --*");
        System.out.println("Aluno: ");
        nome = input.next();
        System.out.println("N1: ");
        n1 = input.nextFloat();
        System.out.println("N2: ");
        n2 = input.nextFloat();
        System.out.println("N3: ");
        n3 = input.nextFloat();
        System.out.println("Quantidade de faltas: ");
        faltas = input.nextInt();
        media = (n1+n2+n3)/3;
        
        System.out.println("A média é " + media);
        System.out.println("Faltas: " + faltas);
        
        if((media >= 6) && (faltas <= 18)){
            System.out.println("Aprovado!");
        }else if ((media >= 6) && (faltas > 18)){
            System.out.println("Reprovado por falta!");
        }else if ((media < 6) && (faltas <= 18)){
            System.out.println("Reprovado por nota! Coloque a nota da prova de recuperação:");
            recuperacao = input.nextInt();
            notaRecuperacao = (n1 + n2 + n3 + recuperacao)/4;
            if (notaRecuperacao >= 6){
                System.out.println("Com a prova de recuperação, o aluno foi aprovado!");                
            }else{
                System.out.println("Mesmo com a prova de recuperação, o aluno foi reprovado!");  
            }
        }else{
            System.out.println("Reprovado por nota e falta!");            
        }
        
        
    }
}
