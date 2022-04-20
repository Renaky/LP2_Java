package leitor;
import java.math.*;
import java.util.Scanner;

public class Leitor {
	
	private static int tamVetor;
	

	public int gettamVetor() {
		return tamVetor;
	}

	public void settamVetor(int tamVetor) {
		this.tamVetor = tamVetor;
	}
	
	public int i;
	
	public void criaVetor() {
		System.out.println("tamVetor : "+tamVetor);
		Scanner sc = new Scanner(System.in);
		int v[] = new int[tamVetor];
		 int []vpar = new int [tamVetor];
	     int []vimpar = new int [tamVetor];
		
		for (i=0; i<tamVetor; i++) {
		      System.out.printf("Informe %2do. valor de %d: ", (i+1), tamVetor);
		      v[i] = sc.nextInt();
		    }
		
		System.out.printf("\n");
	    for (i=0; i<tamVetor; i++) {
	      
	            System.out.printf("v[%d] = %2d\n", i, v[i]);
	            
	            if (v[i] % 2 ==0 ) {
	                vpar[i]= v[i];
	            }
	            else {
	                vimpar[i]= v[i];
	            }

	             }
	      
	        
	        System.out.println("\nO vetor de números pares é: ");
	        for (i=0; i<vpar.length; i++) {
	            System.out.println (vpar[i]);
	        }
	        System.out.println("\nO vetor de números ímpares é: ");
	        for (i=0; i<vimpar.length; i++){
	            System.out.println(vimpar[i]);
	            
	    }
	//fim criavetor

	     
			
			int soma = 0;
		    int menor = v[0]; // v[0] = 1o. valor armazenador no vetor "v"
		    int maior = v[0];
		    for (i=0; i<tamVetor; i++) {
		      soma = soma + v[i];

		      if (v[i] < menor)
		         menor = v[i];

		      if (v[i] > maior)
		         maior = v[i];
		    }
			 System.out.printf("\n");
			    for (i=0; i<tamVetor; i++) {
			      if (v[i] == menor)
			        System.out.printf("v[%d] = %2d <--- menor valor\n", i, v[i]);
			      else if (v[i] == maior)
			              System.out.printf("v[%d] = %2d <--- maior valor\n", i, v[i]);
			           else System.out.printf("v[%d] = %2d\n", i, v[i]);
			    }

			    System.out.printf("\nSoma = %d\n", soma);
			    double media=0;
			    media = soma/tamVetor;
			    System.out.println("A média aritmética é: "+media);
			    
			    
			    
		
		}

		    
}

