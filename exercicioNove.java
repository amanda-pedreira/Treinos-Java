import java.util.Scanner;

public class ExercicioNove
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    float numCadastro, horasTrabalho, salarioHora, salarioDia, salarioMes;
	    
	    System.out.println("Número do Cadastro: ");
        numCadastro = scanner.nextFloat();
        
        System.out.println("Horas que trabalha por dia: ");
        horasTrabalho = scanner.nextFloat();

        System.out.println("Salário por hora: ");
        salarioHora = scanner.nextFloat();
        
        
        salarioDia = horasTrabalho * salarioHora;
        salarioMes = salarioDia * 22;
        
	    
	System.out.println("O funcionário com cadastro " + numCadastro + " recebe um salário diário de R$" + salarioDia + ". E um salário mensal em torno de R$" + salarioMes + " (considerando 22 dias trabalhados)");
	}
}