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

public class Historial_BDDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression usuarioId;
	public final AssociationExpression usuario;
	public final StringExpression nombre;
	public final CollectionExpression video;
	
	public Historial_BDDetachedCriteria() {
		super(ventanas.Historial_BD.class, ventanas.Historial_BDCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		usuarioId = new IntegerExpression("usuario.", this.getDetachedCriteria());
		usuario = new AssociationExpression("usuario", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		video = new CollectionExpression("ORM_video", this.getDetachedCriteria());
	}
	
	public Historial_BDDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ventanas.Historial_BDCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		usuarioId = new IntegerExpression("usuario.", this.getDetachedCriteria());
		usuario = new AssociationExpression("usuario", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		video = new CollectionExpression("ORM_video", this.getDetachedCriteria());
	}
	
	public Usuario_Registrado_BDDetachedCriteria createUsuarioCriteria() {
		return new Usuario_Registrado_BDDetachedCriteria(createCriteria("usuario"));
	}
	
	public Video_BDDetachedCriteria createVideoCriteria() {
		return new Video_BDDetachedCriteria(createCriteria("ORM_video"));
	}
	
	public Historial_BD uniqueHistorial_BD(PersistentSession session) {
		return (Historial_BD) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Historial_BD[] listHistorial_BD(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Historial_BD[]) list.toArray(new Historial_BD[list.size()]);
	}
}

