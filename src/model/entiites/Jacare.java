package model.entiites;

public class Jacare implements Animal {

	String nomeEspecie;
	String nomeAnimal;
	
	String ra�a;
	
	
	public Jacare(String nomeEspecie, String nomeAnimal, String ra�a) {
		super();
		this.nomeEspecie = nomeEspecie;
		this.nomeAnimal = nomeAnimal;
		this.ra�a = ra�a;
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
		return "Jacare [nomeEspecie=" + nomeEspecie + ", nomeAnimal=" + nomeAnimal + ", ra�a=" + ra�a + "]";
	}
	
}