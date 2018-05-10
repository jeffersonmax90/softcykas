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

public class Lista_reproduccion_BDDAO {
	public static Lista_reproduccion_BD loadLista_reproduccion_BDByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return loadLista_reproduccion_BDByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_reproduccion_BD getLista_reproduccion_BDByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return getLista_reproduccion_BDByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_reproduccion_BD loadLista_reproduccion_BDByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return loadLista_reproduccion_BDByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_reproduccion_BD getLista_reproduccion_BDByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return getLista_reproduccion_BDByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_reproduccion_BD loadLista_reproduccion_BDByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Lista_reproduccion_BD) session.load(ventanas.Lista_reproduccion_BD.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_reproduccion_BD getLista_reproduccion_BDByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Lista_reproduccion_BD) session.get(ventanas.Lista_reproduccion_BD.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_reproduccion_BD loadLista_reproduccion_BDByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Lista_reproduccion_BD) session.load(ventanas.Lista_reproduccion_BD.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_reproduccion_BD getLista_reproduccion_BDByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Lista_reproduccion_BD) session.get(ventanas.Lista_reproduccion_BD.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLista_reproduccion_BD(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return queryLista_reproduccion_BD(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLista_reproduccion_BD(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return queryLista_reproduccion_BD(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_reproduccion_BD[] listLista_reproduccion_BDByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return listLista_reproduccion_BDByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_reproduccion_BD[] listLista_reproduccion_BDByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return listLista_reproduccion_BDByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLista_reproduccion_BD(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ventanas.Lista_reproduccion_BD as Lista_reproduccion_BD");
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
	
	public static List queryLista_reproduccion_BD(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ventanas.Lista_reproduccion_BD as Lista_reproduccion_BD");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Lista_reproduccion_BD", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_reproduccion_BD[] listLista_reproduccion_BDByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryLista_reproduccion_BD(session, condition, orderBy);
			return (Lista_reproduccion_BD[]) list.toArray(new Lista_reproduccion_BD[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_reproduccion_BD[] listLista_reproduccion_BDByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryLista_reproduccion_BD(session, condition, orderBy, lockMode);
			return (Lista_reproduccion_BD[]) list.toArray(new Lista_reproduccion_BD[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_reproduccion_BD loadLista_reproduccion_BDByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return loadLista_reproduccion_BDByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_reproduccion_BD loadLista_reproduccion_BDByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return loadLista_reproduccion_BDByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_reproduccion_BD loadLista_reproduccion_BDByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Lista_reproduccion_BD[] lista_reproduccion_BDs = listLista_reproduccion_BDByQuery(session, condition, orderBy);
		if (lista_reproduccion_BDs != null && lista_reproduccion_BDs.length > 0)
			return lista_reproduccion_BDs[0];
		else
			return null;
	}
	
	public static Lista_reproduccion_BD loadLista_reproduccion_BDByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Lista_reproduccion_BD[] lista_reproduccion_BDs = listLista_reproduccion_BDByQuery(session, condition, orderBy, lockMode);
		if (lista_reproduccion_BDs != null && lista_reproduccion_BDs.length > 0)
			return lista_reproduccion_BDs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateLista_reproduccion_BDByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return iterateLista_reproduccion_BDByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLista_reproduccion_BDByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return iterateLista_reproduccion_BDByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLista_reproduccion_BDByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ventanas.Lista_reproduccion_BD as Lista_reproduccion_BD");
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
	
	public static java.util.Iterator iterateLista_reproduccion_BDByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ventanas.Lista_reproduccion_BD as Lista_reproduccion_BD");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Lista_reproduccion_BD", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_reproduccion_BD createLista_reproduccion_BD() {
		return new ventanas.Lista_reproduccion_BD();
	}
	
	public static boolean save(ventanas.Lista_reproduccion_BD lista_reproduccion_BD) throws PersistentException {
		try {
			ProyectoSoftCykasPersistentManager.instance().saveObject(lista_reproduccion_BD);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(ventanas.Lista_reproduccion_BD lista_reproduccion_BD) throws PersistentException {
		try {
			ProyectoSoftCykasPersistentManager.instance().deleteObject(lista_reproduccion_BD);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ventanas.Lista_reproduccion_BD lista_reproduccion_BD)throws PersistentException {
		try {
			if (lista_reproduccion_BD.getUsuario() != null) {
				lista_reproduccion_BD.getUsuario().listas_reproduccion.remove(lista_reproduccion_BD);
			}
			
			ventanas.Video_BD[] lVideos = lista_reproduccion_BD.video.toArray();
			for(int i = 0; i < lVideos.length; i++) {
				lVideos[i].listas_reproduccion.remove(lista_reproduccion_BD);
			}
			return delete(lista_reproduccion_BD);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ventanas.Lista_reproduccion_BD lista_reproduccion_BD, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (lista_reproduccion_BD.getUsuario() != null) {
				lista_reproduccion_BD.getUsuario().listas_reproduccion.remove(lista_reproduccion_BD);
			}
			
			ventanas.Video_BD[] lVideos = lista_reproduccion_BD.video.toArray();
			for(int i = 0; i < lVideos.length; i++) {
				lVideos[i].listas_reproduccion.remove(lista_reproduccion_BD);
			}
			try {
				session.delete(lista_reproduccion_BD);
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
	
	public static boolean refresh(ventanas.Lista_reproduccion_BD lista_reproduccion_BD) throws PersistentException {
		try {
			ProyectoSoftCykasPersistentManager.instance().getSession().refresh(lista_reproduccion_BD);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(ventanas.Lista_reproduccion_BD lista_reproduccion_BD) throws PersistentException {
		try {
			ProyectoSoftCykasPersistentManager.instance().getSession().evict(lista_reproduccion_BD);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_reproduccion_BD loadLista_reproduccion_BDByCriteria(Lista_reproduccion_BDCriteria lista_reproduccion_BDCriteria) {
		Lista_reproduccion_BD[] lista_reproduccion_BDs = listLista_reproduccion_BDByCriteria(lista_reproduccion_BDCriteria);
		if(lista_reproduccion_BDs == null || lista_reproduccion_BDs.length == 0) {
			return null;
		}
		return lista_reproduccion_BDs[0];
	}
	
	public static Lista_reproduccion_BD[] listLista_reproduccion_BDByCriteria(Lista_reproduccion_BDCriteria lista_reproduccion_BDCriteria) {
		return lista_reproduccion_BDCriteria.listLista_reproduccion_BD();
	}
}
