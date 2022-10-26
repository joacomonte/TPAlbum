package TP;

public class Figurita {
	private int _numeroIdentif;
	private int _ranking;
	protected double _valorFinal;
	
	public Figurita(int numeroIdentif, int ranking, int valorBase) {
		
		if(numeroIdentif > 0) {
			_numeroIdentif = numeroIdentif;
		} else {
			throw new RuntimeException("El numero de identificación de cada figurita debe ser mayor a 0");
		}
		if(ranking > 0 && ranking <= 12) {
			_ranking = ranking;
		} else {
			throw new RuntimeException("El numero de ranking de cada figurita debe ir de 1 a 12");
		}
		_valorFinal = valorBase;
	}
	
	public int getNumIdent() {
		return _numeroIdentif;
	}
	
	public int getRanking() {
		return _ranking;
	}
	
	public double getValorFinal() {
		return _valorFinal;
	}
	
}	
