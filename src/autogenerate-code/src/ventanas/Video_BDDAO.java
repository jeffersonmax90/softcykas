/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: david(University of Almeria)
 * License Type: Academic
 */
package ventanas;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class Video_BDDAO {
	public static Video_BD loadVideo_BDByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return loadVideo_BDByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Video_BD getVideo_BDByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return getVideo_BDByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Video_BD loadVideo_BDByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return loadVideo_BDByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Video_BD getVideo_BDByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return getVideo_BDByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Video_BD loadVideo_BDByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Video_BD) session.load(ventanas.Video_BD.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Video_BD getVideo_BDByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Video_BD) session.get(ventanas.Video_BD.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Video_BD loadVideo_BDByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Video_BD) session.load(ventanas.Video_BD.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Video_BD getVideo_BDByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Video_BD) session.get(ventanas.Video_BD.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVideo_BD(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return queryVideo_BD(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVideo_BD(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return queryVideo_BD(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Video_BD[] listVideo_BDByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return listVideo_BDByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Video_BD[] listVideo_BDByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return listVideo_BDByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVideo_BD(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ventanas.Video_BD as Video_BD");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVideo_BD(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ventanas.Video_BD as Video_BD");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Video_BD", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Video_BD[] listVideo_BDByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryVideo_BD(session, condition, orderBy);
			return (Video_BD[]) list.toArray(new Video_BD[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Video_BD[] listVideo_BDByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryVideo_BD(session, condition, orderBy, lockMode);
			return (Video_BD[]) list.toArray(new Video_BD[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Video_BD loadVideo_BDByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return loadVideo_BDByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Video_BD loadVideo_BDByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return loadVideo_BDByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Video_BD loadVideo_BDByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Video_BD[] video_BDs = listVideo_BDByQuery(session, condition, orderBy);
		if (video_BDs != null && video_BDs.length > 0)
			return video_BDs[0];
		else
			return null;
	}
	
	public static Video_BD loadVideo_BDByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Video_BD[] video_BDs = listVideo_BDByQuery(session, condition, orderBy, lockMode);
		if (video_BDs != null && video_BDs.length > 0)
			return video_BDs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateVideo_BDByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return iterateVideo_BDByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVideo_BDByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return iterateVideo_BDByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVideo_BDByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ventanas.Video_BD as Video_BD");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVideo_BDByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ventanas.Video_BD as Video_BD");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Video_BD", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Video_BD createVideo_BD() {
		return new ventanas.Video_BD();
	}
	
	public static boolean save(ventanas.Video_BD video_BD) throws PersistentException {
		try {
			ProyectoSoftCykasPersistentManager.instance().saveObject(video_BD);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(ventanas.Video_BD video_BD) throws PersistentException {
		try {
			ProyectoSoftCykasPersistentManager.instance().deleteObject(video_BD);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ventanas.Video_BD video_BD)throws PersistentException {
		try {
			ventanas.Usuario_Registrado_BD[] lUsuarios = video_BD.usuario.toArray();
			for(int i = 0; i < lUsuarios.length; i++) {
				lUsuarios[i].me_gustas.remove(video_BD);
			}
			if (video_BD.getCategoria_BD() != null) {
				video_BD.getCategoria_BD().videos.remove(video_BD);
			}
			
			ventanas.Comentario_BD[] lComentarioss = video_BD.comentarios.toArray();
			for(int i = 0; i < lComentarioss.length; i++) {
				lComentarioss[i].setVideo(null);
			}
			ventanas.Lista_reproduccion_BD[] lListas_reproduccions = video_BD.listas_reproduccion.toArray();
			for(int i = 0; i < lListas_reproduccions.length; i++) {
				lListas_reproduccions[i].video.remove(video_BD);
			}
			ventanas.Historial_BD[] lHistorials = video_BD.historial.toArray();
			for(int i = 0; i < lHistorials.length; i++) {
				lHistorials[i].video.remove(video_BD);
			}
			if (video_BD.getPropietario() != null) {
				video_BD.getPropietario().video_subido.remove(video_BD);
			}
			
			return delete(video_BD);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ventanas.Video_BD video_BD, org.orm.PersistentSession session)throws PersistentException {
		try {
			ventanas.Usuario_Registrado_BD[] lUsuarios = video_BD.usuario.toArray();
			for(int i = 0; i < lUsuarios.length; i++) {
				lUsuarios[i].me_gustas.remove(video_BD);
			}
			if (video_BD.getCategoria_BD() != null) {
				video_BD.getCategoria_BD().videos.remove(video_BD);
			}
			
			ventanas.Comentario_BD[] lComentarioss = video_BD.comentarios.toArray();
			for(int i = 0; i < lComentarioss.length; i++) {
				lComentarioss[i].setVideo(null);
			}
			ventanas.Lista_reproduccion_BD[] lListas_reproduccions = video_BD.listas_reproduccion.toArray();
			for(int i = 0; i < lListas_reproduccions.length; i++) {
				lListas_reproduccions[i].video.remove(video_BD);
			}
			ventanas.Historial_BD[] lHistorials = video_BD.historial.toArray();
			for(int i = 0; i < lHistorials.length; i++) {
				lHistorials[i].video.remove(video_BD);
			}
			if (video_BD.getPropietario() != null) {
				video_BD.getPropietario().video_subido.remove(video_BD);
			}
			
			try {
				session.delete(video_BD);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(ventanas.Video_BD video_BD) throws PersistentException {
		try {
			ProyectoSoftCykasPersistentManager.instance().getSession().refresh(video_BD);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(ventanas.Video_BD video_BD) throws PersistentException {
		try {
			ProyectoSoftCykasPersistentManager.instance().getSession().evict(video_BD);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Video_BD loadVideo_BDByCriteria(Video_BDCriteria video_BDCriteria) {
		Video_BD[] video_BDs = listVideo_BDByCriteria(video_BDCriteria);
		if(video_BDs == null || video_BDs.length == 0) {
			return null;
		}
		return video_BDs[0];
	}
	
	public static Video_BD[] listVideo_BDByCriteria(Video_BDCriteria video_BDCriteria) {
		return video_BDCriteria.listVideo_BD();
	}
}
