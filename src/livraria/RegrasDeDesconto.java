package livraria;

public class RegrasDeDesconto {
		
	public static void main(String[] args){
		
		Autor autor = new Autor();
		autor.setNome("Tiago Barbosa");
		autor.setEmail("tiagofr.barbosa@hotmail.com.br");
		autor.setCpf("111.222.333.44");
		
		Livro livro = new Livro(autor);
		livro.setValor(59.90);
		
		System.out.println("Valor atual: " + livro.getValor());
		
		if(!livro.aplicaDescontoDe(0.1)){
			System.out.println("Desconto não pode ser maior que 30%");
		}else{
			System.out.println("Valor com desconto: " + livro.getValor());
		}
	}
	
}
