package TP;

import java.util.ArrayList;

//Paises y figuritas se hardcodean
public abstract class Album {
	private ArrayList<Paises> _paises;
	protected String _premioFinal;
	
	public Album() {
		_premioFinal = "";
		_paises = new ArrayList<Paises>(32);
	}
	
	public String getPremioFinal() {
		return _premioFinal;
	}
	
	public void crearFiguritas(String nombrePais, int rankingPais) {
		//Creo los paises respetando el ranking del 1 al 32 y los voy agregando al conjunto;
		Paises pais1 = new Paises("Argentina", 1);
		pais1.nuevaFiguritaTradicional("Lionel Messi", 1, 1);
		pais1.nuevaFiguritaTradicional("Lautaro Martinez", 2, 2);
		pais1.nuevaFiguritaTradicional("Nicolás Tagliafico", 3, 3);
		pais1.nuevaFiguritaTradicional("Rodrigo De Paul", 4, 4);
		pais1.nuevaFiguritaTradicional("Giovani Lo Celso", 5, 5);
		pais1.nuevaFiguritaTradicional("Papu Gomez", 6, 6);
		pais1.nuevaFiguritaTradicional("Emiliano Martinez", 7, 7);
		pais1.nuevaFiguritaTradicional("Angel Di Maria", 8, 8);
		pais1.nuevaFiguritaTradicional("Julián Alvarez", 9, 9);
		pais1.nuevaFiguritaTradicional("Nicolás Otamendi", 10, 10);
		pais1.nuevaFiguritaTradicional("Germán Pezella", 11, 11);	
		Paises pais2 = new Paises("Brasil",2);
		pais2.nuevaFiguritaTradicional("Neymar Da Silva", 12, 1);
		pais2.nuevaFiguritaTradicional("Lucas Paqueta", 13, 2);
		pais2.nuevaFiguritaTradicional("Vinicius Junior",14 ,3);
		pais2.nuevaFiguritaTradicional("Raphael Dias", 15, 4);
		pais2.nuevaFiguritaTradicional("Fabinho", 16, 5);
		pais2.nuevaFiguritaTradicional("Frederico Rodrigues",17, 6);
		pais2.nuevaFiguritaTradicional("Alex Sandro", 18, 7);
		pais2.nuevaFiguritaTradicional("Éder Militão", 19, 8);
		pais2.nuevaFiguritaTradicional("Marcos Correa", 20, 9);
		pais2.nuevaFiguritaTradicional("Danilo Da Silva", 21, 10);
		pais2.nuevaFiguritaTradicional("Alisson Becker", 22, 11);		
		Paises pais3 = new Paises("Alemania",3);
		pais3.nuevaFiguritaTradicional("Kai Havertz", 23, 1);
		pais3.nuevaFiguritaTradicional("Leroy Sané", 24, 2);
		pais3.nuevaFiguritaTradicional("Jamal Musiala", 25, 3);
		pais3.nuevaFiguritaTradicional("Ilkay Gundogan", 26, 4);
		pais3.nuevaFiguritaTradicional("Jonas Hoffman", 27, 5);
		pais3.nuevaFiguritaTradicional("Joshua Kimmich", 28, 6);
		pais3.nuevaFiguritaTradicional("David Raum", 29, 7);
		pais3.nuevaFiguritaTradicional("Nico Schlotterbeck", 30, 8);
		pais3.nuevaFiguritaTradicional("Niklas Sule", 31, 9);
		pais3.nuevaFiguritaTradicional("Tihlo Kehrer", 32, 10);
		pais3.nuevaFiguritaTradicional("Marc-André Ter Stegen", 33, 11);
		_paises.add(pais1);
		_paises.add(pais2);
		_paises.add(pais3);
	}
}
