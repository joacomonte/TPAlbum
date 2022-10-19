package TP;

import java.util.HashSet;

public class AlbumDelMundial {
	private HashSet<Participantes> _participantes;
	private HashSet<Participantes> _participantesGanadores;
	
	public AlbumDelMundial() {
		_participantes = new HashSet<Participantes>();
		_participantesGanadores = new HashSet<Participantes>();
	}
	
	public void nuevoParticipante(String nombre, int dni, int tipoAlbum) {
		//crea el participante y lo mete en el HashSet
	}
	
	public void comprarFiguritas(int dniJugador) {
		//llama a comprarFiguritas para el jugador que tenga el DNI pasado.
	}
	
	public void pegarFiguritas() {
		//recorre todo el HashSet de participantes y llama a pegarFiguritasAux para comparar y pegar en cada uno
	}
	
	public void algunGanador() {
		//para todos los participantes del HashSet se fija si alguno tiene de tamaño de su HashSet figuritasPegadas igual a 32 x 12 predeterminado, si tiene albumExt le suma 20 a ese calculo y hace la cuenta.
		//si algun participante es ganador, lo mueve al otro HashSet de ganadores, lo borra del otro y le otorga su premio.
	}
	
	public String mostrarGanadores() {
		//muestra todos los ganadores del HashSet, sus datos, su tipo de Album y su premio.
	}
	
	public void intercambiarFigurita(int dniInteresado, int codigoFigurita) {
		//llama a obtenerFiguritaRepetida en el participante y si la tiene devuelve true. Si da true, se busca en todos los participantes el primero que no tenga esa figurita (con la misma funcion obtenerFiguritaRepetida pero con false) y se guarda su dni en participanteObjetivo.
		//Luego con ese dni y del interesado se llama a la funcion recorrerFiguritas, y con el codigo de figurita obtenido se llama a la funcion figuritaIntercambiada.
		//El false te hace salir de la funcion, o si no te encuentra una figuritaObjetivo tambien.
	}
	
	public void intercambiarFigurita(int dniInteresado, int dniObjetivo) {
		//esta funcion compara figurita por figurita utilizando un for, cada figuritaRepetida del objetivo con cada figuritaRepetida del interesado, hasta encontrar la primera que no tenga el interesado en su HashSet, se sale del for y devuelve el codigo de esa figurita
	}
	
	public void figuritaIntercambiada(int dniInteresado, int codigoFiguritaInteresado, int dniObjetivo, int codigoFiguritaObjetivo) {
		//Toma el dniInteresado y el codigoFiguritaObjetivo y lo añade a su _figuritasObtenido, hace lo mismo con el dniObjetivo y codigoFiguritaInteresado
		//informa por pantalla el intercambio realizado.
	}
	
	public String argentinaCompletado() {
		//Conociendo los codigos de los jugadores argentinos se fija uno por uno cada participante si tiene todos (los 12) figuritas pegadas, si lo tiene lo añade al string a devolver, si no, no hace nada 
	}
	
}

