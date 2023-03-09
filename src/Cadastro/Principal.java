package Cadastro;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {

	public static void main(String[] args) {

		Caes cao1 = new Caes("Pipoca", 10, "Labrador", "Amarelo", "Masculino", "Luciana", (float) 35.5, "Grande");
		Caes cao2 = new Caes("Loki", 8, "Pastor Alemao", "Vermelho e Preto", "Masculino", "Alessandro", (float) 60.2,
				"Grande");
		Passaros passaro1 = new Passaros("Louro jose", 5, "Papagaio", "Verde", "Masculino", "Ana Maria Braga", 123);
		Gatos gato1 = new Gatos("Leo", 1, "Siames", "Cinza", "Masculino", "Arthur", (float) 8.35, "Pequeno");
		Gatos gato2 = new Gatos("Beatriz", 2, "Vira-Lata", "Tricolor", "Feminino", "Arthur", (float) 9.2, "Pequeno");
		Gatos gato3 = new Gatos("Jojo", 2, "Vira-Lata", "Preto", "Feminino", "Arthur", (float) 10.0, "Pequeno");
		Gatos gato4 = new Gatos("Branquinho", 1, "Vira-Lata", "Branco", "Masculino", "Arthur", (float) 7.5, "Pequeno");

		ArrayList<Animais> animal = new ArrayList<>();

		animal.add(gato1);
		animal.add(gato4);
		animal.add(gato2);
		animal.add(gato3);
		animal.add(passaro1);
		animal.add(cao2);
		animal.add(cao1);

		System.out.println(animal);

		System.out.println(
				"____________________________________________________________________________________________________________________________________________\n");

		ArrayList<Integer> idades = new ArrayList<Integer>();

		idades.add(cao1.getIdade());
		idades.add(cao2.getIdade());
		idades.add(gato1.getIdade());
		idades.add(gato2.getIdade());
		idades.add(gato3.getIdade());
		idades.add(gato4.getIdade());
		idades.add(passaro1.getIdade());

		Collections.sort(idades);
		
		System.out.println("As idades em ordem crescente e: \n" + idades + "\n Dados: \n" + animal);
	}
}
