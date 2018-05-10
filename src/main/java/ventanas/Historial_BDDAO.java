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

public class Historial_BDDAO {
	public static Historial_BD loadHistorial_BDByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return loadHistorial_BDByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historial_BD getHistorial_BDByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return getHistorial_BDByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historial_BD loadHistorial_BDByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return loadHistorial_BDByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historial_BD getHistorial_BDByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return getHistorial_BDByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historial_BD loadHistorial_BDByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Historial_BD) session.load(ventanas.Historial_BD.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historial_BD getHistorial_BDByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Historial_BD) session.get(ventanas.Historial_BD.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historial_BD loadHistorial_BDByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Historial_BD) session.load(ventanas.Historial_BD.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historial_BD getHistorial_BDByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Historial_BD) session.get(ventanas.Historial_BD.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHistorial_BD(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return queryHistorial_BD(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHistorial_BD(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return queryHistorial_BD(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historial_BD[] listHistorial_BDByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return listHistorial_BDByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historial_BD[] listHistorial_BDByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return listHistorial_BDByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryHistorial_BD(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ventanas.Historial_BD as Historial_BD");
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
	
	public static List queryHistorial_BD(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ventanas.Historial_BD as Historial_BD");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Historial_BD", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historial_BD[] listHistorial_BDByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryHistorial_BD(session, condition, orderBy);
			return (Historial_BD[]) list.toArray(new Historial_BD[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historial_BD[] listHistorial_BDByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryHistorial_BD(session, condition, orderBy, lockMode);
			return (Historial_BD[]) list.toArray(new Historial_BD[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historial_BD loadHistorial_BDByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return loadHistorial_BDByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historial_BD loadHistorial_BDByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return loadHistorial_BDByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historial_BD loadHistorial_BDByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Historial_BD[] historial_BDs = listHistorial_BDByQuery(session, condition, orderBy);
		if (historial_BDs != null && historial_BDs.length > 0)
			return historial_BDs[0];
		else
			return null;
	}
	
	public static Historial_BD loadHistorial_BDByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Historial_BD[] historial_BDs = listHistorial_BDByQuery(session, condition, orderBy, lockMode);
		if (historial_BDs != null && historial_BDs.length > 0)
			return historial_BDs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateHistorial_BDByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return iterateHistorial_BDByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHistorial_BDByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return iterateHistorial_BDByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHistorial_BDByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ventanas.Historial_BD as Historial_BD");
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
	
	public static java.util.Iterator iterateHistorial_BDByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ventanas.Historial_BD as Historial_BD");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Historial_BD", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historial_BD createHistorial_BD() {
		return new ventanas.Historial_BD();
	}
	
	public static boolean save(ventanas.Historial_BD historial_BD) throws PersistentException {
		try {
			ProyectoSoftCykasPersistentManager.instance().saveObject(historial_BD);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(ventanas.Historial_BD historial_BD) throws PersistentException {
		try {
			ProyectoSoftCykasPersistentManager.instance().deleteObject(historial_BD);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ventanas.Historial_BD historial_BD)throws PersistentException {
		try {
			if (historial_BD.getUsuario() != null) {
				historial_BD.getUsuario().historial.remove(historial_BD);
			}
			
			ventanas.Video_BD[] lVideos = historial_BD.video.toArray();
			for(int i = 0; i < lVideos.length; i++) {
				lVideos[i].historial.remove(historial_BD);
			}
			return delete(historial_BD);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ventanas.Historial_BD historial_BD, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (historial_BD.getUsuario() != null) {
				historial_BD.getUsuario().historial.remove(historial_BD);
			}
			
			ventanas.Video_BD[] lVideos = historial_BD.video.toArray();
			for(int i = 0; i < lVideos.length; i++) {
				lVideos[i].historial.remove(historial_BD);
			}
			try {
				session.delete(historial_BD);
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
	
	public static boolean refresh(ventanas.Historial_BD historial_BD) throws PersistentException {
		try {
			ProyectoSoftCykasPersistentManager.instance().getSession().refresh(historial_BD);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(ventanas.Historial_BD historial_BD) throws PersistentException {
		try {
			ProyectoSoftCykasPersistentManager.instance().getSession().evict(historial_BD);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Historial_BD loadHistorial_BDByCriteria(Historial_BDCriteria historial_BDCriteria) {
		Historial_BD[] historial_BDs = listHistorial_BDByCriteria(historial_BDCriteria);
		if(historial_BDs == null || historial_BDs.length == 0) {
			return null;
		}
		return historial_BDs[0];
	}
	
	public static Historial_BD[] listHistorial_BDByCriteria(Historial_BDCriteria historial_BDCriteria) {
		return historial_BDCriteria.listHistorial_BD();
	}
}
