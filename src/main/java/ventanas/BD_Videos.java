package ventanas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import ventanas.Video_BD;

public class BD_Videos {
	public BD_Principal _unnamed_BD_Principal_;
	public Vector<Video_BD> _videos = new Vector<Video_BD>();

	public boolean nuevoVideo(Video_BD aVideo) throws PersistentException {
		boolean correcto= false;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();
		Usuario_Registrado_BD usu= Usuario_Registrado_BDDAO.getUsuario_Registrado_BDByORMID(Datos_Navegante.getIdUsuario());
		Categoria_BD cat=null;
		for(Categoria_BD cate : Categoria_BDDAO.listCategoria_BDByQuery(null, null)) {
			if( (cate.getNombre().equals(aVideo.getCategoria_BD().getNombre()))
			 && (cate.getEdad().equals(aVideo.getCategoria_BD().getEdad()) )) {
				cat = cate;
			}
		}
		try {
			Video_BD v = Video_BDDAO.createVideo_BD();
			v.setPropietario(usu);				
			v.setTitulo(aVideo.getTitulo());			
			v.setCategoria_BD(cat);
			v.setEtiqueta(aVideo.getEtiqueta());
			v.setRuta(aVideo.getRuta());
			v.setMiniatura(aVideo.getMiniatura());
			v.setDescripcion(aVideo.getDescripcion());
			Date fecha = new Date();
			v.setFecha_subida(fecha);
			v.setVisualizaciones(0);
			v.setORM_Categoria_BD(cat);
			v.setORM_Propietario(usu);
				
						
			Video_BDDAO.save(v);		
			t.commit();
			correcto= true;
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			t.rollback();
			return correcto;
		}
		
		
		return correcto;
	}

	public boolean actualizarVideo(Video_BD aVideo) {
		throw new UnsupportedOperationException();
	}

	public List cargar_videos_tendencias() {
		throw new UnsupportedOperationException();
	}

	public boolean quitarVideo(int aId) {
		throw new UnsupportedOperationException();
	}

	public List<Video_BD> listarVideosTendencia() {
		throw new UnsupportedOperationException();
	}

	public List<Video_BD> cargarListaTotalVideosSubidos(int aId) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarVideoListaSubido(int aId) {
		throw new UnsupportedOperationException();
	}

	public List<Video_BD> buscarVideoListaTotal(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public List<Video_BD> listarVideosTendenciaAdmin() {
		throw new UnsupportedOperationException();
	}

	public List<Video_BD> cargarVideosPropios(int aId) throws PersistentException {
		List<Video_BD> lista= new ArrayList<Video_BD>();		
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();		
			Usuario_Registrado_BD u=Usuario_Registrado_BDDAO.getUsuario_Registrado_BDByORMID(aId);
			lista=Arrays.asList(u.video_subido.toArray());
			t.commit();
			return lista;				
	}

	public Video[] cargarVideosUsuariosRregistrados(int aId) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarVideoSubido(int aId) {
		throw new UnsupportedOperationException();
	}

	public Video[] listarVideosSuscripciones(int aId) {
		throw new UnsupportedOperationException();
	}

	public Video descargarVideoUA(int aId) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarVideo(int aId) {
		throw new UnsupportedOperationException();
	}

	public List<Video_BD> cargarListaUltimosVideosSubidos(int aId) {
		throw new UnsupportedOperationException();
	}

	public Video[] cargarListaUltimoVideosSubidos(int aId) {
		throw new UnsupportedOperationException();
	}

	public List<Video_BD> cargarListaUltimoVideosSubidosRegistrado(int aId) {
		throw new UnsupportedOperationException();
	}

	public List<Video_BD> cargarVideosRelacionados(int aId) {
		throw new UnsupportedOperationException();
	}

	public boolean meGusta(int aId, boolean aValor) {
		throw new UnsupportedOperationException();
	}

	public Video_BD descargarVideoUR(int aId) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarVideoUR(int aId) {
		throw new UnsupportedOperationException();
	}

	public List<Video_BD> cargarVideosSuscripciones(int aId) {
		throw new UnsupportedOperationException();
	}

	public List<Video_BD> cargarVideoUsuarioRegistrado(int aId) {
		throw new UnsupportedOperationException();
	}
}