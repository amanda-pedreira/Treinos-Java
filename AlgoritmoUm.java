/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmoum;

import java.util.Scanner;

/**
 *
 * @author amanda.lpedreira
 */
public class AlgoritmoUm {
    
    

    public static void main(String[] args) {
        
        // Scanner é um objeto
        Scanner entrada = new Scanner(System.in);
        String nomeAluno;
        float n1, n2, n3, media;
        
        System.out.println("Calcule a média");        
        System.out.println("Digite seu nome: ");
        // O que vem depois do ponto é uma função
        nomeAluno = entrada.next(); // o next pega texto
        
        System.out.println("Nota 1: ");
        n1 = entrada.nextFloat(); 
        
        System.out.println("Nota 2: ");
        n2 = entrada.nextFloat(); 
        
        System.out.println("Nota 3: ");
        n3 = entrada.nextFloat(); 
        
        media = (n1 + n2 + n3)/3;
        
        
        System.out.println(nomeAluno + ", a sua média é : " + media);   
        
        
              

        
    }
}
