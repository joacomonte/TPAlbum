package TP;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Participantes {
	private String _nombre;
	private int _DNI;
	private Album _album;
	private Set<Figurita> _figuritasPegadas;
	private ArrayList<Figurita> _figuritasObtenidas;
	
	public Participantes(String nombre, int dni, Album album) {
		_nombre = nombre;
		if(dni > 10000000 && dni < 99999999) {
			_DNI = dni;
		} else {
			throw new RuntimeException("El dni ingresado es invalido");
		}
		//HACERLE HASHCODE Y EQUALS A LAS FIGURITAS, tambien a PARTICIPANTES.
		_figuritasPegadas = new HashSet<Figurita>();
		_figuritasObtenidas = new ArrayList<Figurita>();
	}
	
	public void abrirSobre(List<Figurita> sobre) {
		for(int i = 0; i <= sobre.size()-1; i++) {
			_figuritasObtenidas.add(sobre.get(i));
		}
		System.out.println("Sobre abierto");
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
