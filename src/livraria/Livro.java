package livraria;

public class Livro {
	String nome;
	String descricao;
	double valor;
	String isbn;
	Autor autor;
	
	void mostrarDetalhes(){
		String mensagem = "Detalhes: ";
		String separador = "--";
		System.out.println(mensagem);
		System.out.println("Nome: " + nome);
		System.out.println("Valor: " + valor);
		System.out.println("Descrição: " + descricao);
		System.out.println("ISBN: " + isbn);
		System.out.println(separador);
	}
}
