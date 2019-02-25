package heranca;

public class PessoaFisica extends Pessoa {
	
	private String cpf;
	
	public PessoaFisica(String nome, String email, String telefone, String cpf) {
		super(nome, email, telefone);
			this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return super.toString() + ", [cpf: "+cpf+"]";
	}
	
	
	
}
