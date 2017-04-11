package livraria;

public class CadastroDeLivros {
	public static void main(String[] args){
		
		Autor autor = new Autor();
		autor.nome = "Tiago Barbosa";
		autor.email = "tiagofr.arbosa@hotmail.com.br";
		autor.cpf = "38796568860";
		
		Livro livro = new Livro();
		livro.nome = "Java 8";
		livro.valor = 59.90;
		livro.descricao = "Praticando java";
		livro.isbn = "123.456.789.900";
		livro.autor = autor;
		livro.mostrarDetalhes();
		
		
		Autor outroAutor = new Autor();
		outroAutor.nome = "Rodrigo Turini";
		outroAutor.email = "rodrigo@caelum.com";
		outroAutor.cpf = "33355566680";
			
		Livro outroLivro = new Livro();
		outroLivro.nome = "Conforto para mente";
		outroLivro.valor = 59.90;
		outroLivro.descricao = "Como conquistar a paz interior";
		outroLivro.isbn = "789.456.123.789";
		outroLivro.autor = outroAutor;
		outroLivro.mostrarDetalhes();
	}
}
