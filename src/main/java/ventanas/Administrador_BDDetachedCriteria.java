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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Administrador_BDDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression apodo;
	public final StringExpression contraseña;
	public final StringExpression miniatura;
	public final StringExpression email;
	
	public Administrador_BDDetachedCriteria() {
		super(ventanas.Administrador_BD.class, ventanas.Administrador_BDCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		apodo = new StringExpression("apodo", this.getDetachedCriteria());
		contraseña = new StringExpression("contraseña", this.getDetachedCriteria());
		miniatura = new StringExpression("miniatura", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
	}
	
	public Administrador_BDDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ventanas.Administrador_BDCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		apodo = new StringExpression("apodo", this.getDetachedCriteria());
		contraseña = new StringExpression("contraseña", this.getDetachedCriteria());
		miniatura = new StringExpression("miniatura", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
	}
	
	public Administrador_BD uniqueAdministrador_BD(PersistentSession session) {
		return (Administrador_BD) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Administrador_BD[] listAdministrador_BD(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Administrador_BD[]) list.toArray(new Administrador_BD[list.size()]);
	}
}

