package livraria;

public class CadastroDeLivros {
	public static void main(String[] args){
		
		Autor autor = new Autor();
		autor.setNome("Tiago Barbosa");
		autor.setEmail("tiagofr.arbosa@hotmail.com.br");
		autor.setCpf("3336669990");
		
		Livro livro = new Livro(autor);
		livro.setNome("Java 8");
		livro.setValor(59.90);
		livro.setDescricao("Praticando java");
		livro.setIsbn("123.456.789.900");
		livro.setAutor(autor);
		livro.mostrarDetalhes();
		
		
		Autor outroAutor = new Autor();
		outroAutor.setNome("Rodrigo Turini");
		outroAutor.setEmail("rodrigo@caelum.com");
		outroAutor.setCpf("33355566680");
			
		Livro outroLivro = new Livro(outroAutor);
		outroLivro.setNome("Conforto para mente");
		outroLivro.setValor(59.90);
		outroLivro.setDescricao("Como conquistar a paz interior");
		outroLivro.setIsbn("789.456.123.789");
		outroLivro.setAutor(outroAutor);
		outroLivro.mostrarDetalhes();
		
		Livro mLivro = new Livro(outroAutor);
		mLivro.setNome("Livro 03");
		mLivro.setValor(60.90);
		mLivro.setDescricao("Livro simples");
		mLivro.setIsbn("123456789123");
		mLivro.mostrarDetalhes();
	}
}
