package Cadastro;

public class Caes extends Animais {
	private float peso;
	private String porte;

	public Caes(String nome, int idade, String raça, String cor, String sexo, String nomeTutor, float peso,
			String porte) {
		super(nome, idade, raça, cor, sexo, nomeTutor);
		this.peso = peso;
		this.porte = porte;
	}

	public float getPeso() {
		return peso;
	}

	public String getPorte() {
		return porte;
	}

	@Override
	public String toString() {
		return "|Nome do Cao: " + this.nome + " | Raca: " + this.raça + " | Idade: " + this.idade + " | Peso: "
				+ this.peso + " | Sexo: " + this.sexo + " | Tutor: " + this.nomeTutor + "|\n";
	}

}
