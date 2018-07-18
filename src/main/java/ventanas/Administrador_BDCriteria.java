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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Administrador_BDCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression apodo;
	public final StringExpression contraseña;
	public final StringExpression miniatura;
	public final StringExpression email;
	public final StringExpression tipoUsuario;
	
	public Administrador_BDCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		apodo = new StringExpression("apodo", this);
		contraseña = new StringExpression("contraseña", this);
		miniatura = new StringExpression("miniatura", this);
		email = new StringExpression("email", this);
		tipoUsuario = new StringExpression("tipoUsuario", this);
	}
	
	public Administrador_BDCriteria(PersistentSession session) {
		this(session.createCriteria(Administrador_BD.class));
	}
	
	public Administrador_BDCriteria() throws PersistentException {
		this(ProyectoSoftCykasPersistentManager.instance().getSession());
	}
	
	public Administrador_BD uniqueAdministrador_BD() {
		return (Administrador_BD) super.uniqueResult();
	}
	
	public Administrador_BD[] listAdministrador_BD() {
		java.util.List list = super.list();
		return (Administrador_BD[]) list.toArray(new Administrador_BD[list.size()]);
	}
}

