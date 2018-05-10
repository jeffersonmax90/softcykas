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

public class Administrador_BDDAO {
	public static Administrador_BD loadAdministrador_BDByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return loadAdministrador_BDByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador_BD getAdministrador_BDByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return getAdministrador_BDByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador_BD loadAdministrador_BDByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return loadAdministrador_BDByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador_BD getAdministrador_BDByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return getAdministrador_BDByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador_BD loadAdministrador_BDByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Administrador_BD) session.load(ventanas.Administrador_BD.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador_BD getAdministrador_BDByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Administrador_BD) session.get(ventanas.Administrador_BD.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador_BD loadAdministrador_BDByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Administrador_BD) session.load(ventanas.Administrador_BD.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador_BD getAdministrador_BDByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Administrador_BD) session.get(ventanas.Administrador_BD.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrador_BD(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return queryAdministrador_BD(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrador_BD(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return queryAdministrador_BD(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador_BD[] listAdministrador_BDByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return listAdministrador_BDByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador_BD[] listAdministrador_BDByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return listAdministrador_BDByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAdministrador_BD(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ventanas.Administrador_BD as Administrador_BD");
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
	
	public static List queryAdministrador_BD(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ventanas.Administrador_BD as Administrador_BD");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Administrador_BD", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador_BD[] listAdministrador_BDByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAdministrador_BD(session, condition, orderBy);
			return (Administrador_BD[]) list.toArray(new Administrador_BD[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador_BD[] listAdministrador_BDByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAdministrador_BD(session, condition, orderBy, lockMode);
			return (Administrador_BD[]) list.toArray(new Administrador_BD[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador_BD loadAdministrador_BDByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return loadAdministrador_BDByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador_BD loadAdministrador_BDByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return loadAdministrador_BDByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador_BD loadAdministrador_BDByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Administrador_BD[] administrador_BDs = listAdministrador_BDByQuery(session, condition, orderBy);
		if (administrador_BDs != null && administrador_BDs.length > 0)
			return administrador_BDs[0];
		else
			return null;
	}
	
	public static Administrador_BD loadAdministrador_BDByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Administrador_BD[] administrador_BDs = listAdministrador_BDByQuery(session, condition, orderBy, lockMode);
		if (administrador_BDs != null && administrador_BDs.length > 0)
			return administrador_BDs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAdministrador_BDByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return iterateAdministrador_BDByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministrador_BDByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return iterateAdministrador_BDByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAdministrador_BDByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ventanas.Administrador_BD as Administrador_BD");
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
	
	public static java.util.Iterator iterateAdministrador_BDByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ventanas.Administrador_BD as Administrador_BD");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Administrador_BD", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador_BD createAdministrador_BD() {
		return new ventanas.Administrador_BD();
	}
	
	public static boolean save(ventanas.Administrador_BD administrador_BD) throws PersistentException {
		try {
			ProyectoSoftCykasPersistentManager.instance().saveObject(administrador_BD);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(ventanas.Administrador_BD administrador_BD) throws PersistentException {
		try {
			ProyectoSoftCykasPersistentManager.instance().deleteObject(administrador_BD);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(ventanas.Administrador_BD administrador_BD) throws PersistentException {
		try {
			ProyectoSoftCykasPersistentManager.instance().getSession().refresh(administrador_BD);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(ventanas.Administrador_BD administrador_BD) throws PersistentException {
		try {
			ProyectoSoftCykasPersistentManager.instance().getSession().evict(administrador_BD);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Administrador_BD loadAdministrador_BDByCriteria(Administrador_BDCriteria administrador_BDCriteria) {
		Administrador_BD[] administrador_BDs = listAdministrador_BDByCriteria(administrador_BDCriteria);
		if(administrador_BDs == null || administrador_BDs.length == 0) {
			return null;
		}
		return administrador_BDs[0];
	}
	
	public static Administrador_BD[] listAdministrador_BDByCriteria(Administrador_BDCriteria administrador_BDCriteria) {
		return administrador_BDCriteria.listAdministrador_BD();
	}
}
