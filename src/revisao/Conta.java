package revisao;

public class Conta {
	
	int numero;
	double saldo;
	double limite;
	Cliente cliente;
	
	public Conta(int numero, double saldo, Cliente cliente) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.limite = 500;
		this.cliente = cliente;
	}

	public Conta() {}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public static void deposita(Conta conta, double valor) {
		conta.saldo += valor;
	}
	
	public void saca(double valor) {
		if(validaValor(valor)) {
			this.saldo -= valor;
		}
	}
	
	public boolean validaValor(double valor) {
		if(valor <= 0) {
			System.out.println("Operação inválida: Valor inválido.");
			return false;
		}else if(valor > getSaldo()) {
			System.out.println("Operação inválida: Saldo indisponível.");
			return false;
		}else {
			return true;
		}
	}
	
	public void tranfere(Conta conta, double valor) {
		if(validaValor(valor)) {
			saca(valor);
			conta.saldo += valor; 
		}
	}
	
	private double getSaldo() {
		return saldo + limite;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + ", limite=" + limite + "]";
	}
	
	public void exibeSaldo() {
		System.out.println(String.format("Conta: %d --> Saldo: R$ %.2f",numero, getSaldo()));
	}
}
