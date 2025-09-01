import java.util.Scanner;

public class ExercicioDois
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    float base, expoente;
	    double potencia;
	    
	    System.out.println("Número base: ");
        base = scanner.nextFloat();
        
        System.out.println("Número expoente: ");
        expoente = scanner.nextFloat();
        
        potencia = Math.pow(base, expoente);
	    
		System.out.println("O resultado de " + base + " elevado a " + expoente + " é: " + potencia);
	}
}