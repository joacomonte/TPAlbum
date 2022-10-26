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
		
		Paises pais2 = new Paises("Brasil",2);

		_paises.add(pais1);
		_paises.add(pais2);
		_paises.add(pais3);
	}
}
