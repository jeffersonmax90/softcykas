package ventanas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import ventanas.Comentario_BD;

public class BD_Comentarios {
	public BD_Principal _unnamed_BD_Principal_;
	public Vector<Comentario_BD> _comentarios = new Vector<Comentario_BD>();

	public boolean anadirComentario(int aId, String aComentario) throws PersistentException {
		boolean cat = false;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession()
				.beginTransaction();
		
		try {
			Comentario_BD com=Comentario_BDDAO.createComentario_BD();
			Usuario_Registrado_BD us = Usuario_Registrado_BDDAO.getUsuario_Registrado_BDByORMID(Datos_Navegante.getIdUsuario());
			com.setUsuario(us);
			Video_BD vid = Video_BDDAO.getVideo_BDByORMID( aId);
			com.setVideo(vid);
			com.setMensaje(aComentario);
			Date fecha = new Date();
			com.setFecha_subida(fecha);
			Comentario_BDDAO.save(com);
			t.commit();
			cat=true;
		}catch(Exception e) {
			t.rollback();
		}
		return cat;
	}

	public boolean anadirComentarioAdmin(int aId, String aComentario) {
		throw new UnsupportedOperationException();
	}

	public List<Comentario_BD> cargarListaComentariosRegistrado(int aId) throws PersistentException {
		List<Comentario_BD> lista = new ArrayList<Comentario_BD>();
		List<Comentario_BD> listaFinal = new ArrayList<Comentario_BD>();
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession()
				.beginTransaction();
		try {
			Video_BD v= Video_BDDAO.getVideo_BDByORMID(aId);
			
			//ordenar
			String nombre="Fecha_subida";
			lista = Comentario_BDDAO.queryComentario_BD(null, nombre);
			
			for(Comentario_BD c : lista) {
				if(c.getVideo().getId()== v.getId())
				listaFinal.add(c);
			}

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return listaFinal;
	}

	public List<Comentario_BD> anadirComentariosInvitado(int aId) {
		throw new UnsupportedOperationException();
	}

	public List<Comentario_BD> anadirComentariosReg(int aId) {
		throw new UnsupportedOperationException();
	}
	
	
	
	
	
	public boolean eliminarComentario(int aId) throws PersistentException {
		boolean correcto=false;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession()
				.beginTransaction();	
		try {
			
			Comentario_BD com =Comentario_BDDAO.loadComentario_BDByORMID(aId);
			int idVideo= com.getVideo().getId();
			
			Video_BDDAO.loadVideo_BDByORMID(idVideo).comentarios.remove(com);
			Usuario_Registrado_BDDAO.loadUsuario_Registrado_BDByORMID(com.getUsuario().getId()).comentarios.remove(com);
						
			
			Comentario_BDDAO.delete(com);
			correcto=true;
			t.commit();
		}catch(Exception e) {
			t.rollback();
		}
		return correcto;
	}
	

	public boolean eliminarComentarioAdmin(int aId) throws PersistentException {
		boolean correcto=false;
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession()
				.beginTransaction();	
		try {
			
			Comentario_BD com =Comentario_BDDAO.loadComentario_BDByORMID(aId);
			int idVideo= com.getVideo().getId();
			
			Video_BDDAO.loadVideo_BDByORMID(idVideo).comentarios.remove(com);
			Usuario_Registrado_BDDAO.loadUsuario_Registrado_BDByORMID(com.getUsuario().getId()).comentarios.remove(com);
						
			
			Comentario_BDDAO.delete(com);
			correcto=true;
			t.commit();
		}catch(Exception e) {
			t.rollback();
		}
		return correcto;
	}
	
	public List<Comentario_BD> cargarListaComentariosVideosPropios(int aId) throws PersistentException {
		List<Comentario_BD> lista = new ArrayList<Comentario_BD>();
		List<Comentario_BD> listaFinal = new ArrayList<Comentario_BD>();
		PersistentTransaction t = ventanas.ProyectoSoftCykasPersistentManager.instance().getSession()
				.beginTransaction();
		try {
			Video_BD v= Video_BDDAO.getVideo_BDByORMID(aId);
			
			//ordenar
			String nombre="Fecha_subida";
			lista = Comentario_BDDAO.queryComentario_BD(null, nombre);
			
			for(Comentario_BD c : lista) {
				if(c.getVideo().getId()== v.getId())
				listaFinal.add(c);
			}

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return listaFinal;
	}
}