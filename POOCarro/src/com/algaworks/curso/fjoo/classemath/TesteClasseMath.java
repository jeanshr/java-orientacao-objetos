package com.algaworks.curso.fjoo.classemath;
import static java.lang.Math.PI;

public class TesteClasseMath {
	
	static final double pi = 3.1415;

	public static void main(String[] args) {
		
		//cumprimento de uma circunferencia
		int raio = 4;
		double comprimento = 2 * 4 * PI;
		
		System.out.println("comprimento: " + comprimento);
		
		//maximo e minimo
		
		double[] precosProdutoA = {30.20, 25.49};
		System.out.println("Maior preco: " + Math.max(precosProdutoA[0], precosProdutoA[1]));
		System.out.println("menor preço: " + Math.min(precosProdutoA[0], precosProdutoA[1]));
		
		//potencia
		System.out.println("2^3: " + Math.pow(2, 3));
		
		//raiz quadrada
		System.out.println("Raiz de 9: " + Math.sqrt(9));
		
		//arredondamento pra mais ou menos
		double n = 5.68;
				System.out.println("maior inteiro: " + Math.ceil(n)); //maior inteiro
				System.out.println("maior inteiro: " + Math.floor(n)); //menor inteiro
				System.out.println("Arrendondando: " + Math.round(n)); //de 5.5 pra cima sempre pra cima, de 5.4 pra bx sempre bx
				
		//trigonometria
		System.out.println("Seno: " + Math.sin(40)); 
		
		//numeros randomicos
		System.out.println("Randomicos/aleatorios: " + Math.random());
		System.out.println("Randomicos/aleatorios: " + Math.random() * 100);

	}

}
