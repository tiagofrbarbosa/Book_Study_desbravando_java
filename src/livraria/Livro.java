package livraria;

public class Livro {
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	
	public Livro(Autor autor){
		this();
		this.autor = autor;
	}
	
	public Livro(){
		this.isbn = "000.000.000.00";
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao(){
		return descricao;
	}
	
	public void setValor(double valor){
		this.valor = valor;
	}
	
	public double getValor(){
		return valor;
	}
	
	public void setIsbn(String isbn){
		this.isbn = isbn;
	}
	
	public String getIsbn(){
		return isbn;
	}
	
	public void setAutor(Autor autor){
		this.autor = autor;
	}
	
	public Autor getAutor(){
		return autor;
	}
	
	
	void mostrarDetalhes(){
		String mensagem = "Detalhes: ";
		String separador = "--";
		System.out.println(mensagem);
		System.out.println("Nome: " + nome);
		System.out.println("Valor: " + valor);
		System.out.println("Descrição: " + descricao);
		System.out.println("ISBN: " + isbn);
		
		if(this.temAutor()){
		autor.mostrarDetalhes();
		}
		
		System.out.println(separador);
	}
	
	public boolean aplicaDescontoDe(double valor){
		if(valor > 0.3){
			return false;
		}
		
		this.valor -= this.valor * valor;
		return true;
	}
	
	boolean temAutor(){
		return this.autor != null;
	}
}
