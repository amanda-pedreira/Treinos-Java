import java.util.Scanner;

public class ExercicioDez
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    String nomeVendedor;
	    float salario, totalVenda, comissao, salarioFinal;
	    
	    System.out.println("Nome do vendedor: ");
        nomeVendedor = scanner.nextLine();
        
        System.out.println("Salário fixo: ");
        salario = scanner.nextFloat();

        System.out.println("Total acumulado em vendas (em valores): ");
        totalVenda = scanner.nextFloat();
        
        
        comissao = (totalVenda * 15)/100;
        salarioFinal = salario + comissao;
        
	    
        System.out.println("O vendedor " + nomeVendedor + " vai receber " + salarioFinal + " no dia do pagamento (salário fixo de " + salario + " e comissão por vendas de " + comissao + ").");
    }
}