package ventanas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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
			t.rollback();
			return correcto;
		}
		
		
		return correcto;
	}

	public boolean actualizarVideo(Video_BD aVideo) throws PersistentException {
		boolean modificado= false;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();
		Categoria_BD cat=null;
		for(Categoria_BD cate : Categoria_BDDAO.listCategoria_BDByQuery(null, null)) {
			if( (cate.getNombre().equals(aVideo.getCategoria_BD().getNombre()))
			 && (cate.getEdad().equals(aVideo.getCategoria_BD().getEdad()) )) {
				cat = cate;
			}
		}
		
		try {
			Video_BD video= Video_BDDAO.loadVideo_BDByORMID(aVideo.getId());
			video.setTitulo(aVideo.getTitulo());
			video.setCategoria_BD( aVideo.getCategoria_BD());
			video.setEtiqueta(aVideo.getEtiqueta());
			video.setRuta(aVideo.getRuta());
			video.setMiniatura(aVideo.getMiniatura());
			video.setDescripcion(aVideo.getDescripcion());
			t.commit();
			modificado=true;
			
		} catch (Exception e) {
			t.rollback();
		}
		return modificado;
	}

	@SuppressWarnings("rawtypes")
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

	@SuppressWarnings("unused")
	public boolean eliminarVideoSubido(int aId) throws PersistentException {
		boolean borrado=false;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();		
		try {
			Video_BD vid=Video_BDDAO.loadVideo_BDByORMID(aId);
			List<Usuario_Registrado_BD> usuarios=Arrays.asList(Usuario_Registrado_BDDAO.listUsuario_Registrado_BDByQuery(null, null));
			List<Lista_reproduccion_BD> listas=Arrays.asList(Lista_reproduccion_BDDAO.listLista_reproduccion_BDByQuery(null, null));
			List<Historial_BD> historials=Arrays.asList(Historial_BDDAO.listHistorial_BDByQuery(null, null));
			List<Comentario_BD> comentarios=Arrays.asList(Comentario_BDDAO.listComentario_BDByQuery(null, null));
						
			for(Usuario_Registrado_BD usuario:usuarios) {
				if(usuario.me_gustas.contains(vid)) {
					usuario.me_gustas.remove(vid);
				}
				if(usuario.video_subido.contains(vid)) {
					usuario.video_subido.remove(vid);
				}
				Usuario_Registrado_BDDAO.save(usuario);
			}
			for(Lista_reproduccion_BD lista:listas) {
				if(lista.video.contains(vid)) {
					lista.video.remove(vid);
				}
				Lista_reproduccion_BDDAO.save(lista);
			}
			for(Historial_BD historial:historials) {
				if(historial.video.contains(vid)) {
					historial.video.remove(vid);
				}
				Historial_BDDAO.save(historial);
			}
			for(Comentario_BD comentario:comentarios) {
				if(comentario.getVideo().equals(vid)) {
					Comentario_BDDAO.delete(comentario);
				}
				Comentario_BDDAO.save(comentario);
			}
			Video_BDDAO.delete(vid);
			t.commit();
			borrado= true;
			
		} catch (Exception e) {
			// TODO: handle exception
			t.rollback();
		}
		return borrado;
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
	
	public Video_BD cargarModificarVideo(int aId) throws PersistentException {
		Video_BD v=null;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();		
		try {
			v=Video_BDDAO.getVideo_BDByORMID(aId);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		
			return v;		
	}
	
	public List<Video_BD> buscarVideosPropios(String aNombre) {
		List<Video_BD> videos=new ArrayList<Video_BD>();
		
		try {
			PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();
			Video_BDCriteria cat= new Video_BDCriteria();
			cat.titulo.like("%"+ aNombre+"%");
			for (Video_BD v : Video_BDDAO.listVideo_BDByCriteria(cat)) {
				videos.add(v);
			}
		} catch (PersistentException e) {
			e.printStackTrace();
		}		
		return videos;
	}
	
	public Video_BD cargarFichaVideoRegistrado(int aId) throws PersistentException {
		Video_BD v=null;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();		
		try {
			v=Video_BDDAO.getVideo_BDByORMID(aId);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
			return v;		
	}


	public Video_BD cargarFichaVideoAdmin(int aId) {
		throw new UnsupportedOperationException();
	}

	public Video_BD cargarFichaVideoNoRegistrado(int aId) {
		throw new UnsupportedOperationException();
	}
}