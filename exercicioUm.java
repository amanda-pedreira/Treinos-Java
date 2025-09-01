import java.util.Scanner;

public class ExercicioUm
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    float num1, num2, multiplicar;
	    
	    System.out.println("Número 1: ");
        num1 = scanner.nextFloat();
        
        System.out.println("Número 2: ");
        num2 = scanner.nextFloat();
        
	    multiplicar = num1 * num2;
	    
		System.out.println("A multiplicação entre o número " + num1 + " e o número " + num2 + " é: " + multiplicar);
	}
}