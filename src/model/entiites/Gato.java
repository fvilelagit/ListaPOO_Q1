package model.entiites;

public class Gato implements Animal {
	
	String nomeEspecie;
	String nomeAnimal;

	String ra�a;
	
	
	public Gato(String nomeEspecie, String nomeAnimal, String ra�a) {
		super();
		this.nomeEspecie = nomeEspecie;
		this.nomeAnimal = nomeAnimal;
		this.ra�a = ra�a;
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
		return "Gato [nomeEspecie=" + nomeEspecie + ", nomeAnimal=" + nomeAnimal + ", ra�a=" + ra�a + "]";
	}

}
