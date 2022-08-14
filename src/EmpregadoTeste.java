import java.util.Scanner;

public class EmpregadoTeste {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		Empregado e1, e2;
		
		String nome1, nome2;
		double salario1, salario2;
		
		//ENTRADA DE DADOS PELO USUARIO		
		System.out.print("Digite o nome do funcionário: ");
		nome1 = read.nextLine();
		System.out.print("Informe o salário do funcionário: ");
		salario1 = Double.parseDouble(read.nextLine());
		
		System.out.print("Digite o nome do funcionário: ");
		nome2 = read.nextLine();
		System.out.print("Informe o salário do funcionário: ");
		salario2 = Double.parseDouble(read.nextLine()); 
		
		e1 = new Empregado(nome1, salario1);
		e2 = new Empregado(nome2, salario2);
		
		//ANTES DO REAJUSTE
		System.out.println("------Informações originais--------");
		System.out.println(e1.exibir());
		System.out.println(e2.exibir());
		
		e1.aumentarSalario(10);
		e2.aumentarSalario(100);
		
		System.out.println("----------Informações pós Reajuste----------");
		System.out.println(e1.exibir());
		System.out.println(e2.exibir());
		
		
		read.close();
	}

}
