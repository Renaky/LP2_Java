package model;



public class Terceirizado extends Funcionarios {
	private String area;
	double bonus=0;
	private String fimContrato;

	public Terceirizado(String cpf, String nome, String dataAdmissao,String fimContrato, int titulo, String area,double salarioBase) {
		
		super(cpf, nome, dataAdmissao, titulo, salarioBase);
		this.setArea(area);
		this.fimContrato=fimContrato;

		
		

	if(titulo == 1) {
		bonus = 0;
	}
	if(titulo ==2) {
		bonus = 500;
	}
	if(titulo==3 ) {
		bonus = 1000;
	}


	}
	
	public String getFimContrato() {
		return fimContrato;
	}

	public void setFimContrato(String fimContrato) {
		this.fimContrato = fimContrato;
	}

	@Override
	public double calculaSalario() {
		return getSalarioBase() + (bonus);
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	
}