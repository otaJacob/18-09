package Capisula;

public class ObjetoItemTema {

	public static void main(String[] args) {
		ItemTema it1= new ItemTema();
		
		it1.setId(1);
		it1.setNome("gg");
		it1.setEndereco("Rua Onde Judas Perdeu as Botas, Bairro Sla, nº008");
		System.out.println("----------------");
		System.out.println(it1.getId());
		System.out.println(it1.getNome());
		System.out.println(it1.getEndereco());
		
		ItemTema it2 = new ItemTema(2, "gg", "Rua Onde Judas Perdeu as Botas, Bairro Sla, nº008");
		System.out.println("----------------");
		System.out.println(it2.getId());
		System.out.println(it2.getNome());
		System.out.println(it2.getEndereco());
	}
}
