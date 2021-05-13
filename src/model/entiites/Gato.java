package model.entiites;

public class Gato implements Animal {
	
	String nomeEspecie;
	String nomeAnimal;

	String raça;
	
	
	public Gato(String nomeEspecie, String nomeAnimal, String raça) {
		super();
		this.nomeEspecie = nomeEspecie;
		this.nomeAnimal = nomeAnimal;
		this.raça = raça;
	}

	@Override
	public String getNomeEspecie() {
		return this.nomeEspecie;
	}

	@Override
	public String getNomeAnimal() {
		return nomeAnimal;
	}

	@Override
	public String toString() {
		return "Gato [nomeEspecie=" + nomeEspecie + ", nomeAnimal=" + nomeAnimal + ", raça=" + raça + "]";
	}

}
