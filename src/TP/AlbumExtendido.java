package TP;

import java.util.ArrayList;


public class AlbumExtendido extends Album {
	private ArrayList<FiguritaTop10> _figusTop10;
	
	public AlbumExtendido() {
		_premioFinal = "Pelota de fútbol y un viaje";
		_figusTop10 = new ArrayList<FiguritaTop10>(20);
	}
	
	public void nuevaFiguritaTop10(String nombreJug, int numeroIdentif, int ranking, String nombrePaisSedeMundial, int añoMundial, boolean balonGanado, int rankingPais) {
		//Creo las 20 figuritas y obtengo el rankingPais 
	}
}
