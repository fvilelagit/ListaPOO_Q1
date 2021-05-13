package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entiites.Animal;

public class Organizador implements Ferramentas{

	Animal[] vect1;
	String[] vect2;
	
	@Override
	public Animal[] filtraEspecie(Animal[] completo, String especieFiltrar) {
		for (int i = 0; i < completo.length; i++) {
			if (especieFiltrar == completo[i].getNomeEspecie()) {
				vect1[i] = completo[i];
			}
		}
		return vect1 ;
	}


	@Override
	public String[] classificaEspecies(Animal[] completo) {
		
		Animal vectA[] = null; 
		
		List <String> listStr = new ArrayList();
		int count = 0;
		
		for (int i = 0; i < completo.length; i++) {
			if (listStr.isEmpty()) {
				listStr.add(completo[i].getNomeEspecie().toString());
			}
			else if (listStr.contains(completo[i].getNomeEspecie().toString())){
				
			}	
			else {
				listStr.add(completo[i].getNomeEspecie().toString());
				System.out.println("Adicionou: " + completo[i].getNomeEspecie().toString());
			}
		}
		
		System.out.println("resultado da lista" + listStr);
		System.out.println();
		
		String vect2[] = new String[listStr.size()];

		for (int i = 0; i < listStr.size(); i++) {
			String s = listStr.get(i);
			vect2[i] = s;
		}
		
		for (String v:vect2) {
			System.out.println();
		}
		
		return vect2;
	}

}



/*
if (vectA[i].getNomeEspecie() != (completo[i].getNomeEspecie())) {
	int count = 0;
	for(int j = 0; j <= vectA.length; j++) {
		if (vectA[j].getNomeEspecie() == completo[i].getNomeEspecie()) {
			break;
		}
		else if (vectA[j].getNomeEspecie()!= completo[i].getNomeEspecie()){
			count+= 1;
			if (count == vectA.length) {
				vectA[i] = completo[i];
			}
		}
	}
	
	for(int j = 0; j <= listStr.size(); j++) {	
				if (listStr.get(j) == completo[i].getNomeEspecie()) {
					break;
				}
				if (listStr.get(j) != completo[i].getNomeEspecie()) {
					count+= 1;
					if (count == listStr.size()) {
						listStr.add(completo[i].getNomeEspecie().toString());
					}
*/

