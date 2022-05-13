package model;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	private Empresa empresa;

	public Funcionario(String nome, double salario, String cpf, Empresa emp) {
		this.nome=nome;
		this.salario=salario;
		this.cpf=cpf;
		this.empresa= emp;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public Funcionario(String nome) {
		this.nome=nome;

	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		if (salario >0)
			this.salario = salario;
	}
	@Override
	public String toString(){
		return getNome() + "  " + getSalario()+"  " +getCpf() + " " +getEmpresa().getNome();


	}
}


