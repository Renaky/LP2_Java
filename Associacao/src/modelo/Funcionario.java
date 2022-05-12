package modelo;

import java.util.List;

public class Funcionario {
	private String nome;
	private double salario;
	private Departamento departamento;
	
	public Funcionario(String nome,double salario, Departamento dpto) {
		
		this.nome=nome;
		this.salario=salario;
		this.departamento= dpto;
		
	}
	
	public String getNome() {
		return this.nome;
	}
	public double getSalario() {
		return this.salario;
		
	}
	public Departamento getDepartamento() {
		return this.departamento;
	}
	@Override
    public String toString(){
        return getNome() + "  " + getSalario()+"  " +getDepartamento().getDescricao();

}
}
