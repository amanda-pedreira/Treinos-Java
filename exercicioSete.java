import java.util.Scanner;

public class ExercicioSete
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    float ladoA, ladoB, resultadoHipotenusa;
	    
	    System.out.println("Valor do lado A: ");
        ladoA = scanner.nextFloat();
        
        System.out.println("Valor do lado B: ");
        ladoB = scanner.nextFloat();
        
        resultadoHipotenusa = (ladoA * ladoA) + (ladoB * ladoB);
        
	    
	System.out.println("A hipotenusa do triangulo é: " + resultadoHipotenusa);
	}
}