package model.entiites;

import model.services.Animal;

public class Cachorro implements Animal {

	String nomeEspecie;
	String nomeAnimal;
	
	String raça;

	public Cachorro(String nomeEspecie, String nomeAnimal, String raça) {
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
		return this.nomeEspecie;
	}

	@Override
	public String toString() {
		return "Cachorro [nomeEspecie=" + nomeEspecie + ", nomeAnimal=" + nomeAnimal + ", raça=" + raça + "]";
	}

}
