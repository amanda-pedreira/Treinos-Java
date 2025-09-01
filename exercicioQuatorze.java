import java.util.Scanner;

public class ExercicioQuatorze
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    float num1, num2, maior, resultado;
	    
	    System.out.println("Número 1: ");
        num1 = scanner.nextFloat();
        
        System.out.println("Número 2: ");
        num2 = scanner.nextFloat();
        
        
        
        maior = Math.max(num1, num2);
        
        if (maior == num1){
            resultado = num1/num2;
            System.out.println("O maior número é o: " + num1 + " e divido por " + num2 + " fica igual a " + resultado);
        }else{
            resultado = num2/num1;
            System.out.println("O maior número é o: " + num2 + " e divido por " + num1 + " fica igual a " + resultado);
        }
        


	    
    }
}