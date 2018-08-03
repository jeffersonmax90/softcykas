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
	public List cargarVideosTendencias() throws PersistentException {
		List<Video_BD> lista=null;
		List<Integer> mg =new ArrayList<Integer>();
		List<Video_BD>res = new ArrayList<Video_BD>();
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();		
		try {
			lista = Video_BDDAO.queryVideo_BD(null, null);
			for(Video_BD vid : lista){
				mg.add(new Integer(vid.usuario.size()));
			}
			//ahora hay que recorrer la lista de me gusta para ver cual es el indice que mas me gusta tiene. el que mas tenga, se añadira el video a la 
			//lista de resutlados en primera posicion, asi sucesivamente...
			while(!mg.isEmpty()) {
				int  vMax = -1;
				int indiceMax = -1;
				for(int i = 0 ; i<mg.size();i++) {
					int valor=mg.get(i);
					if(valor>vMax) {
						vMax = valor;
						indiceMax=i;
					}
				}
				//se saca el mayor indice y por lo tanto el video se añade a la lista de resultados en primer lugar
				res.add(lista.remove(indiceMax));
				mg.remove(indiceMax);
			}
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		List<Video_BD>def = new ArrayList<Video_BD>();
		int contador = 0;
		for(Video_BD video : res) {
			if(contador==10) {
				break;
			}
			def.add(video);
			contador++;
		}
		return def;
		
	}

	public boolean quitarVideo(int aId) {
		throw new UnsupportedOperationException();
	}


	public List<Video_BD> cargarListaTotalVideosSubidos(int aId) throws PersistentException {
		List<Video_BD> lista=null;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();		
		try {
			String nombre="Fecha_subida";
			lista = Video_BDDAO.queryVideo_BD(null,nombre);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return lista;
		
	}

	public boolean eliminarVideoListaSubido(int aId) {
		throw new UnsupportedOperationException();
	}

	public List<Video_BD> buscarVideoListaTotal(String aNombre) {
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

	public List<Video_BD> cargarListaUltimosVideosSubidos(int aId) throws PersistentException {
		List<Video_BD> lista=new ArrayList<Video_BD>();
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();		
		try {	
			Video_BDCriteria crit = new Video_BDCriteria();
			crit.fecha_subida.order(false);
			
			for(Video_BD v : crit.listVideo_BD()) {
				lista.add(v);
			}
	
			t.commit();
		}catch(Exception e) {
			t.rollback();
		}
		List<Video_BD>def = new ArrayList<Video_BD>();
		int contador = 0;
			for(Video_BD video : lista) {
				if(contador==10) {
					break;
				}
				def.add(video);
				contador++;
			}
			return def;
	}

	public List<Video_BD> cargarListaUltimoVideosSubidosRegistrado(int aId) throws PersistentException {
		//TODO
		throw new UnsupportedOperationException();

		}

	public List<Video_BD> cargarVideosRelacionados(int aId) throws PersistentException {
		List<Video_BD> lista=new ArrayList<Video_BD>();
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();		
		try {
			Usuario_Registrado_BD usuario = Usuario_Registrado_BDDAO.getUsuario_Registrado_BDByORMID(Datos_Navegante.getIdUsuario());
			int n= usuario.getHistorial().getId();
			int i= usuario.getId();
			Historial_BD h= Historial_BDDAO.getHistorial_BDByORMID(i);
			Video_BD [] videos =  h.video.toArray();
			int ultimo = videos.length -1;
			Video_BD vultimo = videos[ultimo];
			Categoria_BD categoria = Categoria_BDDAO.getCategoria_BDByORMID(vultimo.getCategoria_BD().getId());
			for( Video_BD a : Video_BDDAO.listVideo_BDByQuery(null,null)) {
				if(a.getCategoria_BD().equals(categoria) && a.getPropietario().getId()!=Datos_Navegante.getIdUsuario()) {
					lista.add(a);
				}
			}
			
			t.commit();
		}catch(Exception e) {
			t.rollback();
		}
		List<Video_BD>def = new ArrayList<Video_BD>();
		int contador = 0;
		for(Video_BD video : lista) {
			if(contador==10) {
				break;
			}
			def.add(video);
			contador++;
		}
		return def;
	}

	public boolean meGusta(int aIdUsuario, int aIdVideo) throws PersistentException {
		boolean megusta=false;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();		
		try {
			Video_BD video = Video_BDDAO.getVideo_BDByORMID(aIdVideo);
			if(Usuario_Registrado_BDDAO.getUsuario_Registrado_BDByORMID(aIdUsuario).me_gustas.contains(video)){
				Usuario_Registrado_BDDAO.getUsuario_Registrado_BDByORMID(aIdUsuario).me_gustas.remove(video);
				megusta=false;
			}else {
				Usuario_Registrado_BDDAO.getUsuario_Registrado_BDByORMID(aIdUsuario).me_gustas.add(video);
				megusta=true;
			}
			t.commit();
		} catch (Exception e) {
			
		}
		
		return megusta;
	}

	public Video_BD descargarVideoUR(int aId) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarVideoUR(int aId) {
		throw new UnsupportedOperationException();
	}

	public List<Video_BD> cargarVideosSuscripciones(int aId) throws PersistentException {
		List<Video_BD> lista=new ArrayList<Video_BD>();
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();		
		try {
			Usuario_Registrado_BD usuario = Usuario_Registrado_BDDAO.getUsuario_Registrado_BDByORMID(aId);
			for(Usuario_Registrado_BD sus : usuario.suscrito.toArray()) {
				try {			
					int ultimo = sus.video_subido.toArray().length -1;
					lista.add(sus.video_subido.toArray()[ultimo]);				
				}catch(Exception e) {					
				}
			}			
			t.commit();
		}catch(Exception e) {
			t.rollback();
		}
		List<Video_BD>listaFinal = new ArrayList<Video_BD>();
		int contador = 0;
		for(Video_BD video : lista) {
			if(contador==10) {
				break;
			}
			listaFinal.add(video);
			contador++;
		}
		return listaFinal;
	}

	public List<Video_BD> cargarVideoUsuarioRegistrado(int aId) throws PersistentException {
		List<Video_BD> lista= new ArrayList<Video_BD>();		
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();		
			Usuario_Registrado_BD u=Usuario_Registrado_BDDAO.getUsuario_Registrado_BDByORMID(aId);
			lista=Arrays.asList(u.video_subido.toArray());
			
			t.commit();
			return lista;	
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
			Usuario_Registrado_BD usu= Usuario_Registrado_BDDAO.getUsuario_Registrado_BDByORMID(Datos_Navegante.getIdUsuario());
			
			//anade historial 
			Historial_BD h= Historial_BDDAO.getHistorial_BDByORMID(usu.getHistorial().getId());
			h.video.add(v);
		
			
			int nVisualizaciones=v.getVisualizaciones();
			int total= nVisualizaciones+1;
			v.setVisualizaciones(total);
			
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
	public List<Video_BD> cargarListaUltimosVideos(int aId) throws PersistentException {
		List<Video_BD> lista2= new ArrayList<Video_BD>();
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();		
		try {			
			
			Usuario_Registrado_BD u=Usuario_Registrado_BDDAO.getUsuario_Registrado_BDByORMID(aId);
			
			Video_BDCriteria crit = new Video_BDCriteria();
			crit.fecha_subida.order(true);
		
			for(Video_BD v :crit.listVideo_BD()) {
				if(v.getPropietario().getId()==u.getId())
				lista2.add(v);
			}
			
			t.commit();
		}catch(Exception e) {
			t.rollback();
		}
		
		List<Video_BD>listafinal = new ArrayList<Video_BD>();
		int m=0;
		for (int i = lista2.size()-1; i >=0 ; i--) {
			if(m==10) {
				break;
			}
			listafinal.add(lista2.get(i));
			m++;
		}
		
		
		return listafinal;
	
	
	
	}
	public boolean anadirVideoLista(int aId, String aNombre) throws PersistentException {
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();		
		boolean correcto=false;
		try {
			Lista_reproduccion_BD lista= Lista_reproduccion_BDDAO.loadLista_reproduccion_BDByQuery("Lista_reproduccion_BD.nombre='"+aNombre+"'", null);
			Video_BD v= Video_BDDAO.getVideo_BDByORMID(aId);
			lista.video.add(v);
			v.listas_reproduccion.add(lista);
			Lista_reproduccion_BDDAO.save(lista);
			Video_BDDAO.save(v);
			t.commit();
			correcto= true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return correcto;
	}
	public List<Video_BD> cargarVideosListaReproduccionPropia(int aId) throws PersistentException {
		List<Video_BD> lista= new ArrayList<Video_BD>();
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession().beginTransaction();		
		try {
				Lista_reproduccion_BD u=Lista_reproduccion_BDDAO.getLista_reproduccion_BDByORMID(aId);
				lista=Arrays.asList(u.video.toArray());
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return lista;
	}
}