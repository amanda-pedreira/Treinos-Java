import java.util.Scanner;

public class ExercicioOito
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    float num1, num2, num3, num4, resultado;
	    
	    System.out.println("Número 1: ");
        num1 = scanner.nextFloat();
        
        System.out.println("Número 2: ");
        num2 = scanner.nextFloat();

        System.out.println("Número 3: ");
        num3 = scanner.nextFloat();
        
        System.out.println("Número 4: ");
        num4 = scanner.nextFloat();
        
        resultado = (num1 + num2 + num3 + num4)/4;
        
	    
	System.out.println("A média aritmetica é: " + resultado);
	}
}