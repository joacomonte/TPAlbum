package TP;

import java.util.HashSet;
import java.util.List;

public class AlbumDelMundial implements IAlbumDelMundial {
	private HashSet<Participantes> _participantes;
	private HashSet<Participantes> _participantesGanadores;
	
	public AlbumDelMundial() {
		_participantes = new HashSet<Participantes>();
		_participantesGanadores = new HashSet<Participantes>();
	}

	@Override
	public int registrarParticipante(int dni, String nombre, String tipoAlbum) {
		Participantes nuevo = new Participantes(nombre, dni, tipoAlbum);
		if(_participantes.contains(nuevo)) {
			throw new RuntimeException("El participante ya está registrado");
		}
		_participantes.add(nuevo);
		return 0;
	}

	@Override
	public void comprarFiguritas(int dni) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comprarFiguritasTop10(int dni) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comprarFiguritasConCodigoPromocional(int dni) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> pegarFiguritas(int dni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean llenoAlbum(int dni) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String aplicarSorteoInstantaneo(int dni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int buscarFiguritaRepetida(int dni) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean intercambiar(int dni, int codFigurita) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean intercambiarUnaFiguritaRepetida(int dni) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String darNombre(int dni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String darPremio(int dni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String listadoDeGanadores() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> participantesQueCompletaronElPais(String nombrePais) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

