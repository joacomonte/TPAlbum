package TP;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Participantes {
	private String _nombre;
	private int _DNI;
	private Album _album;
	private int _tipoAlbum;
	private Set<Figurita> _figuritasPegadas;
	private Set<Figurita> _figuritasObtenidas;
	private ArrayList<Figurita> _figuritasRepetidas;
	
	public Participantes(String nombre, int dni, int tipoAlbum) {
		_nombre = nombre;
		if(dni > 10000000 && dni < 99999999) {
			_DNI = dni;
		} else {
			throw new RuntimeException("El dni ingresado es invalido");
		}
		if(tipoAlbum > 0 && tipoAlbum <= 3) {
			_tipoAlbum = tipoAlbum;
		} else {
			throw new RuntimeException("El tipo de album solo puede ir del 1 al 3");
		}
		if(tipoAlbum == 1) {
			_album = new AlbumTradicional();
		} else {
			if(tipoAlbum == 2) {
				_album = new AlbumExtendido();
			} else {
				_album = new AlbumWeb();
			}
		}
		//HACERLE HASHCODE Y EQUALS A LAS FIGURITAS, tambien a PARTICIPANTES.
		_figuritasPegadas = new HashSet<Figurita>();
		_figuritasObtenidas = new HashSet<Figurita>();
		_figuritasRepetidas = new ArrayList<Figurita>();
	}
	
	public void comprarFiguritas() {
		//compra figuritas aleatorias y las mete en figuritas obtenidas, si cuando las intenta meter ya está, la metería en figuritas repetidas.
	}
	
	public void pegarFiguritasAux() {
		//recorre las figuritasObtenidas y verifica si estan en figuritasPegadas, si están no hace nada, si no están las pega (lo mete al HashSet).
	}
	
	public String getNombre() {
		return _nombre;
	}
	
	public Album getAlbum() {
		return _album;
	}
	
	public int getDni() {
		return _DNI;
	}
}
