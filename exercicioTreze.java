import java.util.Scanner;

public class ExercicioTreze
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    float num1, num2, num3, maior;
	    
	    System.out.println("Número 1: ");
        num1 = scanner.nextFloat();
        
        System.out.println("Número 2: ");
        num2 = scanner.nextFloat();
        
        System.out.println("Número 3: ");
        num3 = scanner.nextFloat();
        
        
        maior = Math.max(num1, Math.max(num2, num3));
        
        if (maior == num1){
            System.out.println("O maior é o primeiro número! (" + maior + ")");
        }else if (maior == num2){
            System.out.println("O maior é o segundo número! (" + maior + ")");
        }else{
            System.out.println("O maior é o terceiro número! (" + maior + ")");
        }
        


	    
    }
}