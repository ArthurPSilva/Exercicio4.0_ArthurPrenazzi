package Cadastro;

public class Animais {
	public String nome;
	public int idade;
	public String raça;
	public String cor;
	public String sexo;
	public String nomeTutor;
	
	
	public Animais(String nome, int idade, String raça, String cor, String sexo, String nomeTutor) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.raça = raça;
		this.cor = cor;
		this.sexo = sexo;
		this.nomeTutor = nomeTutor;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getRaça() {
		return raça;
	}

	public String getCor() {
		return cor;
	}

	public String getSexo() {
		return sexo;
	}
	
	public String getNomeTutor() {
		return nomeTutor;
	}
	
	
}
