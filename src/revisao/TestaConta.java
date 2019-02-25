package revisao;

public class TestaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cli1 = new Cliente("Enzo G Santana", "112233445566", "enzo@me.com");
		Cliente cli2 = new Cliente("Erika G Santana", "998877665544", "erika@me.com");
		
		Conta c1 = new Conta(1, 1000, cli1);
		Conta c2 = new Conta(2, 2000, cli2);
		
		c1.exibeSaldo();
		c2.exibeSaldo();
		
		c1.tranfere(c2, 900);
		
		c1.exibeSaldo();
		c2.exibeSaldo();
		
		c1.deposita(c2, 1000);
		
		c1.exibeSaldo();
		c2.exibeSaldo();
		
		c1.deposita(1000);
		Conta.deposita(c2, 1000);
		
		c1.exibeSaldo();
		c2.exibeSaldo();
		
		System.out.println("\nCliente 1:");
		System.out.println(c1.cliente.rg);
		System.out.println(c1.cliente.nome);
		System.out.println(c1.cliente.email);
		
	}

}
