package heranca;

public class Produto {
	
	private int codigo;
	private String nome;
	private boolean isPerecivel;
	private double preco;
		
	public Produto(int codigo, String nome, boolean isPerecivel, double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.isPerecivel = isPerecivel;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}

	public boolean isPerecivel() {
		return isPerecivel;
	}

	public void setPerecivel(boolean isPerecivel) {
		this.isPerecivel = isPerecivel;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if(preco >= 1000.0) {
			this.preco = preco;
		}else {
			System.out.println("Preço incompatível, nao pode ser abaixo de R$ 1.000,00");
		}
	}

	public void exibeDados() {
		System.out.print(String.format("[cod: %d], [nome: %s], [perecível: %B], [preço: R$ %.2f]", 
				codigo, nome,isPerecivel, preco));
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", isPerecivel=" + isPerecivel
				+ ", preco=" + preco + "]";
	}
	
}
