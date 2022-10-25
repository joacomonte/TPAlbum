package TP;

import java.util.ArrayList;

public class Paises {
	private String _nombrePais;
	private ArrayList<FiguritaTradicional> _figusTradicional;
	private int _rankingPais; //numeroIdentificatorio
	
	
	//HACER EQUALS A PAISES.
	public Paises(String nombrePais, int rankingPais) {
		_nombrePais = nombrePais;
		if(rankingPais > 0 && rankingPais <= 32) {
			_rankingPais = rankingPais;
		} else {
			throw new RuntimeException("El ranking del pais debe estar entre 1 y 32");
		}
		_figusTradicional = new ArrayList<FiguritaTradicional>(12);
	}
	
	public void nuevaFiguritaTradicional(String nombreJugador, int numeroIdentif,	int rankingJug) {
		//Creo la figurita tradicional y la meto al conjunto de jugadores;
		FiguritaTradicional figurita = new FiguritaTradicional(nombreJugador, numeroIdentif, rankingJug, _nombrePais, _rankingPais);
		_figusTradicional.add(figurita);
	}
	
	//public abstract void nuevaFiguritaTop10(String nombreJugador, int numeroIdentif, int rankingJug, int añoMundial, boolean balonGanado); //Creo la figurita top10 del pais y la meto al conjunto de jugadores top 10;
}
