package TP;

public class FiguritaTradicional extends Figurita {
	private String _nombrePais;
	
	public FiguritaTradicional(String nombreJug, int numeroIdentif, int ranking, String nombrePais, int rankingPais) {
		super(nombreJug, numeroIdentif, ranking);
		_nombrePais = nombrePais;
		_valorFinal = ranking + rankingPais;	
	}
	
	public String getNombrePais() {
		return _nombrePais;
	}
	
}
