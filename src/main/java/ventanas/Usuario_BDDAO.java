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

public class Usuario_BDDAO {
	public static Usuario_BD loadUsuario_BDByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return loadUsuario_BDByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_BD getUsuario_BDByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return getUsuario_BDByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_BD loadUsuario_BDByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return loadUsuario_BDByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_BD getUsuario_BDByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return getUsuario_BDByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_BD loadUsuario_BDByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Usuario_BD) session.load(ventanas.Usuario_BD.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_BD getUsuario_BDByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Usuario_BD) session.get(ventanas.Usuario_BD.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_BD loadUsuario_BDByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_BD) session.load(ventanas.Usuario_BD.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_BD getUsuario_BDByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_BD) session.get(ventanas.Usuario_BD.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_BD(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return queryUsuario_BD(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_BD(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return queryUsuario_BD(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_BD[] listUsuario_BDByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return listUsuario_BDByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_BD[] listUsuario_BDByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return listUsuario_BDByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_BD(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ventanas.Usuario_BD as Usuario_BD");
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
	
	public static List queryUsuario_BD(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ventanas.Usuario_BD as Usuario_BD");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario_BD", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_BD[] listUsuario_BDByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuario_BD(session, condition, orderBy);
			return (Usuario_BD[]) list.toArray(new Usuario_BD[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_BD[] listUsuario_BDByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuario_BD(session, condition, orderBy, lockMode);
			return (Usuario_BD[]) list.toArray(new Usuario_BD[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_BD loadUsuario_BDByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return loadUsuario_BDByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_BD loadUsuario_BDByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return loadUsuario_BDByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_BD loadUsuario_BDByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Usuario_BD[] usuario_BDs = listUsuario_BDByQuery(session, condition, orderBy);
		if (usuario_BDs != null && usuario_BDs.length > 0)
			return usuario_BDs[0];
		else
			return null;
	}
	
	public static Usuario_BD loadUsuario_BDByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Usuario_BD[] usuario_BDs = listUsuario_BDByQuery(session, condition, orderBy, lockMode);
		if (usuario_BDs != null && usuario_BDs.length > 0)
			return usuario_BDs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuario_BDByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return iterateUsuario_BDByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_BDByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoSoftCykasPersistentManager.instance().getSession();
			return iterateUsuario_BDByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_BDByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ventanas.Usuario_BD as Usuario_BD");
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
	
	public static java.util.Iterator iterateUsuario_BDByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ventanas.Usuario_BD as Usuario_BD");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario_BD", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_BD createUsuario_BD() {
		return new ventanas.Usuario_BD();
	}
	
	public static boolean save(ventanas.Usuario_BD usuario_BD) throws PersistentException {
		try {
			ProyectoSoftCykasPersistentManager.instance().saveObject(usuario_BD);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(ventanas.Usuario_BD usuario_BD) throws PersistentException {
		try {
			ProyectoSoftCykasPersistentManager.instance().deleteObject(usuario_BD);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(ventanas.Usuario_BD usuario_BD) throws PersistentException {
		try {
			ProyectoSoftCykasPersistentManager.instance().getSession().refresh(usuario_BD);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(ventanas.Usuario_BD usuario_BD) throws PersistentException {
		try {
			ProyectoSoftCykasPersistentManager.instance().getSession().evict(usuario_BD);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_BD loadUsuario_BDByCriteria(Usuario_BDCriteria usuario_BDCriteria) {
		Usuario_BD[] usuario_BDs = listUsuario_BDByCriteria(usuario_BDCriteria);
		if(usuario_BDs == null || usuario_BDs.length == 0) {
			return null;
		}
		return usuario_BDs[0];
	}
	
	public static Usuario_BD[] listUsuario_BDByCriteria(Usuario_BDCriteria usuario_BDCriteria) {
		return usuario_BDCriteria.listUsuario_BD();
	}
}
