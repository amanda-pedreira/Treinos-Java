import java.util.Scanner;

public class ExercicioOnze
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    float numero;
	    
	    System.out.println("Digite um número: ");
        numero = scanner.nextFloat();
        

	    if (numero < 0){
            System.out.println("O numero " + numero + " é negativo.");
	    }else{
            System.out.println("O numero " + numero + " é positivo.");
	    }
    }
}