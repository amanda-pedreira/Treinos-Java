import java.util.Scanner;

public class ExercicioCinco
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    float valorLado, resultadoLado;
	    
	    System.out.println("Valor do lado do quadrado: ");
        valorLado = scanner.nextFloat();
        
        
        resultadoLado = valorLado * valorLado;
	    
	System.out.println("A área do quadro de lado " + valorLado + " é " + resultadoLado);
	}
}