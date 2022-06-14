package view;

import java.util.*;
import java.text.*;

import model.*;

public class Main {

	private static final Docente New = null;

	public static void main(String[] args) {

		// Docente dados (String cpf,String siape, String nome, String dataAdmissao, int
		// titulo, String area,double salarioBase)

		Rh rh = new Rh("rh", null);

		String cpf;
		String siape;
		String nome;
		String dataAdm;
		int titulo;
		String area;
		double salarioBase;
		String dataFim;
		String setor;
		String endereco;

		Scanner sc = new Scanner(System.in);

		int operador;

		do {
			System.out.println("");

			System.out.println("Selecione as Seguintes opcoes:");
			System.out.println("1: Registrar um novo funcionario ");
			System.out.println("2: Procurar um funcionario");
			System.out.println("3: Listar Todos Funcionários");
			System.out.println("4: Listar Funcionarios por Classificação: ");
			System.out.println("5: Sair e encerrar");

			operador = sc.nextInt();

			switch (operador) {
			case 1:
				System.out.println("Digite 1: para Inserir Docente:");
				System.out.println("Digite 2: para Inserir Tecnico ");
				System.out.printf("Digite 3: Para inserir Tercerizado");
				int tipo = sc.nextInt();

				switch (tipo) {
				case 1:
					sc.nextLine();

					System.out.println("Insira o cpf: ");
					cpf = sc.nextLine();

					System.out.println("Insira o Siape: ");
					siape = sc.nextLine();

					System.out.println("Insira o nome: ");
					nome = sc.nextLine();
					
					System.out.println("Insira o endereco: ");
					endereco = sc.nextLine();
					
					System.out.println("Insira data de Admissao:");
					dataAdm = sc.nextLine();

					System.out.println("Escolha o Titulo: 1 = Professor, 2 = Mestre, 3= Doutor");
					titulo = sc.nextInt();
					sc.nextLine();

					System.out.println("\nInsira a Area de Atuação: ");
					area = sc.nextLine();

					System.out.println("Insira o Salario Base: ");
					salarioBase = sc.nextDouble();

					Funcionarios d = new Docente(cpf, siape, nome,endereco, dataAdm, titulo, area, salarioBase);
					rh.adicionaFuncionario(d);

					break;
				case 2:
					sc.nextLine();

					// (String cpf,String siape, String nome, String dataAdmissao, int titulo,
					// String setor,double salarioBase)

					System.out.println("Insira o cpf: ");
					cpf = sc.nextLine();

					System.out.println("Insira o Siape: ");
					siape = sc.nextLine();

					System.out.println("Insira o nome: ");
					nome = sc.nextLine();
					
					System.out.println("Insira o endereco: ");
					endereco = sc.nextLine();

					System.out.println("Insira data de Admissao:");
					dataAdm = sc.nextLine();

					System.out.println("Escolha o Titulo: 1 = Professor, 2 = Mestre, 3= Doutor");
					titulo = sc.nextInt();
					sc.nextLine();

					System.out.println("\nInsira o Setor: ");
					setor = sc.nextLine();

					System.out.println("Insira o Salario Base: ");
					salarioBase = sc.nextDouble();

					Funcionarios t = new Tecnico(cpf, siape, nome,endereco, dataAdm, titulo, setor, salarioBase);
					rh.adicionaFuncionario(t);

					break;
				case 3:
					sc.nextLine();

					System.out.println("Insira o cpf: ");
					cpf = sc.nextLine();

					System.out.println("Insira o nome: ");
					nome = sc.nextLine();
					
					System.out.println("Insira o endereco: ");
					endereco = sc.nextLine();

					System.out.println("Insira data de Admissao:");
					dataAdm = sc.nextLine();

					System.out.println("Insira data do Fim do contrato");
					dataFim = sc.nextLine();

					System.out.println("Escolha o Titulo: 1 = Professor, 2 = Mestre, 3= Doutor");
					titulo = sc.nextInt();
					sc.nextLine();

					System.out.println("\nInsira a Area de Atuação: ");
					area = sc.nextLine();

					System.out.println("Insira o Salario Base: ");
					salarioBase = sc.nextDouble();

					Funcionarios tr = new Terceirizado(cpf, nome,endereco, dataAdm, dataFim, titulo, area, salarioBase);
					rh.adicionaFuncionario(tr);

				}
				break;
			case 2:
				sc.nextLine();
				System.out.println("\nDigite o nome que deseja buscar: ");
				nome = sc.nextLine();
				rh.buscaFuncionario(nome);
				
				
				
				break;
			case 3:
				System.out.println("Listando Funcionarios: ");
				for (Funcionarios f : rh.getFuncionarios()) {
					System.out.println(f.toString());
				}
				break;
			case 4:

			}

		} while (operador != 5);

		sc.close();

	}
}
