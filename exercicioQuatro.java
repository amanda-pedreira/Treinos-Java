import java.util.Scanner;

public class ExercicioQuatro
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    float num1, num2, resultadoUm, resultadoDois;
	    
	    System.out.println("Número 1: ");
        num1 = scanner.nextFloat();
        
        System.out.println("Número 2: ");
        num2 = scanner.nextFloat();
        
        resultadoUm = num1 + 1;
        resultadoDois = num2 + 1;
	    
	System.out.println("Os números consecutivos são: " + resultadoUm + " e " + resultadoDois);
	}
}