package TP;

public class FiguritaTop10 extends Figurita {
	private String _nombrePaisSedeMundial;
	private int _añoMundial;
	private boolean _balonGanado; //true oro, false plata;
	
	public FiguritaTop10(String nombreJug, int numeroIdentif, int ranking, String nombrePaisSedeMundial, int añoMundial, boolean balonGanado, int rankingPais) {
		super(nombreJug, numeroIdentif, ranking);
		_nombrePaisSedeMundial = nombrePaisSedeMundial;
		_añoMundial = añoMundial;
		_balonGanado = balonGanado;
		_valorFinal = ranking + rankingPais;
		if( _balonGanado == true) {
			_valorFinal = _valorFinal * (1.2);
		} else {
			_valorFinal = _valorFinal * (1.1);
		}
	}
	
	public String getNombPaisSede() {
		return _nombrePaisSedeMundial;
	}
	
	public int getAñoMundial() {
		return _añoMundial;
	}
}
