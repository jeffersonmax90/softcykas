/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Jefferson T(University of Almeria)
 * License Type: Academic
 */
package ventanas;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class Usuario_Registrado_BDDAO {
	public static Usuario_Registrado_BD loadUsuario_Registrado_BDByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return loadUsuario_Registrado_BDByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado_BD getUsuario_Registrado_BDByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return getUsuario_Registrado_BDByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado_BD loadUsuario_Registrado_BDByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return loadUsuario_Registrado_BDByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado_BD getUsuario_Registrado_BDByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return getUsuario_Registrado_BDByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado_BD loadUsuario_Registrado_BDByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Usuario_Registrado_BD) session.load(ventanas.Usuario_Registrado_BD.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado_BD getUsuario_Registrado_BDByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Usuario_Registrado_BD) session.get(ventanas.Usuario_Registrado_BD.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado_BD loadUsuario_Registrado_BDByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_Registrado_BD) session.load(ventanas.Usuario_Registrado_BD.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado_BD getUsuario_Registrado_BDByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_Registrado_BD) session.get(ventanas.Usuario_Registrado_BD.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_Registrado_BD(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return queryUsuario_Registrado_BD(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_Registrado_BD(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return queryUsuario_Registrado_BD(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado_BD[] listUsuario_Registrado_BDByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return listUsuario_Registrado_BDByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado_BD[] listUsuario_Registrado_BDByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return listUsuario_Registrado_BDByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_Registrado_BD(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ventanas.Usuario_Registrado_BD as Usuario_Registrado_BD");
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
	
	public static List queryUsuario_Registrado_BD(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ventanas.Usuario_Registrado_BD as Usuario_Registrado_BD");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario_Registrado_BD", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado_BD[] listUsuario_Registrado_BDByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuario_Registrado_BD(session, condition, orderBy);
			return (Usuario_Registrado_BD[]) list.toArray(new Usuario_Registrado_BD[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado_BD[] listUsuario_Registrado_BDByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuario_Registrado_BD(session, condition, orderBy, lockMode);
			return (Usuario_Registrado_BD[]) list.toArray(new Usuario_Registrado_BD[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado_BD loadUsuario_Registrado_BDByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return loadUsuario_Registrado_BDByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado_BD loadUsuario_Registrado_BDByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return loadUsuario_Registrado_BDByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado_BD loadUsuario_Registrado_BDByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Usuario_Registrado_BD[] usuario_Registrado_BDs = listUsuario_Registrado_BDByQuery(session, condition, orderBy);
		if (usuario_Registrado_BDs != null && usuario_Registrado_BDs.length > 0)
			return usuario_Registrado_BDs[0];
		else
			return null;
	}
	
	public static Usuario_Registrado_BD loadUsuario_Registrado_BDByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Usuario_Registrado_BD[] usuario_Registrado_BDs = listUsuario_Registrado_BDByQuery(session, condition, orderBy, lockMode);
		if (usuario_Registrado_BDs != null && usuario_Registrado_BDs.length > 0)
			return usuario_Registrado_BDs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuario_Registrado_BDByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return iterateUsuario_Registrado_BDByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_Registrado_BDByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return iterateUsuario_Registrado_BDByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_Registrado_BDByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ventanas.Usuario_Registrado_BD as Usuario_Registrado_BD");
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
	
	public static java.util.Iterator iterateUsuario_Registrado_BDByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ventanas.Usuario_Registrado_BD as Usuario_Registrado_BD");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario_Registrado_BD", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado_BD createUsuario_Registrado_BD() {
		return new ventanas.Usuario_Registrado_BD();
	}
	
	public static boolean save(ventanas.Usuario_Registrado_BD usuario_Registrado_BD) throws PersistentException {
		try {
			ProyectoSoftCykasPersistentManager.instance().saveObject(usuario_Registrado_BD);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(ventanas.Usuario_Registrado_BD usuario_Registrado_BD) throws PersistentException {
		try {
			ProyectoSoftCykasPersistentManager.instance().deleteObject(usuario_Registrado_BD);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ventanas.Usuario_Registrado_BD usuario_Registrado_BD)throws PersistentException {
		try {
			if (usuario_Registrado_BD.getHistorial() != null) {
				usuario_Registrado_BD.getHistorial().setUsuario(null);
			}
			
			ventanas.Usuario_Registrado_BD[] lSuscriptors = usuario_Registrado_BD.suscriptor.toArray();
			for(int i = 0; i < lSuscriptors.length; i++) {
				lSuscriptors[i].suscrito.remove(usuario_Registrado_BD);
			}
			ventanas.Usuario_Registrado_BD[] lSuscritos = usuario_Registrado_BD.suscrito.toArray();
			for(int i = 0; i < lSuscritos.length; i++) {
				lSuscritos[i].suscriptor.remove(usuario_Registrado_BD);
			}
			ventanas.Video_BD[] lMe_gustass = usuario_Registrado_BD.me_gustas.toArray();
			for(int i = 0; i < lMe_gustass.length; i++) {
				lMe_gustass[i].usuario.remove(usuario_Registrado_BD);
			}
			ventanas.Lista_reproduccion_BD[] lListas_reproduccions = usuario_Registrado_BD.listas_reproduccion.toArray();
			for(int i = 0; i < lListas_reproduccions.length; i++) {
				lListas_reproduccions[i].setUsuario(null);
			}
			ventanas.Comentario_BD[] lComentarioss = usuario_Registrado_BD.comentarios.toArray();
			for(int i = 0; i < lComentarioss.length; i++) {
				lComentarioss[i].setUsuario(null);
			}
			ventanas.Video_BD[] lVideo_subidos = usuario_Registrado_BD.video_subido.toArray();
			for(int i = 0; i < lVideo_subidos.length; i++) {
				lVideo_subidos[i].setPropietario(null);
			}
			return delete(usuario_Registrado_BD);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ventanas.Usuario_Registrado_BD usuario_Registrado_BD, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (usuario_Registrado_BD.getHistorial() != null) {
				usuario_Registrado_BD.getHistorial().setUsuario(null);
			}
			
			ventanas.Usuario_Registrado_BD[] lSuscriptors = usuario_Registrado_BD.suscriptor.toArray();
			for(int i = 0; i < lSuscriptors.length; i++) {
				lSuscriptors[i].suscrito.remove(usuario_Registrado_BD);
			}
			ventanas.Usuario_Registrado_BD[] lSuscritos = usuario_Registrado_BD.suscrito.toArray();
			for(int i = 0; i < lSuscritos.length; i++) {
				lSuscritos[i].suscriptor.remove(usuario_Registrado_BD);
			}
			ventanas.Video_BD[] lMe_gustass = usuario_Registrado_BD.me_gustas.toArray();
			for(int i = 0; i < lMe_gustass.length; i++) {
				lMe_gustass[i].usuario.remove(usuario_Registrado_BD);
			}
			ventanas.Lista_reproduccion_BD[] lListas_reproduccions = usuario_Registrado_BD.listas_reproduccion.toArray();
			for(int i = 0; i < lListas_reproduccions.length; i++) {
				lListas_reproduccions[i].setUsuario(null);
			}
			ventanas.Comentario_BD[] lComentarioss = usuario_Registrado_BD.comentarios.toArray();
			for(int i = 0; i < lComentarioss.length; i++) {
				lComentarioss[i].setUsuario(null);
			}
			ventanas.Video_BD[] lVideo_subidos = usuario_Registrado_BD.video_subido.toArray();
			for(int i = 0; i < lVideo_subidos.length; i++) {
				lVideo_subidos[i].setPropietario(null);
			}
			try {
				session.delete(usuario_Registrado_BD);
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
	
	public static boolean refresh(ventanas.Usuario_Registrado_BD usuario_Registrado_BD) throws PersistentException {
		try {
			ProyectoSoftCykasPersistentManager.instance().getSession().refresh(usuario_Registrado_BD);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(ventanas.Usuario_Registrado_BD usuario_Registrado_BD) throws PersistentException {
		try {
			ProyectoSoftCykasPersistentManager.instance().getSession().evict(usuario_Registrado_BD);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_Registrado_BD loadUsuario_Registrado_BDByCriteria(Usuario_Registrado_BDCriteria usuario_Registrado_BDCriteria) {
		Usuario_Registrado_BD[] usuario_Registrado_BDs = listUsuario_Registrado_BDByCriteria(usuario_Registrado_BDCriteria);
		if(usuario_Registrado_BDs == null || usuario_Registrado_BDs.length == 0) {
			return null;
		}
		return usuario_Registrado_BDs[0];
	}
	
	public static Usuario_Registrado_BD[] listUsuario_Registrado_BDByCriteria(Usuario_Registrado_BDCriteria usuario_Registrado_BDCriteria) {
		return usuario_Registrado_BDCriteria.listUsuario_Registrado_BD();
	}
}
