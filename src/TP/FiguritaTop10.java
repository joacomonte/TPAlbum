package TP;

public class FiguritaTop10 extends Figurita {
	private String _sedeMundial;
	private int _añoMundial;
	private int _balonGanado; //0 oro, 1 plata;
	
	public FiguritaTop10(int numeroIdentif, int ranking, String sedeMundial, int balonGanado, int valorFinal) {
		super(numeroIdentif, ranking, valorFinal);
		_sedeMundial = sedeMundial;
		_balonGanado = balonGanado;
		if( _balonGanado == 0) {
			_valorFinal = _valorFinal * (1.2);
		} else {
			_valorFinal = _valorFinal * (1.1);
		}
	}
	
	public String getNombPaisSede() {
		return _sedeMundial;
	}
	
	public int getAñoMundial() {
		return _añoMundial;
	}
}
