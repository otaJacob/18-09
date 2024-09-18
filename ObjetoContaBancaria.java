package Capisula;

public class ObjetoContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria conta = new ContaBancaria (100000.00);
		
		System.out.println(conta.getSaldo());
		
		conta.depositar (500); 
		conta.depositar (1000);
		
		conta.depositar (500); 
		conta.depositar (1000);	
		
		conta.sacar (1500);
		
		System.out.println(conta.getSaldo());
	 
	}

}
