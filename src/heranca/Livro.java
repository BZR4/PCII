package heranca;

public class Livro extends Produto{
	
	public Livro(int codigo, String nome, boolean isPerecivel, double preco, String isbn, String autor) {
		super(codigo, nome, isPerecivel, preco);
		
		this.isbn = isbn;
		this.autor = autor;
	}
	
	private String isbn, autor;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}	
	
	@Override
	public String toString() {
		return "Livro [toString()=" + super.toString() + "]";
	}

	public void exibeDados() {
		super.exibeDados();
		System.out.println(",[isbn: "+isbn+"], [autor: "+autor+"].");
	}
	
}
