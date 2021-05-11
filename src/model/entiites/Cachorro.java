package model.entiites;

import model.services.Animal;

public class Cachorro implements Animal {

	String nomeEspecie;
	String nomeAnimal;
	
	String ra�a;

	public Cachorro(String nomeEspecie, String nomeAnimal, String ra�a) {
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
		return this.nomeEspecie;
	}

	@Override
	public String toString() {
		return "Cachorro [nomeEspecie=" + nomeEspecie + ", nomeAnimal=" + nomeAnimal + ", ra�a=" + ra�a + "]";
	}

}
