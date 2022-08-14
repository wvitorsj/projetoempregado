
public class Empregado {
	
	//DECLARAR ATRIBUTOS
	private String nome;
	private double salario;
	
	//METODO CONSTRUTOR
	public Empregado(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	
	//MÉTODOS GETTERS E SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//METODOS DO BUSINESS PROPRIAMENTE DITOS
	public String exibir() {
		return this.nome + " R$" + this.salario;
	}
	
	public void aumentarSalario(double percentual) {
		this.salario += this.salario * percentual / 100;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
