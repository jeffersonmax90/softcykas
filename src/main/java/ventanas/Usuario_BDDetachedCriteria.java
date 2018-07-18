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

public class Usuario_BDDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression apodo;
	public final StringExpression contraseña;
	public final StringExpression miniatura;
	public final StringExpression email;
	public final StringExpression tipoUsuario;
	
	public Usuario_BDDetachedCriteria() {
		super(ventanas.Usuario_BD.class, ventanas.Usuario_BDCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		apodo = new StringExpression("apodo", this.getDetachedCriteria());
		contraseña = new StringExpression("contraseña", this.getDetachedCriteria());
		miniatura = new StringExpression("miniatura", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		tipoUsuario = new StringExpression("tipoUsuario", this.getDetachedCriteria());
	}
	
	public Usuario_BDDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ventanas.Usuario_BDCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		apodo = new StringExpression("apodo", this.getDetachedCriteria());
		contraseña = new StringExpression("contraseña", this.getDetachedCriteria());
		miniatura = new StringExpression("miniatura", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		tipoUsuario = new StringExpression("tipoUsuario", this.getDetachedCriteria());
	}
	
	public Usuario_BD uniqueUsuario_BD(PersistentSession session) {
		return (Usuario_BD) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Usuario_BD[] listUsuario_BD(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Usuario_BD[]) list.toArray(new Usuario_BD[list.size()]);
	}
}

