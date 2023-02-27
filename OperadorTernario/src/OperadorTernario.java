
public class OperadorTernario {

	public static void main(String[] args) {
		
		Integer idade = 20;
		Boolean podeDirigir = idade >= 20;
		
		//forma habitual
//		if(podeDirigir) {
//			System.out.println("Pode");
//		} else {
//			System.out.println("Não pode");
//		}
		
		//com operadores ternarios -> Sintaxe: expresssão booleana - valor caso verdadeiro - valor caso falso
		
		String validador = (idade >= 18) ? "pode" : "não pode";
		System.out.println(validador);

	}

}
