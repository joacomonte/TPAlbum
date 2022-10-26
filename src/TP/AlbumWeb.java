package TP;

public class AlbumWeb extends Album{
	private boolean _codigoPromocionalUsado;
	
	public AlbumWeb() {
		_codigoPromocionalUsado = false;
		_premioFinal = null;
	}
	
	public void usarCodigoPromocional() {
		_codigoPromocionalUsado = true;
	}
}
