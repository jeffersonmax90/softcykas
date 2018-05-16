package ventanas;

import java.util.Vector;
import ventanas.Lista_reproduccion_BD;

public class BD_Listas_reproduccion {
	public BD_Principal _bD_Principal;
	public Vector<Lista_reproduccion_BD> _lista_reproduccion_BDs = new Vector<Lista_reproduccion_BD>();

	public void modificarListaReproducion(Lista_reproduccion_BD aLista) {
		throw new UnsupportedOperationException();
	}

	public boolean crearLista(Lista_reproduccion_BD aLista) {
		throw new UnsupportedOperationException();
	}

	public Video_BD[] carga_lista_video_tendencia(int aId) {
		throw new UnsupportedOperationException();
	}

	public BD_Videos[] carga_lista_video_usuario_registrado(int aID) {
		throw new UnsupportedOperationException();
	}

	public Lista_reproduccion_BD[] cargarListasReproduccionPropias(int aId) {
		throw new UnsupportedOperationException();
	}

	public String[] cargarJComboxAnadirLista(int aId) {
		throw new UnsupportedOperationException();
	}
}