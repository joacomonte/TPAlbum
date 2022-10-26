package TP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AlbumDelMundial implements IAlbumDelMundial {
	private HashMap<Integer,Participantes> _participantes;
	private HashMap<Integer,Participantes> _participantesGanadores;
	private Fabrica _fabrica;
	
	public AlbumDelMundial() {
		_participantes = new HashMap<Integer,Participantes>();
		_participantesGanadores = new HashMap<Integer,Participantes>();
		_fabrica = new Fabrica();
	}

	@Override
	public int registrarParticipante(int dni, String nombre, String tipoAlbum) {
		if(_participantes.containsKey(dni)) {
			throw new RuntimeException("El participante ya está registrado");
		}
		Album aux = null;
		if(tipoAlbum.equals("Tradicional")) {
			aux = _fabrica.crearAlbumTradicional();
		} else {
			if(tipoAlbum.equals("Extendido")) {
				aux = _fabrica.crearAlbumExtendido();
			} else {
				if(tipoAlbum.equals("Web")) {
					aux = _fabrica.crearAlbumWeb();
				} else {
					throw new RuntimeException("El tipo de album no existe");
				}
			}
		}
		Participantes nuevo = new Participantes(nombre, dni, aux);
		_participantes.put(dni, nuevo);
		return Integer.parseInt(tipoAlbum);
	}

	@Override
	public void comprarFiguritas(int dni) {
		if(_participantes.containsKey(dni)) {
			Participantes aux = _participantes.get(dni);
			aux.abrirSobre(_fabrica.generarSobre(4));
		} else {
			throw new RuntimeException("El participante con ese DNI no existe");
		}			
	}

	@Override
	public void comprarFiguritasTop10(int dni) {
		if(_participantes.containsKey(dni)) {
			if(_participantes.get(dni).getAlbum() instanceof AlbumWeb) {
				Participantes aux = _participantes.get(dni);
				aux.abrirSobre(_fabrica.generarSobreTop10(4));
			} else {
				throw new RuntimeException("El participante no tiene el tipo de Album necesario");
			}
			
		} else {
			throw new RuntimeException("No existe un participante con este DNI");
		}
		
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

