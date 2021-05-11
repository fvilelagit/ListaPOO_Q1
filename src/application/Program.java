package application;

import java.util.ArrayList;
import java.util.List;

import model.entiites.Cachorro;
import model.entiites.Gato;
import model.entiites.Jacare;
import model.entiites.Organizador;
import model.services.Animal;
import model.services.Resultado;

public class Program {

	public static void main(String[] args) {

		Organizador org = new Organizador();
		Animal[] listaAnimais = new Animal[5];

		Gato g1 = new Gato("felino", "juquinha", "Siamês");
		Cachorro c1 = new Cachorro("canino", "BART", "Husky");
		Gato g2 = new Gato("felino", "Simba", "De rua");
		Jacare j1 = new Jacare("reptil", "Jacare do Pica-pau", "Voodoo é pra jacu");
		Cachorro c2 = new Cachorro("canino", "Snoopy", "vira-lata");

		listaAnimais[0] = g1;
		listaAnimais[1] = c1;
		listaAnimais[2] = g2;
		listaAnimais[3] = j1;
		listaAnimais[4] = c2;

		Resultado [] finalResult = obterResult(listaAnimais, org);
		for (Resultado v :finalResult) {
			System.out.println(v.toString());
		}
	}

	public static Resultado[] obterResult(Animal[] vetorA, Organizador org) {

		Resultado r = new Resultado(null, 0);

		List<Resultado> listResultado = new ArrayList();
		List<String> nomeEspecieTodosAnimais = new ArrayList();

		String[] vectTeste = org.classificaEspecies(vetorA);
		
		Resultado[] resultados = new Resultado[vectTeste.length];

		for (int i = 0; i < vetorA.length; i++) {
			nomeEspecieTodosAnimais.add(vetorA[i].getNomeEspecie().toString());
		}

		for (int j = 0; j < vectTeste.length; j++) {
			resultados[j] = new Resultado (vectTeste[j].toString(), 0);
			for (int l =0 ; l < nomeEspecieTodosAnimais.size(); l++) {
				if (vectTeste[j].toString() == nomeEspecieTodosAnimais.get(l)) {
					resultados[j].setQuantidade(resultados[j].getQuantidade()+1);
				}
			}
		}
		return resultados;
	}
}
