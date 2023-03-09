package Cadastro;

public class Passaros extends Animais {
	private int numeroAnilha;

	public Passaros(String nome, int idade, String raça, String cor, String sexo, String nomeTutor, int numeroAnilha) {
		super(nome, idade, raça, cor, sexo, nomeTutor);
		this.numeroAnilha = numeroAnilha;
	}

	public int getNumeroAnilha() {
		return numeroAnilha;
	}

	@Override
	public String toString() {
		return "|Nome do Passaro: " + this.nome + " | Raca: " + this.raça + " | Idade: " + this.idade + " | Cor: "
				+ this.cor + " | Sexo: " + this.sexo + " | Numero da Anilha: " + this.numeroAnilha + " | Tutor: "
				+ this.nomeTutor + "|\n";
	}
}
