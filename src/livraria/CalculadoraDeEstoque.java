package livraria;

public class CalculadoraDeEstoque {
	public static void main(String[] main){
		double soma = 0;
		for(int i = 0;i < 35;i++){
			soma += 59.90;
		}
		
		System.out.println("Total em estoque: " + soma);
		
		if(soma < 150){
			System.out.println("Seu estoque está muito baixo!");
		}else if(soma >= 2000){
			System.out.println("Seu estoque está muito alto!");
		}else{
			System.out.println("Seu estoque está bom");
		}
 	}
}
