package model.services;

import model.entiites.Animal;

public interface Ferramentas {

	public Animal[] filtraEspecie(Animal[] completo, String especieFiltrar);
	public String[] classificaEspecies(Animal[] completo);
}
