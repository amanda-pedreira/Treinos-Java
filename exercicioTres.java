import java.util.Scanner;

public class ExercicioTres
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    float num1, num2, quadrado1, quadrado2, soma;
	    
	    System.out.println("Número 1: ");
        num1 = scanner.nextFloat();
        
        System.out.println("Número 2: ");
        num2 = scanner.nextFloat();
        
	    quadrado1 = num1 * num1;
	    quadrado2 = num2 * num2;
	    soma = quadrado1 + quadrado2;
	    
		System.out.println("O quadrado do número 1 é: " + quadrado1 + " e o quadrado do número 2 é: " + quadrado2 + ". A soma de ambos é: " + soma );
	}
}