package heranca;

public class TestaProduto {

	public static void main(String[] args) {
		Produto produto1 = new Produto(1, "Playstation 4", false, 2000.0);
		System.out.println("Preço PS4 R$ "+produto1.getPreco());
		produto1.setPreco(1200.0);
		System.out.println("Novo Preço PS4 R$ "+produto1.getPreco());
		Livro livro = new Livro(90, "Narnia", false, 78.0, "99888776654", "C S Lewis");
		livro.exibeDados();
		System.out.println(livro.toString());
	}
}
