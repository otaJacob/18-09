package Capisula;

public class Estudante {
	private String nome; 
	private double nota1;
	private double nota2;


	public Estudante (String nome, double nota1, double nota2) {
		this.nome = nome; 
		setNotal(nota1);
		setNota2 (nota2);
	}


	public String getNome () {
		return nome;
	}

	public void setNome (String nome) {
		this.nome = nome;
	}


	public double getNotal() {
		return nota1;
	}

	public void setNotal (double notal) {
		if (notal >= 0 && notal <=10) {
			this.nota1 = nota1;

		} else {
			System.out.println("Nota 1 inválida! Deve estar entre 0 e 10."); }
	}


	public double getNota2() {
		return nota2;
	}
	public void setNota2 (double nota2) {
		if (nota2 >= 0 && nota2 <= 10) {
			this.nota2 = nota2;

		} else {
			System.out.println("Nota 2 inválida! Deve estar entre 0 e 10.");
		}
	}

	public double calcularMedia() { 
		return (nota1 + nota2) / 2;
	}


	public void exibirInformacoes() {
		System.out.println("Estudante:  "+ nome + ", Média: " + calcularMedia());
	}
}


