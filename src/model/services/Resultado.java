package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entiites.Organizador;

public class Resultado {

	private String nomeEspecie; // nome da especie
	private int quantidade; // quantidade de animais da especie

	public Resultado(String nomeEspecie, int quantidade) {
		this.nomeEspecie = nomeEspecie;
		this.quantidade = quantidade;
	}

	public String getNomeEspecie() {
		return nomeEspecie;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	

	@Override
	public String toString() {
		return "Resultado [NomeEspecie = " + nomeEspecie + " | Quantidade = " + quantidade + "]";
	}

}