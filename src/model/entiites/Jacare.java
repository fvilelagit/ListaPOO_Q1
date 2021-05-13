package model.entiites;

public class Jacare implements Animal {

	String nomeEspecie;
	String nomeAnimal;
	
	String raça;
	
	
	public Jacare(String nomeEspecie, String nomeAnimal, String raça) {
		super();
		this.nomeEspecie = nomeEspecie;
		this.nomeAnimal = nomeAnimal;
		this.raça = raça;
	}

	
	@Override
	public String getNomeEspecie() {
		return nomeEspecie;
	}

	@Override
	public String getNomeAnimal() {
		return nomeAnimal;
	}

	@Override
	public String toString() {
		return "Jacare [nomeEspecie=" + nomeEspecie + ", nomeAnimal=" + nomeAnimal + ", raça=" + raça + "]";
	}
	
}