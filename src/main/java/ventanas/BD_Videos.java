package ventanas;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import ventanas.Video_BD;
import ventanas.Video;
import ventanas.Lista_videos_subidos;
import java.util.List;

public class BD_Videos {
	public BD_Principal _bD_Principal;
	public Vector<Video_BD> _videos = new Vector<Video_BD>();

	public boolean nuevoVideo(Video_BD aVideo) throws PersistentException {
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();
		try {
			Categoria_BD c= new Categoria_BD();
			aVideo.setORM_Categoria_BD(c);
			Usuario_Registrado_BD u= new Usuario_Registrado_BD();
			aVideo.setORM_Propietario(u);			
			
			
			Video_BDDAO.save(aVideo);
			
			
			t.commit();
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			t.rollback();
			return false;
		}
		
		
		return true;
	}

	public boolean actualizarVideo(Video_BD aVideo) {
		throw new UnsupportedOperationException();
	}

	public List cargar_videos_tendencias() {
		throw new UnsupportedOperationException();
	}

	public void quitarVideo(int aId) {
		throw new UnsupportedOperationException();
	}

	public Video[] listarVideosTendencia(int aId) {
		throw new UnsupportedOperationException();
	}

	public Video[] cargarListaTotalVideosSubidos(int aId) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarVideoListaSubido(int aId) {
		throw new UnsupportedOperationException();
	}

	public Video[] buscarVideoListaTotal(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public Video[] listarVideosTendenciaAdmin(int aId) {
		throw new UnsupportedOperationException();
	}

	public Lista_videos_subidos[] cargarVideosPropios(int aId) {
		throw new UnsupportedOperationException();
	}

	public Video[] cargarVideosUsuariosRregistrados(int aId) {
		throw new UnsupportedOperationException();
	}

	public void eliminarVideoSubido(int aId) {
		throw new UnsupportedOperationException();
	}

	public Video[] listarVideosSuscripciones(int aId) {
		throw new UnsupportedOperationException();
	}

	public Video descargarVideoUA(int aId) {
		throw new UnsupportedOperationException();
	}

	public void eliminarVideo(int aId) {
		throw new UnsupportedOperationException();
	}

	public Video[] cargarListaUltimosVideosSubidos(int aId) {
		throw new UnsupportedOperationException();
	}

	public Video[] cargarListaUltimoVideosSubidos(int aId) {
		throw new UnsupportedOperationException();
	}

	public Video[] cargarListaUltimoVideosSubidosRegistrado(int aId) {
		throw new UnsupportedOperationException();
	}

	public Video[] cargarVideosRelacionados(int aId) {
		throw new UnsupportedOperationException();
	}

	public boolean meGusta(int aId, boolean aValor) {
		throw new UnsupportedOperationException();
	}

	public Video_BD descargarVideoUR(int aId) {
		throw new UnsupportedOperationException();
	}

	public void eliminarVideoUR(int aId) {
		throw new UnsupportedOperationException();
	}
}