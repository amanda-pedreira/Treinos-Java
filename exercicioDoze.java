import java.util.Scanner;

public class ExercicioDoze
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    float ladoQuadrado, raioCirculo;
	    double areaQuadrado, areaCirculo;
	    
	    System.out.println("Lado quadrado: ");
        ladoQuadrado = scanner.nextFloat();
        
        System.out.println("Raio círculo: ");
        raioCirculo = scanner.nextFloat();
        
        areaQuadrado = ladoQuadrado * ladoQuadrado;
        areaCirculo = (raioCirculo * raioCirculo ) * 3.14;
        
	    if (areaQuadrado < areaCirculo){
            System.out.println("A área do círculo é maior!");
	    }else{
            System.out.println("A área do quadrado é maior!");
	    }
    }
}