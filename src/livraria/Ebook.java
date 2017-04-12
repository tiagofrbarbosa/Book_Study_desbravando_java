package livraria;

public class Ebook extends Livro{
	private String waterMark;
	
	public Ebook(Autor autor){
		super(autor);
	}
	
	public void setWaterMark(String waterMark){
		this.waterMark = waterMark;
	}
	
	public String getwaterMark(){
		return waterMark;
	}
	
	@Override
	public boolean aplicaDescontoDe(double valor){
		if(valor > 0.15){
			return false;
		}
		return super.aplicaDescontoDe(valor);
	}
}
